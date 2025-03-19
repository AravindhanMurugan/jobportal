package com.linkedin.jobportal.repository;

import com.linkedin.jobportal.model.JobPost;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobRepository extends MongoRepository<JobPost, String> {
}
