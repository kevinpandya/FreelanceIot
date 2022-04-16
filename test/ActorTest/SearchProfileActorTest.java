package ActorTest;

import actors.SearchProfileActor;
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
 * Test class for SearchProfileActor class
 */
@RunWith(MockitoJUnitRunner.Silent.class)
public class SearchProfileActorTest {
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
     * Test method to test SearchProfile Actor
     */
    @Test
    public void actorTest(){
        new TestKit(actorSystem) {
            {
                final TestKit testProbe  =  new TestKit(actorSystem);
                Props props = Props.create(SearchProfileActor.class);
                Object results = new Object();
                TestActorRef<SearchProfileActor> ref = TestActorRef.create(actorSystem, props);
                ref.tell(results, testProbe.getRef());
            }
        };
    }

    @After
    public void destroyActorSystem(){
        actorSystem.terminate();
    }

}
