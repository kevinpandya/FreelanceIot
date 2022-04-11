package actors;

import akka.actor.AbstractActorWithTimers;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.http.javadsl.model.HttpRequest;
import businesslogic.SearchSkill;
import controllers.HomeController;
import model.Resultlist;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.mvc.Http;
import play.mvc.Result;
import scala.concurrent.duration.Duration;

import javax.inject.Inject;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeUnit;

public class SearchResultActor extends AbstractActorWithTimers {
    @Inject
    private ActorRef userActor;
    private ActorRef searchActor;

    private String query;
    private Http.Request request;

    private String sessionId;

    private HomeController homeController = null;
    private Resultlist resultlist = null;

    private final Logger logger = LoggerFactory.getLogger("play");

    private Set<Result> searchPhraseResultItems;

    public static final class Tick {
    }
        @Override
        public void preStart()
        {
            getTimers().startPeriodicTimer("Time" ,new Tick(),
                    Duration.create(10 , TimeUnit.SECONDS));
        }

        public SearchResultActor(){
            this.userActor = null;
            this.query = null;
            this.searchActor = null;
            this.sessionId = null;
            this.request = null;
        }

        public static Props getProps(){
            return Props.create(SearchResultActor.class);
        }

        @Override
        public Receive createReceive(){
            return receiveBuilder()
                    .match(Messages.RegisterActor.class , message ->{
                        logger.info("Registering actor()" , message);
                        userActor  = sender();
                        getSender().tell("userActor registered" , getSelf());
            })
            .match(Messages.WatchSearchResults.class , message -> {
                logger.info("Received message WatchSearchResults {}" , message);
                if(message != null && message.query != null && message.query != ""){
                    watchSearchResult(message);
                }
            })
            .match(Tick.class, message ->{
                logger.info("Received message Tick{}" , message);
                if(query != null){
                    tickSearchResults();
                }
            })
            .build();
        }

        public CompletionStage<Void> watchSearchResult(Messages.WatchSearchResults message){
            query = message.query;

            System.out.println("In Watch Search Results");

            return homeController.index(request, query, sessionId).thenAcceptAsync(searchResults -> {
                this.searchPhraseResultItems = new HashSet<>();
                searchPhraseResultItems.add(searchResults);
                resultlist.setSearchPhrase(query);
                Messages.SearchResult sr = new Messages.SearchResult(searchPhraseResultItems, query);
                userActor.tell(sr, self());
            });
        }

        public CompletionStage<Void> tickSearchResults() {
            return homeController.index(request, query, sessionId).thenAcceptAsync(searchResults -> {
                this.searchPhraseResultItems = new HashSet<>();
                resultlist.setSearchPhrase(query);
                searchPhraseResultItems.add(searchResults);
                Messages.SearchResult searchResult = new Messages.SearchResult(searchPhraseResultItems, query);
                userActor.tell(searchResult, self());
            });
        }


        public String getQuery(){
        return  query;
        }
        public void setQuery(String query){
            this.query = query;
        }

}