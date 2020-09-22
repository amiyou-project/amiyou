package edu.miu.team4.project.microserviceone.service;

import am.i.student.domain.Student;
import edu.miu.team4.project.microserviceone.domain.CptReport;
import edu.miu.team4.project.microserviceone.repository.CptReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CptReportServiceImpl implements CptReportService{
    @Autowired
    public CptReportRepository cptReportRepository;

    @Autowired
    private RestTemplate restTemplate;


    @Override
    public CptReport saveCptReport(CptReport cptReport) {
        return cptReportRepository.save(cptReport);
    }

    @Override
    public List<CptReport> getAllcptReports() {
        return cptReportRepository.findAll();
    }

    @Override
    public List<Student> getStudents() {
        return restTemplate.getForObject("http://localhost:8085/students",List.class);
    }

    @Override
    public Student getStudentById(int id) {
        return restTemplate.getForObject("http://localhost:8085/students/{id}",Student.class);
    }
}
