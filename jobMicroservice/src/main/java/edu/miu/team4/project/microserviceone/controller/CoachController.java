package edu.miu.team4.project.microserviceone.controller;

import edu.miu.team4.project.microserviceone.DTO.Student;
import edu.miu.team4.project.microserviceone.domain.Coach;
import edu.miu.team4.project.microserviceone.domain.CptReport;
import edu.miu.team4.project.microserviceone.domain.Job;
import edu.miu.team4.project.microserviceone.domain.JobSearchReport;
import edu.miu.team4.project.microserviceone.service.CoachService;
import edu.miu.team4.project.microserviceone.service.CptReportService;
import edu.miu.team4.project.microserviceone.service.JobSearchReportService;
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

    @Autowired
    public JobSearchReportService jobSearchReportService;

    @Autowired
    public CoachService coachService;

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

    @PostMapping("/createJobSearchReport")
    public JobSearchReport createJob(@RequestBody JobSearchReport jobSearchReport){
        return jobSearchReportService.saveJobSearchReport(jobSearchReport);

    }
    @GetMapping("/all")
    public List<Coach> getCoaches(){
        return coachService.getAllCoaches();
    }


    public Student getStudentById(int id) {
        return cptReportService.getStudentById(id);
    }

    @PatchMapping("/assignStudent")
    public Coach assignStudent(@RequestParam int coach_id, @RequestParam int stud_id){
        return coachService.assignStudent(coach_id,stud_id);

    }
    @GetMapping("/getCoachByStudentid/{id}")
    public Coach getCoachByStudentid(@PathVariable int id) {
        return coachService.getCoachByStudentid(id);
    }

    @GetMapping("/saveCoaches")
    public Coach saveCoaches(Coach coach){
        return coachService.saveCoach(coach);
    }
}
