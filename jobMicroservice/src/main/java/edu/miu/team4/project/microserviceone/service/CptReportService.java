package edu.miu.team4.project.microserviceone.service;

import edu.miu.team4.project.microserviceone.DTO.Student;
import edu.miu.team4.project.microserviceone.domain.CptReport;

import java.util.List;

public interface CptReportService {
    CptReport saveCptReport(CptReport cptReport);
    List<CptReport> getAllcptReports();
    List<Student> getStudents();
    Student getStudentById(int id);
}
