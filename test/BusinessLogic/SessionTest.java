package BusinessLogic;

import businesslogic.SearchPhrase;
import businesslogic.Session;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;


public class SessionTest extends Mockito {

    @Mock
    Session session;

    @Before
    public void setup(){
        session = new Session();
    }

    @Test
    public void testGetSession(){
        SearchPhrase ss = new SearchPhrase();
        session.getSession("vbnm741g",ss);
        assertEquals(ss,session.getSession("vbnm741g",ss));
    }

    @Test
    public void testSetSession(){
        SearchPhrase ss = new SearchPhrase();
        session.setSession("cs646e2w",ss);
        assertEquals(ss,session.getSession("cs646e2w",ss));
    }
}
