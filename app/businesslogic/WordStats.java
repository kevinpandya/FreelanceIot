/**
 *
 */
package businesslogic;

import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Map;
import java.net.*;
import java.util.Arrays;

import org.json.JSONArray;
import org.json.JSONObject;

import model.Resultlist;
import model.Searchphraseresult;

/**
 * @author Kevin Pandya
 *
 */
public class WordStats {
    /**
     *
     */
    public WordStats() {

    }

    public LinkedHashMap<String, Resultlist> getWordStats(String searchPhrase) {
        List<Searchphraseresult> sp = new ArrayList<Searchphraseresult>();
        LinkedHashMap<String, Resultlist> resultmap = new LinkedHashMap<String, Resultlist>();
        Resultlist r1 = new Resultlist();
        //System.out.println(searchPhrase);
        String[] s = searchPhrase.split(" ");
        String searchQuery = "\"";
        for(int i=0;i<s.length;i++) {
            searchQuery+=s[i]+"%20";
        }

        searchQuery+="\"";

        try {
            URL url = new URL("https://www.freelancer.com/api/projects/0.1/projects/active?preview_description=true&limit=250&compact=1&languages[]=en&query="+searchQuery);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            if(conn.getResponseCode() == 200) {
                Scanner scan = new Scanner(url.openStream());
                String temp="";
                while(scan.hasNext()) {
                    temp = temp + scan.nextLine();
                }
                JSONObject json = new JSONObject(temp);
                JSONObject result = json.getJSONObject("result");
                JSONArray projects = (JSONArray) result.getJSONArray("projects");

                for(int i=0;i<projects.length();i++) {
                    int k = i + 1;
                    JSONObject obj = projects.getJSONObject(i);
                    Searchphraseresult tempsr = new Searchphraseresult();
                    List<String> list = Stream.of(obj.get("preview_description"))
                            .map(w -> ((String) w)
                            .replaceAll("\\p{Punct}", " ")
                            .split("\\s+"))
                            .flatMap(Arrays::stream)
                            .collect(Collectors.toList());

                    Map<String, Integer> wordCounter = list.stream()
                            .collect(Collectors.toMap(w -> w.toLowerCase(), w -> 1, Integer::sum));

                    LinkedHashMap<String, Integer> sorted = new LinkedHashMap<>();
                    wordCounter.entrySet().stream()
                            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                            .forEachOrdered(x -> sorted.put(x.getKey(), x.getValue()));

                    tempsr.setWordStats(sorted);
                    sp.add(tempsr);
                }
                r1.setResult(sp);
                resultmap.put(searchPhrase, r1);
            }
        }catch(Exception e) {
            System.out.println(e);
        }

        return resultmap;
    }

    public LinkedHashMap<String, Integer> getIndividualStats(String prevDesc) {

        List<String> list = Stream.of(prevDesc)
                .map(w -> ((String) w)
                        .replaceAll("\\p{Punct}", " ")
                        .split("\\s+"))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        Map<String, Integer> wordCounter = list.stream()
                .collect(Collectors.toMap(w -> w.toLowerCase(), w -> 1, Integer::sum));

        LinkedHashMap<String, Integer> sorted = new LinkedHashMap<>();
        wordCounter.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEachOrdered(x -> sorted.put(x.getKey(), x.getValue()));

        return sorted;
    }

}