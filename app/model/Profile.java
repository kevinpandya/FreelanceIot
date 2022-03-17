package model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Profile
{
    String id;
    String username;
    String displayname;
    String publicname;
    private LinkedHashMap<String, String> skills =null;
    String hourylyrate;
    String title;
    String profiledescription;
    String recommendations;
    String country;
    String city;
    String company;
    private LinkedHashMap<String, String> qualifications =null;
    String role;
    String registrationdate;
    String chosenrole;
    String primarylanguage;
    String limitedaccount;
    String code;
    String sign;
    String emailverified;
    String currencyname;
    String timezone;
    List<projectInfo> projects =null;
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @return the username
     */
    public String getRegistrationdate(){return registrationdate;}
    /**
     * @param  registrationdate the id to set
     */
    public void setRegistrationdate(String registrationdate) {   this.registrationdate = registrationdate;}

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    public String getChosenrole() {
        return chosenrole;
    }
    public void setChosenrole(String chosenrole) {
        this.chosenrole = chosenrole;
    }

    public String getPrimarylanguage() {
        return primarylanguage;
    }
    public void setPrimarylanguage(String primarylanguage) {
        this.primarylanguage = primarylanguage;
    }

    public String getLimitedaccount() {
        return limitedaccount;
    }
    public void setLimitedaccount(String limitedaccount) {
        this.limitedaccount = limitedaccount;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getSign() {
        return sign;
    }
    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getEmailverified() {
        return emailverified;
    }
    public void setEmailverified(String emailverified) {
        this.emailverified = emailverified;
    }

    public String getCurrencyname() {
        return currencyname;
    }
    public void setCurrencyname(String currencyname) {
        this.currencyname = currencyname;
    }

    public String getTimezone() {
        return timezone;
    }
    public void setTimezone(String timezone) {
        this.timezone    = timezone;
    }
    /**
     * @return the username
     */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * @return the displayname
     */
    public String getDisplayname() {
        return displayname;
    }
    /**
     * @param displayname the displayname to set
     */
    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }
    /**
     * @return the publicname
     */
    public String getPublicname() {
        return publicname;
    }
    /**
     * @param publicname the publicname to set
     */
    public void setPublicname(String publicname) {
        this.publicname = publicname;
    }
    /**
     * @return the skills
     */
    public HashMap<String, String> getSkills() {
        return skills;
    }

    public void setSkills(LinkedHashMap<String, String> skills) {
      this.skills =   new LinkedHashMap<String, String>();
      this.skills = skills;
    }
   /**
     * @return the hourylyrate
     */
    public String getHourylyrate() {
        return hourylyrate;
    }
    /**
     * @param hourylyrate the hourylyrate to set
     */
    public void setHourylyrate(String hourylyrate) {
        this.hourylyrate = hourylyrate;
    }
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * @return the profiledescription
     */
    public String getProfiledescription() {
        return profiledescription;
    }
    /**
     * @param profiledescription the profiledescription to set
     */
    public void setProfiledescription(String profiledescription) {
        this.profiledescription = profiledescription;
    }
    /**
     * @return the recommendations
     */
    public String getRecommendations() {
        return recommendations;
    }
    /**
     * @param recommendations the recommendations to set
     */
    public void setRecommendations(String recommendations) {
        this.recommendations = recommendations;
    }
    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }
    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }
    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }
    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }
    /**
     * @return the company
     */
    public String getCompany() {
        return company;
    }
    /**
     * @param company the company to set
     */
    public void setCompany(String company) {
        this.company = company;
    }
    /**
     * @return the qualification
     */
    public HashMap<String, String> getQualifications() {
        return qualifications;
    }

    public void setQualifications(LinkedHashMap<String, String>  qualifications) {
        this.qualifications = new LinkedHashMap<String, String>();
        this.qualifications = qualifications;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }
    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }
    /**
     * @return the projects
     */
    public List<projectInfo> getProjects() {
        return projects;
    }
    /**
     * @param projects the projects to set
     */
  public void setProjects(List<projectInfo> projects) {
        this.projects = projects;
    }
    @Override
    public String toString() {
        return "Profile [id=" + id + ", username=" + username + ", registrationdate="+ registrationdate + ", chosenrole="+ chosenrole + ", displayname=" + displayname + ", publicname="
                + publicname + ", skills=" + skills + ", code=" + code + ", emailverified=" + emailverified + ", sign=" + sign + ", primarylanguage=" + primarylanguage + ", limitedaccount=" + limitedaccount + ", hourylyrate=" + hourylyrate + ", title=" + title
                + ", profiledescription=" + profiledescription + ", recommendations=" + recommendations + ", currencyname=" + currencyname + ", country="
                + country + ", city=" + city + ", company=" + company + ", timezone=" + timezone + ", qualification=" + qualifications + ", role="
                + role + ", projects=" + projects +  "]";
    }

}
