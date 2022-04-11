package controllers;

import actors.SearchResultActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import play.mvc.*;

import javax.inject.Inject;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import static akka.pattern.Patterns.ask;
import static jdk.nashorn.internal.runtime.Context.getContext;

import scala.compat.java8.FutureConverters;
import businesslogic.*;

import model.Resultlist;
import model.Profile;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 * @author Group Task
 */
public class HomeController extends Controller {

	LinkedHashMap<String, Resultlist> resultmap = new LinkedHashMap<String, Resultlist>();
	LinkedHashMap<String, Integer> indStats = new LinkedHashMap<String, Integer>();
	LinkedHashMap<String, Profile> usermap = new LinkedHashMap<String, Profile>();
//	SearchPhrase searchphrase = new SearchPhrase();
//  SearchSkill searchskill = new SearchSkill();
//	WordStats wordStats = new WordStats();
//	SearchProfile searchprofile = new SearchProfile();
	SearchFleschIndex sfi = new SearchFleschIndex();
    Session session = new Session();

	private ActorRef searchPhraseActor;
//	private ActorRef childSearchPhraseActor;
	private final ActorRef searchResultActor;
	private final ActorRef profileActor;
	private final ActorRef skillActor;
	private final ActorRef statsActor;
//	private final LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

	@Inject
	public HomeController(ActorSystem system) {
		//this.searchPhraseActor = system.actorOf(SearchPhrase.getProps());
		this.searchResultActor = system.actorOf(SearchResultActor.getProps());
		this.profileActor = system.actorOf(SearchProfile.getProps());
		this.skillActor = system.actorOf(SearchSkill.getProps());
		this.statsActor = system.actorOf(WordStats.getProps());
	}


	/**
	 * An action that renders an HTML page with a welcome message.
	 * The configuration in the <code>routes</code> file means that
	 * this method will be called when the application receives a
	 * <code>GET</code> request with a path of <code>/</code>.
	 * @param searchPhraseString Search string entered by user
	 * @return Loads the html page containing the search results
	 */
	@Inject
	ActorSystem system = ActorSystem.create("FreeLancelot");
    public CompletionStage<Result> index(Http.Request request,String searchPhraseString,String sessionId) {

		if(searchPhraseString.equals("")) {
			searchPhraseActor = null;
        	return CompletableFuture.completedFuture(ok(views.html.index.render(request,null)));
        }else {
			if(searchPhraseActor == null){
				searchPhraseActor = system.actorOf(SearchPhrase.props(sessionId));
				System.out.println("[INFO] new Actor Created"+searchPhraseActor);
				session.setSession(sessionId,searchPhraseActor);
			}else {
				searchPhraseActor = session.getSession(sessionId);
			}
//    		if(searchPhraseActor == null) {
//				searchphrase = new SearchPhrase();
//				session.setSession(sessionId,searchPhraseActor);
//			}else{
//				searchphrase = session.getSession(sessionId,searchphrase);
//			}
			System.out.println("\n\nSession Actor : "+searchPhraseActor+"\n\n");
			return FutureConverters.toJava(ask(searchPhraseActor, searchPhraseString, Integer. MAX_VALUE))
					.thenApply(response -> {
						LinkedHashMap<String, Resultlist> resultmap = null;
						try{
							System.out.println(response);
							resultmap = (LinkedHashMap<String, Resultlist>) response;
						}catch(Exception e){
							return ok("Internal Server Error");
						}
						return ok(views.html.index.render(request,resultmap));
					});
    		//CompletionStage<LinkedHashMap<String, Resultlist>> res = searchphrase.getResult(searchPhraseString);
    		//return res.thenApplyAsync(o -> ok(views.html.index.render(o)));
    	}
    }

