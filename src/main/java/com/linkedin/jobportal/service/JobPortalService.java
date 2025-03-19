package com.linkedin.jobportal.service;

import com.linkedin.jobportal.model.JobPost;
import com.linkedin.jobportal.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPortalService {

    @Autowired
    JobRepository jobRepository;

    public List<JobPost> getAllJobs() {
        return jobRepository.findAll();
    }
}
