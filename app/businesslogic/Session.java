package businesslogic;

import akka.actor.ActorRef;

import java.util.HashMap;


/**
 * <p>This class is used to manage sessions</p>
 * @author Group Task
 */
public class Session {
    public HashMap<String, ActorRef> sessionmap = new HashMap<String, ActorRef>();

    /**
     * <p>This method adds the unique session id and the search phrase results into sessionmap</p>
     * @param id Session ID
     * @param object Object of SearchPhrase results
     */
    public void setSession(String id, ActorRef object){
        sessionmap.put(id,object);
    }

    /**
     * @param id Session ID
     * @param object Object of SearchPhrase results
     * @return It returns the search phrase results for a given session id
     */
    public ActorRef getSession(String id){
        //System.out.println("[INFO] Get Session Callled ");
        //System.out.println("[INFO] Session Map => "+sessionmap);
        if(sessionmap.containsKey(id))
            return sessionmap.get(id);
        else{
            return null;
        }
    }
}
