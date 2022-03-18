package model;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResultlistTest {


     List<String> descriptions = Arrays.asList(new String[]{"hello world"});
    List<Searchphraseresult> result = Arrays.asList(new Searchphraseresult[]{});

        Resultlist rl;

    @Before
    public void setup(){rl = new Resultlist();}

    @Test
    public void testDescription(){
        rl.setDescriptions(descriptions);
        assertEquals(descriptions , rl.getDescriptions());
    }
    @Test
    public void testResult(){
        rl.setResult(result);
        assertEquals(result , rl.getResult());
    }


}
