package controllers;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import play.mvc.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }
    
    public Result explore() {
        return ok(views.html.explore.render());
    }
    
    public Result tutorial() {
        return ok(views.html.tutorial.render());
    }
    
    public Result time() {
    	return ok(Double.toString(System.currentTimeMillis()/1000));
    }
    
    public Result hello(String message) {
    	return ok("Hello "+ message);
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
    
    public Result plus(String a1, String a2) {
    	return ok(Double.toString( Integer.parseInt(a1) + Integer.parseInt(a2)));
    }

    public Result apiCall() {

        return ok("Hello Wolrd!");
    }
}
