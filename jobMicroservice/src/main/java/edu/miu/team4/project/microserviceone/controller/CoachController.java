package edu.miu.team4.project.microserviceone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job")
public class CoachController {
    @GetMapping
    public String hello(){
        return "hello here";
    }

    @PostMapping("/createJob")
    public void createJob(){

    }

}
