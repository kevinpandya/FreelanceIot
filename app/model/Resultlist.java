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

	private Resultlist object = null;
	private List<Searchphraseresult> result = new ArrayList<Searchphraseresult>();
	/**
	 * 
	 */
	
	public Resultlist getInstance() {
		if(object==null)
			return new Resultlist();
		else
			return this.object;
	}
	
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
