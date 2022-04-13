package actors;

import akka.actor.AbstractActor;
import akka.actor.Props;
import businesslogic.WordStats;
import model.Resultlist;

import java.util.LinkedHashMap;
import java.util.List;

public class WordStatsActor extends AbstractActor {

    private WordStats ws = new WordStats();

    public static Props getProps(){
        return Props.create(WordStatsActor.class);
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(List.class, desc -> {
                    LinkedHashMap<String, Resultlist> statsResult = ws.getWordStats(desc);
                    System.out.println("StatsResult : "+statsResult);
                    sender().tell(statsResult, self());
                })
                .match(String.class , prevDesc ->{
                    LinkedHashMap<String, Integer>  individualStatsResult = ws.getIndividualStats(prevDesc);
                    System.out.println("individualStatsResult" + individualStatsResult);
                    sender().tell(individualStatsResult ,self());
                })
                .build();
    }
}
