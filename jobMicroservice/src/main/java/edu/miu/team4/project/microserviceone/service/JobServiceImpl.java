package edu.miu.team4.project.microserviceone.service;

import edu.miu.team4.project.microserviceone.domain.Job;
import edu.miu.team4.project.microserviceone.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class JobServiceImpl implements JobService{
    @Autowired
    public JobRepository jobRepository;


    @Override
    public Job saveJob(Job job) {
        return jobRepository.save(job);
    }

    @Override
    public List<Job> getAllJob() {
        return jobRepository.findAll();
    }
}
