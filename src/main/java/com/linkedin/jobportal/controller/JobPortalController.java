package com.linkedin.jobportal.controller;

import com.linkedin.jobportal.model.JobPost;
import com.linkedin.jobportal.service.JobPortalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobPortalController {

    @Autowired
    public JobPortalService jobPortalService;

    @GetMapping("/jobs")
    public List<JobPost> getAllJobs() {
        return jobPortalService.getAllJobs();
    }
}
