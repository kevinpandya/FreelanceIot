package actors;

import akka.actor.AbstractActor;
import akka.actor.Props;
import businesslogic.SearchPhrase;
import model.Resultlist;

import java.util.LinkedHashMap;

/**
 * Search Phrase Actor for SearchPhrase class
 */
public class SearchPhraseActor extends AbstractActor {

    private SearchPhrase sp = new SearchPhrase();

    /**
     * @param id id of the owner
     * @return Props creating the object of the class
     */
    public static Props props(String id){
        System.out.println(id);
        return Props.create(SearchPhraseActor.class,()->new SearchPhraseActor());
    }

    /**
     * Creates props for the SearchPhraseActor class
     * @return this method returns a Props object
     */
    public static Props getProps(){
        return Props.create(SearchPhraseActor.class);
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(String.class, (a) -> {
                    LinkedHashMap<String, Resultlist> searchPhraseResult = sp.getPhraseResult(a);
                    sender().tell(searchPhraseResult, self());
                })
                .build();
    }
}
