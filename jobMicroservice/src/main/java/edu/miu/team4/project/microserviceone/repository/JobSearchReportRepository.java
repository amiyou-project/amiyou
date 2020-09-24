package edu.miu.team4.project.microserviceone.repository;

import edu.miu.team4.project.microserviceone.domain.JobSearchReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobSearchReportRepository extends JpaRepository<JobSearchReport, String> {
}
