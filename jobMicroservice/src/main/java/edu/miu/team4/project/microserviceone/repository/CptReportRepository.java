package edu.miu.team4.project.microserviceone.repository;

import edu.miu.team4.project.microserviceone.domain.CptReport;
import edu.miu.team4.project.microserviceone.domain.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CptReportRepository  extends JpaRepository<CptReport, String> {
}
