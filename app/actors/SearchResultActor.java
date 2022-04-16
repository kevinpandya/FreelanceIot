package actors;

import akka.actor.AbstractActor;
import akka.actor.Props;
import businesslogic.SearchFleschIndex;
import model.Resultlist;
import model.Searchphraseresult;
import org.json.JSONArray;
import org.json.JSONObject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Web Socket makes a call to this class to fetch results for a specified search word
 */
public class SearchResultActor extends AbstractActor {
    public static String API = "https://www.freelancer.com/api/projects/0.1/projects/active?previw_description=true&job_details=1&limit=250&compact=1&languages[]=en&query=";
    public static LinkedHashMap<String, Resultlist> resultmap = null;

    /**
     * Creates props for SearchResultActor class
     * @return this method returns a Props object
     */
    public static Props getProps(){
        return Props.create(SearchResultActor.class);
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(String.class, (a) -> {
                    Object results = getPhraseResultJSON(a);
                    sender().tell(results, self());
                })
                .build();
    }

    /**
     * This method fetches the results for the specific search word
     * @param searchPhrase Search phrase entered by the user
     * @return JSON Object of the results fetched
     */
    public Object getPhraseResultJSON(String searchPhrase){
        JSONObject finalObject=null;
        List<Searchphraseresult> sp = new ArrayList<Searchphraseresult>();
        Resultlist r1 = new Resultlist();
        List<String> descriptions = new ArrayList<String>();
        SearchFleschIndex sfi = new SearchFleschIndex();
        Resultlist rl = new Resultlist();
        rl.setSearchPhrase(searchPhrase);
        JSONObject json=null;
        String[] s = searchPhrase.split(" ");
        String searchQuery = "\"";
        for(int i=0;i<s.length;i++) {
            searchQuery+=s[i]+"%20";
        }
        searchQuery+="\"";
        try{
            URL url = new URL(API+searchQuery);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            if(conn.getResponseCode() == 200) {
                System.out.println("Inside the url result");
                Scanner scan = new Scanner(url.openStream());
                String temp = "";
                while (scan.hasNext()) {
                    temp = temp + scan.nextLine();
                }
                JSONObject json1 = new JSONObject(temp);
                //System.out.println(json1);
                JSONObject result = json1.getJSONObject("result");
                JSONArray projects = (JSONArray) result.getJSONArray("projects");

                JSONArray projectdesclist = new JSONArray();
                JSONArray projectarray = new JSONArray();
                for(int i=0;i<projects.length();i++) {



                    JSONObject obj = projects.getJSONObject(i);
                    Searchphraseresult tempsr = new Searchphraseresult();
                    if(i<10){
                        JSONObject projectobject = new JSONObject(); //====================
                        projectobject.put("owner_id",obj.get("owner_id").toString()); //===================
                        tempsr.setOwner_id(obj.get("owner_id").toString());
                        tempsr.setIndex(i);
                        projectobject.put("index",i);
                        tempsr.setPrevDesc(obj.get("preview_description").toString());
                        projectobject.put("preview_description",obj.get("preview_description").toString()); //====================
                        descriptions.add(obj.get("preview_description").toString());
                        JSONObject prew_desc = new JSONObject(); //============================
                        prew_desc.put(String.valueOf(i),obj.get("preview_description").toString()); //===================
                        projectdesclist.put(prew_desc); //=======================
                        Date date = new Date(Long.parseLong(obj.get("submitdate").toString()+"000"));
                        DateFormat simple = new SimpleDateFormat("dd MMM yyyy");
                        tempsr.setDate(simple.format(date));
                        projectobject.put("date",simple.format(date)); //===================
                        tempsr.setTitle(obj.get("title").toString());
                        projectobject.put("title",obj.get("title").toString()); //===================
                        tempsr.setType(obj.get("type").toString());
                        projectobject.put("type",obj.get("type").toString());  //================
                        LinkedHashMap<String, String> skillsmap = new LinkedHashMap<String, String>();
                        JSONArray projectobjectskill = new JSONArray();
                        JSONArray skills = obj.getJSONArray("jobs");
                        for(int j=0;j<skills.length();j++) {
                            JSONObject skill = skills.getJSONObject(j);
                            JSONObject skillobject = new JSONObject();
                            skillobject.put(skill.get("name").toString() , skill.get("id").toString());
                            projectobjectskill.put(skillobject);
                            skillsmap.put( skill.get("name").toString() , skill.get("id").toString() );
                        }
                        tempsr.setSkills(skillsmap);
                        sp.add(tempsr);
                        projectobject.put("skills",projectobjectskill);
                        System.out.println(projectobject);
                        projectarray.put(projectobject);
                    }else{
                        descriptions.add(obj.get("preview_description").toString());
                        JSONObject prew_desc = new JSONObject(); //============================
                        prew_desc.put(String.valueOf(i),obj.get("preview_description").toString()); //===================
                        projectdesclist.put(prew_desc);
                    }
                }
                System.out.println("\n\n\n\n\n\n\n\n\n");
                System.out.println(projectarray);
                r1.setResult(sp);
                r1.setDescriptions(descriptions);
                r1.setFleschIndex(sfi.getFleshIndex(descriptions));
                r1.setEdLevel(sfi.getEducationLevel(r1.getFleschIndex()));
                r1.setFkgl(sfi.getFkgl(r1.getFleschIndex()));
                JSONArray phraseResult = new JSONArray();
                System.out.println("here");
                phraseResult.put(projectarray);
                phraseResult.put(projectdesclist);
                JSONObject flindex = new JSONObject();
                JSONObject edlevel = new JSONObject();
                JSONObject fkgl = new JSONObject();
                flindex.put("FL_Index",r1.getFleschIndex());
                edlevel.put("Ed_Level",r1.getEdLevel());
                fkgl.put("FKGL",r1.getFkgl());
                phraseResult.put(flindex);
                phraseResult.put(edlevel);
                phraseResult.put(fkgl);
                System.out.println("\n\n\nPHRASE RESULT ===========\n\n");
                System.out.println(phraseResult);
                finalObject = new JSONObject();
                finalObject.put("result",phraseResult);

                //System.out.println(finalObject);
                resultmap.put(searchPhrase,r1);
                //return finalObject;
//                ObjectMapper objectMapper = new ObjectMapper();
//
//                try {
//                    json = new JSONObject(objectMapper.writeValueAsString(resultmap));
//                    System.out.println(json);
//                    return json;
//                } catch (JsonProcessingException e) {
//                    e.printStackTrace();
//                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(finalObject);
        return finalObject;
    }

}
