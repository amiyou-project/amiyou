package edu.miu.team4.project.microserviceone.service;

import edu.miu.team4.project.microserviceone.domain.CptReport;
import edu.miu.team4.project.microserviceone.repository.CptReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CptReportServiceImpl implements CptReportService{
    @Autowired
    public CptReportRepository cptReportRepository;


    @Override
    public CptReport saveCptReport(CptReport cptReport) {
        return cptReportRepository.save(cptReport);
    }

    @Override
    public List<CptReport> getAllcptReports() {
        return cptReportRepository.findAll();
    }
}
