package ActorTest;

import actors.SearchSkillActor;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.testkit.TestActorRef;
import akka.testkit.javadsl.TestKit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * This class tests all the methods of the class SearchSkillActor
 */
@RunWith(MockitoJUnitRunner.Silent.class)
public class SearchSkillActorTest {
    static ActorSystem actorSystem;
    private static TestKit testProbe;

    static Object mockObject = new Object();

    /**
     * Initializes the actorSystem and testProbe
     */
    @Before
    public void setup() {
    	actorSystem = ActorSystem.create();
    	testProbe = new TestKit(actorSystem);
    }

    /**
     * Test method to test SearchSkill Actor
     */
    @Test
    public void actorTest(){
        new TestKit(actorSystem) {
            {
                final TestKit testProbe  =  new TestKit(actorSystem);
                Props props = Props.create(SearchSkillActor.class);
                Object results = new Object();
                TestActorRef<SearchSkillActor> ref = TestActorRef.create(actorSystem, props);
                ref.tell(results, testProbe.getRef());
            }
        };
    }

    @After
    public void destroyActorSystem(){
        actorSystem.terminate();
    }
}
