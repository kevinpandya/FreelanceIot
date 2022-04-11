import actors.GuiceInjectedActor;
import businesslogic.SearchPhrase;
import businesslogic.SearchProfile;
import businesslogic.SearchSkill;
import businesslogic.WordStats;
import com.google.inject.AbstractModule;

import actors.UserActor;
import actors.UserParentActor;
import play.libs.akka.AkkaGuiceSupport;

public class Module extends AbstractModule implements AkkaGuiceSupport {

    @Override
    protected final void configure() {
        bindActor(UserParentActor.class, "userParentActor");
        bindActorFactory(UserActor.class, UserActor.Factory.class);
        bindActor(SearchProfile.class,"profileActor");
        bindActor(SearchPhrase.class,"searchPhraseActor");
        bindActor(SearchSkill.class,"skillActor");
        bindActor(WordStats.class, "statsActor");
    }

}
