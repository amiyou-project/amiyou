package edu.miu.team4.project.microserviceone.controller;

import am.i.student.domain.Student;
import edu.miu.team4.project.microserviceone.domain.CptReport;
import edu.miu.team4.project.microserviceone.domain.Job;
import edu.miu.team4.project.microserviceone.service.CptReportService;
import edu.miu.team4.project.microserviceone.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coach")
public class CoachController {
    @Autowired
    public JobService jobService;

    @Autowired
    public CptReportService cptReportService;

    @GetMapping
    public String hello(){
        return "hello here";
    }

    @PostMapping("/createJob")
    public Job createJob(@RequestBody Job job){
        return jobService.saveJob(job);

    }
    @GetMapping("/students")
    public List<Student> getStudents(){

        return cptReportService.getStudents();
    }
    @GetMapping(value = {"/studentsList"})
    public String getStudentList(Model model){
        model.addAttribute("allStudents", getStudents());
        return "studentList";
    }
//    @PostMapping("/assignStudent")
//    public List<Student> assignStudent(int id){
//    cpt.getstud
//        return students.add(student);
//
//    }
}