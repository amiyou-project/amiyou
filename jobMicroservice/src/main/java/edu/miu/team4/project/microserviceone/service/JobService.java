package edu.miu.team4.project.microserviceone.service;

import edu.miu.team4.project.microserviceone.domain.Job;

import java.util.List;

public interface JobService {
    public Job saveJob(Job job);
    List<Job> getAllJob();
}
