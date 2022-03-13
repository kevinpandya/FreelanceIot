package controllers;


import java.util.LinkedHashMap;
import java.util.Map;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import play.mvc.*;


import businesslogic.*;
import model.*;

import model.Resultlist;
import model.Searchphraseresult;
import businesslogic.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 * @author Group
 */
public class HomeController extends Controller {

	LinkedHashMap<String, Resultlist> resultmap = new LinkedHashMap<String, Resultlist>();
	LinkedHashMap<String, Integer> indStats = new LinkedHashMap<String, Integer>();
    SearchPhrase searchphrase = new SearchPhrase();
    SearchSkill searchskill = new SearchSkill();
	WordStats wordStats = new WordStats();
    
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
    	CompletionStage<LinkedHashMap<String, Resultlist>> res = searchskill.getResult(id, skill);
    	return res.thenApplyAsync(o -> ok(views.html.skill.render(o)));
    }

	public Result wordStat(String search) {
		resultmap = wordStats.getWordStats(search);
		return ok(views.html.stat.render(resultmap));
	}

	public Result indvStat(String desc) {
		indStats = wordStats.getIndividualStats(desc);
		return ok(views.html.indvstat.render(indStats));
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
