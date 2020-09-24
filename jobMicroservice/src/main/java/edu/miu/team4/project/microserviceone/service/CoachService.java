package edu.miu.team4.project.microserviceone.service;

import edu.miu.team4.project.microserviceone.domain.Coach;

import java.util.List;

public interface CoachService {
    Coach saveCoach(Coach coach);
    Coach getCoach(int id);
    Coach getCoachById(int id);
    Coach assignStudent(int coach_id,int stud_id);
    Coach getCoachByStudentid(int id);

    List<Coach> getAllCoaches();
}
