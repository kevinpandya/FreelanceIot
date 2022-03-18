package model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProjectinfoTest {

    String title = "group Project";
    String description = " I need front end developer who has depth knowledge in Html and css";
    String submitdate = "11 march 2022";
    String projectid = "22022";

    projectInfo pi;

    @Before
    public void setup(){
        pi = new projectInfo();
    }
    @Test
    public void testtitle(){
        pi.setTitle(title);
        assertEquals(title , pi.getTitle());
    }
    @Test
    public void testDescription(){
        pi.setDescription(description);
        assertEquals(description , pi.getDescription());
    }
    @Test
    public void testSubmitdate(){
        pi.setSubmitdate(submitdate);
        assertEquals(submitdate , pi.getSubmitdate());
    }
    @Test
    public void testProjectid(){
        pi.setProjectid(projectid);
        assertEquals(projectid , pi.getProjectid());
    }


}
