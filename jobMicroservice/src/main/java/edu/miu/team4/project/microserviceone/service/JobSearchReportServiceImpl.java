package edu.miu.team4.project.microserviceone.service;


import am.i.databaseBuilder.Student;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import edu.miu.team4.project.microserviceone.domain.CptReport;
import edu.miu.team4.project.microserviceone.domain.JobSearchReport;
import edu.miu.team4.project.microserviceone.repository.CptReportRepository;
import edu.miu.team4.project.microserviceone.repository.JobSearchReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class JobSearchReportServiceImpl implements JobSearchReportService {
    @Autowired
    public JobSearchReportRepository jobSearchReportRepository;

    @Override
    public JobSearchReport saveJobSearchReport(JobSearchReport jobSearchReport) {
        return jobSearchReportRepository.save(jobSearchReport);
    }

    @Override
    public List<JobSearchReport> getAllJobSearchReport() {
        return jobSearchReportRepository.findAll();
    }
}
