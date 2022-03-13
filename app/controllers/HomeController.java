package controllers;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;


import play.mvc.*;


import businesslogic.*;
import model.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 * @author Group
 */
public class HomeController extends Controller {
    
	SearchPhrase searchphrase = null;
    SearchSkill searchskill = new SearchSkill();
    
	/**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index(String searchPhraseString) {
        if(searchPhraseString.equals("")) {
        	searchphrase = null;
    		return ok(views.html.index.render(null));
    	}else {
    		if(searchphrase == null)
    			searchphrase = new SearchPhrase();
    		return ok(views.html.index.render(searchphrase.getPhraseResult(searchPhraseString)));
    	}
    }
    
    public CompletionStage<Result> skill(String id,String skill) {
    	return ok(views.html.skill.render(id,skill));
    }

    public CompletionStage<Result> helloPlay(final String message) {
    	CompletionStage<String> output = method1(message);
    	return output.thenApplyAsync(o -> ok(o));
    }
    
    private String outputString(final String message) {
    	return "HelloPlay " + message;
    }
    
    private CompletionStage<String> method1(final String message){
    	return CompletableFuture.supplyAsync(()-> outputString(message));
    }
}
