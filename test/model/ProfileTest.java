package model;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProfileTest {

    String id = "112233";
    String username = "Webcaptain";
    String displayname = "webcap";
    String publicname = "webcaptain";
    LinkedHashMap<String, String> skills = new LinkedHashMap<String, String>();;
    String hourylyrate ="23";
    String title = "Hiring for java";
    String profiledescription = " I have depth knowledge in java ";
    String recommendations = "90";
    String country = "India";
    String city = "Ahmedabad";
    String company = "softvan";
    LinkedHashMap<String, String> qualifications = new LinkedHashMap<String, String>();;
    String role ="Freelancer";
    String registrationdate ="12 March 2022";
    String chosenrole = "Employer";
    String primarylanguage = "english";
    String limitedaccount = "Closed";
    String code = "ind";
    String sign ="xyz";
    String emailverified= "yes";
    String currencyname = "rupees";
    String timezone = "asian";
    List<projectInfo> projects = Arrays.asList(new projectInfo[]{});

    Profile p ;

    @Before
    public void setup(){
        p = new Profile();
    }
    @Test 
    public void testId(){
        p.setId(id);
        assertEquals(id , p.getId());
    }
    @Test
    public void testUsername(){
        p.setUsername(username);
        assertEquals(username, p.getUsername());
    }
    @Test
    public void testDisplayname(){
        p.setDisplayname(displayname);
        assertEquals(displayname , p.getDisplayname());
    }
    @Test
    public void testPublicname(){
        p.setPublicname(publicname);
        assertEquals(publicname , p.getPublicname());
    }
    @Test
    public void testHourlyrate(){
        p.setHourylyrate(hourylyrate);
        assertEquals(hourylyrate , p.getHourylyrate());
    }
    @Test
    public void testTitle(){
        p.setTitle(title);
        assertEquals(title ,p.getTitle());
    }
    @Test
    public void testProfiledescription(){
        p.setProfiledescription(profiledescription);
        assertEquals(profiledescription , p.getProfiledescription());
    }
    @Test
    public void testRecommendations(){
        p.setRecommendations(recommendations);
        assertEquals(recommendations , p.getRecommendations());
    }
    @Test
    public void testCountry(){
        p.setCountry(country);
        assertEquals(country , p.getCountry());
    }
    @Test
    public void testCity(){
        p.setCity(city);
        assertEquals(city , p.getCity());
    }
    @Test
    public void testCode(){
        p.setCode(code);
        assertEquals(code , p.getCode());
    }
    @Test
    public void testCompany(){
        p.setCompany(company);
        assertEquals(company , p.getCompany());
    }
    @Test
    public void testSign(){
        p.setSign(sign);
        assertEquals(sign , p.getSign());
    }
    @Test
    public void testRole(){
        p.setRole(role);
        assertEquals(role , p.getRole());
    }
    @Test
    public void testChosenrole(){
        p.setChosenrole(chosenrole);
        assertEquals(chosenrole, p.getChosenrole());
    }
    @Test
    public void testRegistrationdate(){
        p.setRegistrationdate(registrationdate);
        assertEquals(registrationdate , p.getRegistrationdate());
    }
    @Test
    public void testLimitedAccount(){
        p.setLimitedaccount(limitedaccount);
        assertEquals(limitedaccount , p.getLimitedaccount());
    }
    @Test
    public void testPrimarylanguage(){
        p.setPrimarylanguage(primarylanguage);
        assertEquals(primarylanguage , p.getPrimarylanguage());
    }
    @Test
    public void testEmailverified(){
        p.setEmailverified(emailverified);
        assertEquals(emailverified , p.getEmailverified());
    }
    @Test
    public void testCurrencyname(){
        p.setCurrencyname(currencyname);
        assertEquals(currencyname , p.getCurrencyname());
    }
    @Test
    public void testTimezone(){
        p.setTimezone(timezone);
        assertEquals(timezone , p.getTimezone());
    }
    @Test
    public void testProjects(){
        p.setProjects(projects);
        assertEquals(projects , p.getProjects());
    }
    @Test
    public void testSkills(){
        skills.put("3","php");
        skills.put("4","java");
        p.setSkills(skills);
        assertEquals(skills, p.getSkills());
    }
    @Test
    public void testQualification(){
        qualifications.put("4" , "java");
        p.setQualifications(qualifications);
        assertEquals(qualifications , p.getQualifications());
    }

}
