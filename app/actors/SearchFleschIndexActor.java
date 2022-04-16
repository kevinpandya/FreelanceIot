package actors;

import akka.actor.AbstractActor;
import akka.actor.Props;
import businesslogic.SearchFleschIndex;

import java.util.LinkedHashMap;

/**
 * This is the Actor for SearchFleschIndex class
 */
public class SearchFleschIndexActor extends AbstractActor {
    private SearchFleschIndex sfi = new SearchFleschIndex();

    /**
     * Creates props for the SearchFleschIndexActor class
     * @return this method returns a Props object
     */
    public static Props getProps() {
        return Props.create(SearchFleschIndexActor.class);
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(String.class, (a) -> {
                    LinkedHashMap<String, String> fleschResult = sfi.getIndex(a);
                    sender().tell(fleschResult, self());
                })
                .build();
    }
}
