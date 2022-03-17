/**
 * 
 */
package businesslogic;

import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import org.json.JSONArray;
import org.json.JSONObject;

import model.Resultlist;
import model.Searchphraseresult;
/**
 * @author Group
 *
 */
public class SearchPhrase {
	public String API = "https://www.freelancer.com/api/projects/0.1/projects/active?previw_description=true&job_details=1&limit=250&compact=1&languages[]=en&query=";
	public LinkedHashMap<String, Resultlist> resultmap = null;

	/**
	 * 
	 */
	public SearchPhrase() {
		resultmap = new LinkedHashMap<String, Resultlist>();
	}
	
	public CompletionStage<LinkedHashMap<String, Resultlist>> getResult(String searchPhrase){
		return CompletableFuture.supplyAsync(()-> this.getPhraseResult(searchPhrase));
	}

	public LinkedHashMap<String, Resultlist> getPhraseResult(String searchPhrase){
		List<Searchphraseresult> sp = new ArrayList<Searchphraseresult>();
		Resultlist r1 = new Resultlist();
		List<String> descriptions = new ArrayList<String>();
		
		
		if(resultmap.containsKey(searchPhrase)) {
			resultmap = this.checkPhraseResult(searchPhrase, resultmap);
		}else {
			String[] s = searchPhrase.split(" ");
			String searchQuery = "\"";
			for(int i=0;i<s.length;i++) {
				searchQuery+=s[i]+"%20";
			}
			searchQuery+="\"";
			try {
				URL url = new URL(this.API+searchQuery);
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
						JSONObject obj = projects.getJSONObject(i);
						Searchphraseresult tempsr = new Searchphraseresult();
						if(i<10){
							tempsr.setOwner_id(obj.get("owner_id").toString());
							tempsr.setIndex(i);
							tempsr.setPrevDesc(obj.get("preview_description").toString());
							descriptions.add(obj.get("preview_description").toString());
							Date date = new Date(Long.parseLong(obj.get("submitdate").toString()+"000"));
							DateFormat simple = new SimpleDateFormat("dd MMM yyyy");
							tempsr.setDate(simple.format(date));
							tempsr.setTitle(obj.get("title").toString());
							tempsr.setType(obj.get("type").toString());
							LinkedHashMap<String, String> skillsmap = new LinkedHashMap<String, String>();
							JSONArray skills = obj.getJSONArray("jobs");
							for(int j=0;j<skills.length();j++) {
								JSONObject skill = skills.getJSONObject(j);
								skillsmap.put( skill.get("name").toString() , skill.get("id").toString() );
							}
							tempsr.setSkills(skillsmap);
							sp.add(tempsr);
						}else{
							descriptions.add(obj.get("preview_description").toString());
						}
					}
					r1.setResult(sp);
					r1.setDescriptions(descriptions);
					this.resultmap.put(searchPhrase,r1);
	            }
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		return this.reverseLinkedHashMap(this.resultmap);
	}
	
	public LinkedHashMap<String, Resultlist> reverseLinkedHashMap(LinkedHashMap<String, Resultlist> resultmap){
		LinkedHashMap<String, Resultlist> reversed = new LinkedHashMap<String, Resultlist>();
		List<String> keys = new ArrayList<String>(resultmap.keySet());
		Collections.reverse(keys);
		for(String key: keys) {
			reversed.put(key, resultmap.get(key));
		}
		return reversed;
	}
	
	public LinkedHashMap<String, Resultlist> checkPhraseResult(String phrase, LinkedHashMap<String, Resultlist> resultmap){
		LinkedHashMap<String, Resultlist> temp = resultmap;
		if(temp.containsKey(phrase)) {
			Resultlist rs = new Resultlist();
			rs = temp.get(phrase);
			temp.remove(phrase);
			temp.put(phrase, rs);
		}
		return temp;
	}
	
}
