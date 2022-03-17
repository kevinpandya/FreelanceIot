package businesslogic;

import java.util.HashMap;


public class Session {
    public HashMap<String, SearchPhrase> sessionmap = new HashMap<String, SearchPhrase>();

    public void setSession(String id, SearchPhrase object){
        sessionmap.put(id,object);
    }

    public SearchPhrase getSession(String id,SearchPhrase object){
        if(sessionmap.containsKey(id))
            return sessionmap.get(id);
        else{
            sessionmap.put(id,object);
            return sessionmap.get(id);
        }
    }
}
