package actors;

import akka.actor.AbstractActor;
import akka.actor.Props;
import businesslogic.SearchProfile;
import model.Profile;

import java.util.LinkedHashMap;

public class SearchProfileActor extends AbstractActor {

    private SearchProfile sp = new SearchProfile();

    public static Props getProps(){
        return Props.create(SearchProfileActor.class);
    }

    @Override
    public Receive createReceive() {

        return receiveBuilder()
                .match(String.class, a -> {
                    LinkedHashMap<String, Profile> pup = sp.getProfileResult(a);
                    sender().tell(pup, self());
                })
                .build();
    }
}
