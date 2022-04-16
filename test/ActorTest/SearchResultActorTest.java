package ActorTest;

import actors.SearchPhraseActor;
import actors.SearchResultActor;
import akka.actor.ActorRef;
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
 * Test class for SearchResultActor class
 */
@RunWith(MockitoJUnitRunner.Silent.class)
public class SearchResultActorTest {

    static ActorSystem actorSystem;
    private static TestKit testProbe;
    private ActorRef testActor;

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
     * Test method to test SearchResult Actor
     */
    @Test
    public void actorTest(){
        new TestKit(actorSystem) {
            {
                final TestKit testProbe  =  new TestKit(actorSystem);
                Props props = Props.create(SearchResultActor.class);
                Object results = new Object();
                TestActorRef<SearchPhraseActor> ref = TestActorRef.create(actorSystem, props);
                ref.tell(results, testProbe.getRef());

            }
        };
    }

    /**
     * Tests the getPhraseResultJSON method of the SearchResultActor class
     */
    @Test
    public void testGetPhraseResult(){
        final Props props = Props.create(SearchResultActor.class);
        testActor = actorSystem.actorOf(props);

        final TestKit testProbe = new TestKit(actorSystem);
        testActor.tell("call", testProbe.getRef());
        Object temp = testProbe.expectMsgClass(Object.class);
    }

    @After
    public void destroyActorSystem(){
        actorSystem.terminate();
    }
}