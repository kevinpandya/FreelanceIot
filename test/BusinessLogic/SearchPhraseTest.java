package BusinessLogic;

import businesslogic.SearchPhrase;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertNotNull;

public class SearchPhraseTest extends Mockito {

    @Mock
    SearchPhrase searchPhraseMock;

    @Before
    public void setup(){
        searchPhraseMock = new SearchPhrase();
    }

    @Test
    public void phraseTest(){
        SearchPhrase sp = searchPhraseMock;
        sp.API = "https://www.freelancer-sandbox.com/api/projects/0.1/projects/active?previw_description=true&job_details=1&limit=250&compact=1&languages[]=en&query=";
        assertNotNull(sp.getResult("JAVA playframework"));

        sp.API = "hppts://localhost:9000";
        sp.getResult("Hello wolrd");
    }
}
