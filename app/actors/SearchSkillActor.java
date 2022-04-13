package actors;

import akka.actor.AbstractActor;
import akka.actor.Props;
import businesslogic.SearchSkill;
import model.Resultlist;

import java.util.LinkedHashMap;

public class SearchSkillActor extends AbstractActor {
    private SearchSkill ss = new SearchSkill();

    public static Props getProps() {
        return Props.create(SearchSkillActor.class);
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(String.class, (a) -> {
                    LinkedHashMap<String, Resultlist> skillResult = ss.getSkillResult(a);
                    sender().tell(skillResult, self());
                })
                .build();
    }
}
