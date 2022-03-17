package BusinessLogic;

import businesslogic.SearchSkill;
import org.junit.Test;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertNotNull;

public class SearchSkillTest extends Mockito {

    @Mock
    SearchSkill searchSkillMock;

    @Before
    public void setup(){
        searchSkillMock = new SearchSkill();
    }

    @Test
    public void skillTest(){
        SearchSkill ss = searchSkillMock;
        ss.API = "https://www.freelancer-sandbox.com/api/projects/0.1/projects/active?previw_description=true&limit=10&job_details=true&compact=true&languages[]=en&jobs[]=";
        assertNotNull(ss.getResult("3","PHP"));

        ss.API = "hppts://localhost:9000";
        ss.getResult("3","PHP");
    }
}
