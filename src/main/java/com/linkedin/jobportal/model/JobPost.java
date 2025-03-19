package com.linkedin.jobportal.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "jobpost")
public class JobPost {
    public String id;
    public String jobtitle;
    public String exp;
    public String[] skills;

    public JobPost() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }
}
