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
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import akka.actor.AbstractActor;
import akka.actor.Props;
import org.json.JSONArray;
import org.json.JSONObject;

import model.Resultlist;
import model.Searchphraseresult;

/**
 * <p>This class is used to fetch 10 latest projects of a specific skill</p>
 * @author Mahavir
 */
public class SearchSkill {
	
	public String API = "https://www.freelancer.com/api/projects/0.1/projects/active?previw_description=true&limit=10&job_details=true&compact=true&languages[]=en&jobs[]=";

//	public static Props getProps() {
//		return Props.create(SearchSkill.class);
//	}
//
//	@Override
//	public Receive createReceive() {
//		return receiveBuilder()
//				.match(String.class, (a) -> {
//					LinkedHashMap<String, Resultlist> skillResult = getSkillResult(a);
//					sender().tell(skillResult, self());
//				})
//				.build();
//	}

	/**
	 * <p>This method calls getSkillResult method of this class</p>
	 * @param id It is an id of a specific skill
	 * @return LinkedHashMap containing search string and result list
	 */
	public CompletionStage<LinkedHashMap<String, Resultlist>> getResult(String id){
		return CompletableFuture.supplyAsync(()-> this.getSkillResult(id));
	}

	/**
	 * <p>This method fetches 10 latest projects of a specified skill</p>
	 * @param id It is an id of a specific skill
	 * @return LinkedHashMap containing projects of a specific skill
	 */
	public LinkedHashMap<String, Resultlist> getSkillResult(String id) {
		String skillstring="";
		LinkedHashMap<String, Resultlist> resultmap = new LinkedHashMap<String, Resultlist>();
		List<Searchphraseresult> sp = new ArrayList<Searchphraseresult>();
		Resultlist r1 = new Resultlist();
		try {
			URL url = new URL(this.API + id);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			if (conn.getResponseCode() == 200) {
				Scanner scan = new Scanner(url.openStream());
				String temp = "";
				while (scan.hasNext()) {
					temp = temp + scan.nextLine();
				}
				JSONObject json = new JSONObject(temp);
				JSONObject result = json.getJSONObject("result");
				JSONArray projects = (JSONArray) result.getJSONArray("projects");
				for (int i = 0; i < projects.length(); i++) {
					JSONObject obj = projects.getJSONObject(i);
					Searchphraseresult tempsr = new Searchphraseresult();
					tempsr.setOwner_id(obj.get("owner_id").toString());
					tempsr.setPrevDesc(obj.get("preview_description").toString());
					Date date = new Date(Long.parseLong(obj.get("submitdate").toString() + "000"));
					DateFormat simple = new SimpleDateFormat("dd MMM yyyy");
					tempsr.setDate(simple.format(date));
					tempsr.setTitle(obj.get("title").toString());
					tempsr.setType(obj.get("type").toString());
					LinkedHashMap<String, String> skillsmap = new LinkedHashMap<String, String>();
					JSONArray skills = obj.getJSONArray("jobs");
					for (int j = 0; j < skills.length(); j++) {
						JSONObject skill = skills.getJSONObject(j);
						if(skill.get("id").toString().equalsIgnoreCase(id))
							skillstring = skill.get("name").toString();
						skillsmap.put(skill.get("name").toString(), skill.get("id").toString());
					}
					tempsr.setSkills(skillsmap);
					sp.add(tempsr);
				}
				r1.setResult(sp);
				resultmap.put(skillstring, r1);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return resultmap;
	}


}
