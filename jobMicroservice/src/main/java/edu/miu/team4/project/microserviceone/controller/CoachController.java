package edu.miu.team4.project.microserviceone.controller;

import am.i.student.domain.Student;
import edu.miu.team4.project.microserviceone.domain.Job;
import edu.miu.team4.project.microserviceone.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/job")
public class CoachController {
    @Autowired
    public JobService jobService;

    @GetMapping
    public String hello(){
        return "hello here";
    }

    @PostMapping("/createJob")
    public Job createJob(@RequestBody Job job){
        return jobService.saveJob(job);

    }
//    @PostMapping("/assignStudent")
//    public List<Student> assignStudent(int id){
//    cpt.getstud
//        return students.add(student);
//
//    }
}
