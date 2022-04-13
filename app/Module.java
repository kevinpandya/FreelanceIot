import actors.*;
import com.google.inject.AbstractModule;
import play.libs.akka.AkkaGuiceSupport;

@SuppressWarnings("unused")
public class Module extends AbstractModule implements AkkaGuiceSupport {

    @Override
    protected final void configure() {
        bindActor(UserParentActor.class, "userParentActor");
        bindActorFactory(UserActor.class, UserActor.Factory.class);
        bindActor(SearchProfileActor.class,"profileActor");
        bindActor(SearchPhraseActor.class,"searchPhraseActor");
        bindActor(SearchSkillActor.class,"skillActor");
        bindActor(WordStatsActor.class, "statsActor");
    }

}