	/**
	 * An action that renders an HTML page with projects list.
	 * The configuration in the <code>routes</code> file means that
	 * this method will be called when the application receives a
	 * <code>GET</code> request with a path of <code>skill/id/skill</code>.
	 * @param id id of the given skill
	 * @return Redirects to the html page containing 10 latest projects of a given skill
	 */
    public CompletionStage<Result> skill(String id) {
		System.out.println(id);
		return FutureConverters.toJava(ask(skillActor, id, Integer. MAX_VALUE))
				.thenApply(response -> {
					LinkedHashMap<String, Resultlist> resultmap = null;
					try{
						System.out.println(response);
						resultmap = (LinkedHashMap<String, Resultlist>) response;
					}catch(Exception e){
						return ok("Internal Server Error");
					}
					return ok(views.html.OriginalSkill.render(resultmap));
				});

//		CompletionStage<LinkedHashMap<String, Resultlist>> res = searchskill.getResult(id);
//    	return res.thenApplyAsync(o -> ok(views.html.skill.render(o)));
    }

	/**
	 * An action that renders an HTML page with Word Stats of all the searched projects.
	 * The configuration in the <code>routes</code> file means that
	 * this method will be called when the application receives a
	 * <code>GET</code> request with a path of <code>/wordstats/search</code>.
	 * @param search Search string entered by user
	 * @return Redirects to the html page showing Word Stats for all the searched queries
	 */
	public CompletionStage<Result> wordStat(String search) {
		//System.out.println("In HomeController WordStats : "+search);
//		CompletionStage<LinkedHashMap<String, Resultlist>> res = wordStats.getResult(search, searchphrase.resultmap.get(search).getDescriptions());
//		return res.thenApplyAsync(o -> ok(views.html.stat.render(o)));
		return FutureConverters.toJava(ask(statsActor, SearchPhrase.resultmap.get(search).getDescriptions(), Integer.MAX_VALUE))
				.thenApply(response -> {
					LinkedHashMap<String, Resultlist> resultmap = null;
					try{
						resultmap = (LinkedHashMap<String, Resultlist>) response;
					}catch(Exception e){
						return ok("Internal Server Error");
					}
					return ok(views.html.stat.render(resultmap));
				});
	}


	/**
	 * An action that renders an HTML page with Word Stats of an individual project.
	 * The configuration in the <code>routes</code> file means that
	 * this method will be called when the application receives a
	 * <code>GET</code> request with a path of <code>/indvstats/search/index</code>.
	 * @param search Search string entered by the user
	 * @param index Index of the individual project
	 * @return Redirects to the html page containing word stats of an individual project
	 */
	public CompletionStage<Result> indvStat(String search, int index) {
		WordStats wordStats = new WordStats();
		CompletionStage<LinkedHashMap<String, Integer>> res = wordStats.getStatResult(SearchPhrase.resultmap.get(search).getDescriptions().get(index));
		return res.thenApplyAsync(o -> ok(views.html.indvstat.render(o)));
	}

	/**
	 * An action that renders an HTML page with the details of an Employer.
	 * The configuration in the <code>routes</code> file means that
	 * this method will be called when the application receives a
	 * <code>GET</code> request with a path of <code>/profile/id</code>.
	 * @param id Owner Id of the employer
	 * @return Redirects to the html page showing details of an Employer
	 */
	public CompletionStage<Result> profile(String id) {
		return FutureConverters.toJava(ask(profileActor, id, Integer. MAX_VALUE))
				.thenApply(response -> {
					LinkedHashMap<String, Profile> resultmap = null;
					try{
						resultmap = (LinkedHashMap<String, Profile>) response;
					}catch(Exception e){
					}
					return ok(views.html.profile.render(resultmap));
				});

//		CompletionStage<LinkedHashMap<String, Profile>> res = searchprofile.getResult(id);
//		return res.thenApplyAsync(o -> ok(views.html.profile.render(o)));
	}

	/**
	 * An action that renders an HTML page with the Flesch Readability Index of a project description.
	 * The configuration in the <code>routes</code> file means that
	 * this method will be called when the application receives a
	 * <code>GET</code> request with a path of <code>/readability/search/index</code>.
	 * @param search Search string entered by user
	 * @param index index of an individual project
	 * @return Redirects to the html page showing Flesch Readability Index of an individual project]
	 */
	public CompletionStage<Result> readability(String search, int index) {
		CompletionStage<LinkedHashMap<String, String>> res = sfi.getResult(SearchPhrase.resultmap.get(search).getDescriptions().get(index));
		return res.thenApplyAsync(o -> ok(views.html.readability.render(o)));
	}
}
