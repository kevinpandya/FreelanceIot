package controllers;


import java.util.LinkedHashMap;
import java.util.Map;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import akka.http.javadsl.model.headers.Link;
import play.mvc.*;


import businesslogic.*;
import model.*;

import model.Resultlist;
import model.Profile;
import model.Searchphraseresult;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 * @author Group
 */
public class HomeController extends Controller {

	LinkedHashMap<String, Resultlist> resultmap = new LinkedHashMap<String, Resultlist>();
	LinkedHashMap<String, Integer> indStats = new LinkedHashMap<String, Integer>();
	LinkedHashMap<String, Profile> usermap = new LinkedHashMap<String, Profile>();
	SearchPhrase searchphrase = new SearchPhrase();
    SearchSkill searchskill = new SearchSkill();
	WordStats wordStats = new WordStats();
	SearchProfile searchprofile = new SearchProfile();
    Session session = new Session();

	/**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public CompletionStage<Result> index(String searchPhraseString,String sessionId) {
		if(searchPhraseString.equals("")) {
        	searchphrase = null;
        	return CompletableFuture.completedFuture(ok(views.html.index.render(null)));
        }else {
    		if(searchphrase == null) {
				searchphrase = new SearchPhrase();
				session.setSession(sessionId,searchphrase);
			}else{
				searchphrase = session.getSession(sessionId,searchphrase);
			}
    		CompletionStage<LinkedHashMap<String, Resultlist>> res = searchphrase.getResult(searchPhraseString);
    		return res.thenApplyAsync(o -> ok(views.html.index.render(o)));
    	}
    }
    
    public CompletionStage<Result> skill(String id,String skill) {
    	CompletionStage<LinkedHashMap<String, Resultlist>> res = searchskill.getResult(id, skill);
    	return res.thenApplyAsync(o -> ok(views.html.skill.render(o)));
    }

	public CompletionStage<Result> wordStat(String search) {
		CompletionStage<LinkedHashMap<String, Resultlist>> res = wordStats.getResult(search, searchphrase.resultmap.get(search).getDescriptions());
		return res.thenApplyAsync(o -> ok(views.html.stat.render(o)));
	}

	public CompletionStage<Result> indvStat(String search, int index) {
		CompletionStage<LinkedHashMap<String, Integer>> res = wordStats.getStatResult(searchphrase.resultmap.get(search).getDescriptions().get(index));
		return res.thenApplyAsync(o -> ok(views.html.indvstat.render(o)));
	}
	
	public CompletionStage<Result> profile(String id) {
		CompletionStage<LinkedHashMap<String, Profile>> res = searchprofile.getResult(id);
		return res.thenApplyAsync(o -> ok(views.html.profile.render(o)));
	}
}
