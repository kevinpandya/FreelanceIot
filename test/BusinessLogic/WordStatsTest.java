package BusinessLogic;

import businesslogic.WordStats;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;

public class WordStatsTest extends Mockito {

    @Mock
    WordStats wordStatsMock;

    @Before
    public void setup() {
        wordStatsMock = new WordStats();
    }

    @Test
    public void statsTest(){
        WordStats ws = wordStatsMock;
        List<String> desc = new ArrayList<String>();
        desc.add("I am looking to have someone build a responsive PHP page uses MYSQL to run search. I have PSD");
        assertNotNull(ws.getResult("php" ,desc));
    }

    @Test
    public void indstatsTest(){
        WordStats ws = wordStatsMock;
        assertNotNull(ws.getStatResult("I am looking to have someone build a responsive PHP page uses MYSQL to run search. I have PSD"));
    }
}
