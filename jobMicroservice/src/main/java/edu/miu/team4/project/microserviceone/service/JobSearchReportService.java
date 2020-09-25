package edu.miu.team4.project.microserviceone.service;

import am.i.databaseBuilder.Student;
import edu.miu.team4.project.microserviceone.domain.CptReport;
import edu.miu.team4.project.microserviceone.domain.JobSearchReport;

import java.util.List;

public interface JobSearchReportService {
    JobSearchReport saveJobSearchReport(JobSearchReport jobSearchReport);
    List<JobSearchReport> getAllJobSearchReport();
    JobSearchReport getJobSearchReportByStudentid(int id);
}
