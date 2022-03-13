/**
 * 
 */
package model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;


/**
 * @author Mahavir
 *
 */
public class Searchphraseresult {

	/**
	 * 
	 */
	private String owner_id;
	private String date;
	private String title;
	private String type;
	private String prevDesc;
	//private List<String> desc = new List<String>();
	private LinkedHashMap<String, String> skills = new LinkedHashMap<String, String>();
	private LinkedHashMap<String, Integer> wordStats = new LinkedHashMap<String, Integer>();
	//private JSONArray projects = new JSONArray();
	
	public Searchphraseresult() {
		// TODO Auto-generated constructor stub
	}
	
	public String getOwner_id() {
		return owner_id;
	}


	public void setOwner_id(String owner_id) {
		this.owner_id = owner_id;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	public HashMap<String, String> getSkills() {
		return skills;
	}

	public void setSkills(LinkedHashMap<String, String> skills) {
		this.skills = skills;
	}

	public LinkedHashMap<String, Integer> getWordStats() {
		return wordStats;
	}

	public void setWordStats(LinkedHashMap<String, Integer> wordStats) {
		this.wordStats = wordStats;
	}

	public void setPrevDesc(String prevDesc) {
		this.prevDesc = prevDesc;
	}

	public String getPrevDesc() {
		return prevDesc;
	}

//	public List<String> getDesc() {
//		return desc;
//	}
//
//	public void setDesc(List<String> desc) {
//		this.desc = desc;
//	}

//	public void setProjects(JSONArray projects){
//		this.projects = projects;
//	}
//
//	public JSONArray getProjects() {
//		return projects;
//	}

	@Override
	public String toString() {
		return "Searchphraseresult [owner_id=" + owner_id + ", date=" + date + ", title=" + title + ", type=" + type
				+ ", skills=" + skills + "]";
	}
	

}
