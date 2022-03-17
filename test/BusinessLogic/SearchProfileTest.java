package BusinessLogic;


import businesslogic.SearchProfile;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertNotNull;

public class SearchProfileTest extends Mockito {

    @Mock
    SearchProfile searchProfileMock;

    @Before
    public void setup() {
        searchProfileMock = new SearchProfile();
    }

    @Test
    public void profileTest(){
        SearchProfile sp = searchProfileMock;
        sp.API ="https://www.freelancer-sandbox.com/api/users/0.1/portfolios/?limit=10&compact=true&portfolio_details=true&user_details=true&user_qualification_details=true&user_jobs=true&user_portfolio_details=true&user_recommendations=true&count=true&user_profile_description=true&users[]=";
        sp.API1 = "https://www.freelancer-sandbox.com/api/projects/0.1/projects/?limit=10&full_description=true&owners[]=";
        assertNotNull(sp.getResult("54630511"));

        assertNotNull(sp.getResult("98765432185207410"));

        sp.API = "hppts://localhost:9000";
        sp.API1 = "hppts://localhost:9000";
        sp.getResult("78945612");

    }

}
