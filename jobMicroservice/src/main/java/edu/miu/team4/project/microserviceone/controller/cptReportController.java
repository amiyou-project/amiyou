package edu.miu.team4.project.microserviceone.controller;

import am.i.student.domain.Student;
import edu.miu.team4.project.microserviceone.domain.CptReport;
import edu.miu.team4.project.microserviceone.service.CptReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cptReport")
public class cptReportController {

    @Autowired
    public CptReportService cptReportService;

    @GetMapping
    public String hello(){
        return "hello here cpt";
    }

    @GetMapping("/all")
    public List<CptReport> getAllcptReports(){
        return cptReportService.getAllcptReports();
    }

    @PostMapping("/saveCptReport")
    public CptReport saveCptReport(@RequestBody CptReport cptReport){
        return cptReportService.saveCptReport(cptReport);
    }
    @GetMapping("/students")
    public List<Student> getStudents(){
        return cptReportService.getStudents();
    }
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id) {
        return cptReportService.getStudentById(id);
    }
}
