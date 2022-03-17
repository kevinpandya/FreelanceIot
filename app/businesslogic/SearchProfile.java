package businesslogic;

import model.Profile;
import model.projectInfo;
import model.Resultlist;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.text.DateFormat;

import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

/**
 * @author Harshal
 *
 */
public class SearchProfile {
   public String API = "https://www.freelancer.com/api/users/0.1/portfolios/?limit=10&compact=true&portfolio_details=true&user_details=true&user_qualification_details=true&user_jobs=true&user_portfolio_details=true&user_recommendations=true&count=true&user_profile_description=true&users[]=";
    public String API1 ="https://www.freelancer.com/api/projects/0.1/projects/?limit=10&full_description=true&owners[]=";
    public SearchProfile() {

    }
    public CompletionStage<LinkedHashMap<String, Profile>> getResult(String id) {
        return CompletableFuture.supplyAsync(()-> this.getProfileResult(id));
    }


    public LinkedHashMap<String, Profile> getProfileResult(String id) {
        Profile p = new Profile();
        LinkedHashMap<String, Profile> resultmap = new LinkedHashMap<String, Profile>();
        //List<Profile> projects = new ArrayList<Profile>();
        List<projectInfo> projectInfos = new ArrayList<projectInfo>();
        try {
            URL url = new URL(this.API + id);
            URL url1 = new URL(this.API1 + id);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            HttpURLConnection conn1 = (HttpURLConnection) url1.openConnection();
            conn.setRequestMethod("GET");
            conn1.setRequestMethod("GET");
            conn1.connect();
            conn.connect();
            if(conn1.getResponseCode() == 200)
            {
                Scanner scan = new Scanner(url1.openStream());
                String temp = "";
                while (scan.hasNext()) {
                    temp = temp + scan.nextLine();
                }
                JSONObject json = null;
                json = new JSONObject(temp);
                JSONObject result = null;
                result = json.getJSONObject("result");

                JSONArray temp_Projects = null;
                temp_Projects = result.getJSONArray("projects");
                for(int i=0;i<temp_Projects.length();i++){
                    JSONObject obj = temp_Projects.getJSONObject(i);
                    projectInfo pi = new projectInfo();
                    //System.out.println("================"+i+1+"===============");
                    pi.setTitle(obj.get("title").toString());
                    //System.out.println(pi.getTitle());
                    pi.setProjectid(obj.get("id").toString());
                    //System.out.println(pi.getProjectid());
                    pi.setDescription(obj.get("description").toString());
                    //System.out.println(pi.getDescription());
                    Date date = new Date(Long.parseLong(obj.get("submitdate").toString()+"000"));
                    DateFormat simple = new SimpleDateFormat("dd MMM yyyy");
                    pi.setSubmitdate(simple.format(date));
                    //System.out.println(pi.getSubmitdate());
                    projectInfos.add(pi);
                }
            }
            if (conn.getResponseCode() == 200)
            {
                Scanner scan = new Scanner(url.openStream());
                String temp = "";
                while (scan.hasNext()) {
                    temp = temp + scan.nextLine();
                }
                JSONObject json = null;
                json = new JSONObject(temp);
                JSONObject result = null;
                result = json.getJSONObject("result");
//              JSONObject temp_portfolios = null;
//              temp_portfolios = result.getJSONObject("portfolios");
//              JSONArray portfolios =  null;
//              int p_length = 0;
//              try{
//                     portfolios = temp_portfolios.getJSONArray(id);
//                     p_length = portfolios.length();
//                 }catch(JSONException e){
//                     portfolios = null;
//                 }
                JSONObject temp_users = null;
                temp_users =  result.getJSONObject("users");
                JSONObject users = null;
                users = temp_users.getJSONObject(id);
                //JSONArray projects = (JSONArray) result.getJSONArray("projects");
//                for (int i = 0; i < p_length; i++) {
//
//                    JSONObject obj = null;
//                    obj = portfolios.getJSONObject(i);
//                    //p.setId(obj.get("id").toString());
//                    //p.setTitle(obj.get("title").toString());
//                    //p.setProfiledescription(obj.get("profiledescription").toString());
//
//
//                    projectInfo p1 = null;
//                    p1 = new projectInfo();
//
//                    p1.setTitle(obj.get("title").toString());
//                    p1.setDescription(obj.get("description").toString());
//                    Date date = new Date(Long.parseLong(obj.get("last_modify_date").toString()+"000"));
//                    DateFormat simple = new SimpleDateFormat("dd MMM yyyy");
//                    p1.setLastmodifydate(simple.format(date));
//                 //   p1.setLastmodifydate(obj.get("last_modify_date").toString());
//                    p1.setPortfolioid(obj.get("id").toString());
//
//                    projectInfos.add(p1);
//                    //projects.add(p);
//                    System.out.println("Here");
//                }
//                //projects.add(p);

                //JSONObject obj = users.getJSONObject(String.valueOf((i)));
                JSONObject obj = null;
                obj = users;
                ///======================================================================
                //System.out.println(projectInfos);
                p.setProjects(projectInfos);
                p.setId(this.getJSONResult(obj,"id"));
                p.setUsername(this.getJSONResult(obj,"username"));
                LinkedHashMap<String, String> skillsmap = new LinkedHashMap<String, String>();
                JSONArray skills = null;
                skills = obj.getJSONArray("jobs");
                for (int j = 0; j < skills.length(); j++) {
                    JSONObject skill = null;
                    skill = skills.getJSONObject(j);
                    skillsmap.put(this.getJSONResult(skill ,"name") , this.getJSONResult(skill,"id"));
                    //     skillsmap.put(skill.get("name").toString(), skill.get("id").toString());
                }
                p.setSkills(skillsmap);
                //projects.add(p);
                p.setProfiledescription(this.getJSONResult(obj,"profile_description"));
                p.setHourylyrate(this.getJSONResult(obj,"hourly_rate"));
                Date date = new Date(Long.parseLong(this.getJSONResult(obj,"registration_date")+"000"));
                DateFormat simple = new SimpleDateFormat("dd MMM yyyy");
                p.setRegistrationdate(simple.format(date));
                //   p.setRegistrationdate(this.getJSONResult(obj,"registration_date"));
                p.setDisplayname(this.getJSONResult(obj,"display_name"));
                p.setPublicname(this.getJSONResult(obj,"public_name"));
                p.setCompany(this.getJSONResult(obj,"company"));
                JSONObject location = null;
                location =  obj.getJSONObject("location");
                JSONObject country = null;
                country = location.getJSONObject("country");
                JSONObject primary_currency = null;
                primary_currency = obj.getJSONObject("primary_currency");
                p.setCode(this.getJSONResult(primary_currency,"code"));
                p.setSign(this.getJSONResult(primary_currency,"sign"));
                p.setCurrencyname(this.getJSONResult(primary_currency,"name"));;
                JSONObject status = null;
                status = obj.getJSONObject("status");
                p.setEmailverified(this.getJSONResult(status,"email_verified"));
                p.setCountry(this.getJSONResult(country,"name"));
                p.setCity(this.getJSONResult(location,"city"));
                p.setRecommendations(this.getJSONResult(obj,"recommendations"));
                p.setRole(this.getJSONResult(obj,"role"));
                p.setChosenrole(this.getJSONResult(obj,"chosen_role"));
                p.setPrimarylanguage(this.getJSONResult(obj,"primary_language"));
                p.setLimitedaccount(this.getJSONResult(obj,"limited_account"));
                JSONObject timezone =null;
                timezone = obj.getJSONObject("timezone");
                p.setTimezone(this.getJSONResult(timezone,"timezone"));
                LinkedHashMap<String, String> qualificationsmap = new LinkedHashMap<String, String>();
                JSONArray qualifications = null;
                qualifications= obj.getJSONArray("qualifications");
                for (int j = 0; j < qualifications.length(); j++) {
                    JSONObject qualification = null;
                    qualification = qualifications.getJSONObject(j);
                    qualificationsmap.put(this.getJSONResult(qualification ,"name") , this.getJSONResult(qualification ,"id"));
                    //       qualificationsmap.put(qualification.get("name").toString(), qualification.get("id").toString());

                }
                p.setQualifications(qualificationsmap);

                //projects.add(p);

                //p.set
                //resultmap.put(skillstring,r1);
            }
            resultmap.put(p.getPublicname(),p);
            conn.disconnect();
            conn1.disconnect();
        } catch (Exception e) {
            System.out.println(e);

        }
        return resultmap;
    }

    public String getJSONResult(JSONObject obj,String key){
        String result = null;
        try{
            result = obj.get(key).toString();
        }catch(JSONException e){
            result = null;
        }
        return result;
    }
}