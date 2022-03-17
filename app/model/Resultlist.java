/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Group
 *
 */
public class Resultlist {

	private List<Searchphraseresult> result = new ArrayList<Searchphraseresult>();
	private List<String> descriptions = new ArrayList<String>();

	public void setDescriptions(List<String> descriptions) {
		this.descriptions = descriptions;
	}

	public List<String> getDescriptions() {
		return descriptions;
	}

	/**
	 * 
	 */


	
	public Resultlist() {
		// TODO Auto-generated constructor stub
	}
	public List<Searchphraseresult> getResult() {
		return result;
	}
	public void setResult(List<Searchphraseresult> result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Resultlist [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
