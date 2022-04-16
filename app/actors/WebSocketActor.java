package actors;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Cancellable;
import akka.actor.Props;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import play.libs.Json;

import java.time.Duration;

/**
 * This class controls the websocket and calls the SearchResultActor to fetch results in a specified duration of time
 */
public class WebSocketActor extends AbstractActor {

    /**
     * Creates props for the WebSocketActor class
     * @param out
     * @return Props of the WebSocketActor class
     */
    public static Props props(ActorRef out) {
        return Props.create(WebSocketActor.class, out);
    }

    private final ActorRef out;

    private Cancellable scheduled = null;

    @Inject
    public WebSocketActor(ActorRef out) {
        this.out = out;
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(String.class, message -> {
                    try {
                        JsonNode data = Json.parse(message);
                        String type = data.get("type").asText();
                        System.out.println("Type : "+type);
                        String keywords = data.get("data").asText();
                        System.out.println("keywords : "+keywords);
                        ActorRef actor = null;
                        if (type.equals("searchPhrase")) {
                            actor = getContext().actorOf((SearchResultActor.getProps()));
                        }

                        if (scheduled != null) {
                            scheduled.cancel();
                        }
                        // tell the message to searchActor
                        scheduled = getContext().getSystem().getScheduler().scheduleAtFixedRate(
                                Duration.ZERO,
                                Duration.ofSeconds(10),
                                actor, keywords,
                                getContext().getDispatcher(),
                                self());

                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error: Websocket Actor parsing error(" + message + ") " + e);
                    }
                })
                .match(Object.class, searchResult -> {
                    if (!out.isTerminated()) {
                        out.tell(searchResult.toString(), self());
                    }
                })
                .build();
    }
}
