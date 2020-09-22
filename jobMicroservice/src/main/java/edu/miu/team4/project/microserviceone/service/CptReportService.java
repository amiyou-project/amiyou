package edu.miu.team4.project.microserviceone.service;

import edu.miu.team4.project.microserviceone.domain.CptReport;

import java.util.List;

public interface CptReportService {
    public CptReport saveCptReport(CptReport cptReport);
    public List<CptReport> getAllcptReports();
}
