package actors;

import akka.actor.AbstractActor;
import akka.actor.Props;
import businesslogic.SearchFleschIndex;

import java.util.LinkedHashMap;

public class SearchFleschIndexActor extends AbstractActor {
    private SearchFleschIndex sfi = new SearchFleschIndex();

    public static Props getProps() {
        return Props.create(SearchSkillActor.class);
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(String.class, (a) -> {
                    LinkedHashMap<String, String> fleschResult = (LinkedHashMap<String, String>) sfi.getResult(a);
                    sender().tell(fleschResult, self());
                })
                .build();
    }
}
