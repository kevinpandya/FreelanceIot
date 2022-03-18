package model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.LinkedHashMap;

public class SearchphraseresultTest {

    String owner_id ="112233";
    String date = "15 march 2022";
    String title ="php";
    int index = 1;
    String type = "fixed";
    String prevDesc = "I am looking to have someone build a responsive PHP page uses MYSQL to run search. I have PSD";
    LinkedHashMap<String, String> skills = new LinkedHashMap<String, String>();
    LinkedHashMap<String, Integer> wordStats = new LinkedHashMap<String, Integer>();

    Searchphraseresult spr;

    @Before
    public void setup(){
        spr = new Searchphraseresult();
    }

    @Test
    public void  testSkills(){
        skills.put("3" , "php");
        skills.put("4","java");
        spr.setSkills(skills);
        assertEquals(skills,spr.getSkills());
    }
    @Test
    public void testWordtstats(){
        wordStats.put("hello world" , 1);
        wordStats.put("good", 2);
        spr.setWordStats(wordStats);
        assertEquals(wordStats,spr.getWordStats());

    }
    @Test
    public void testOwnerid(){
        spr.setOwner_id(owner_id);
        assertEquals(owner_id, spr.getOwner_id());
    }
    @Test
    public void testDate(){
        spr.setDate(date);
        assertEquals(date, spr.getDate());
    }
    @Test
    public void testIndex(){
        spr.setIndex(index);
        assertEquals(index , spr.getIndex());
    }
    @Test
    public void testTitle(){
        spr.setTitle(title);
        assertEquals(title , spr.getTitle());
    }
    @Test
    public void testType(){
        spr.setType(type);
        assertEquals(type , spr.getType());
    }
    @Test
    public void testPrevdesc(){
        spr.setPrevDesc(prevDesc);
        assertEquals(prevDesc , spr.getPrevDesc());
    }
}
