/**
 * 
 */
package model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;


/**
 * @author Group
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
	private LinkedHashMap<String, String> skills = new LinkedHashMap<String, String>();
	
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

	@Override
	public String toString() {
		return "Searchphraseresult [owner_id=" + owner_id + ", date=" + date + ", title=" + title + ", type=" + type
				+ ", skills=" + skills + "]";
	}
	

}
