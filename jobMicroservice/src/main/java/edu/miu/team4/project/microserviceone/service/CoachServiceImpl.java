package edu.miu.team4.project.microserviceone.service;

import edu.miu.team4.project.microserviceone.domain.Coach;
import edu.miu.team4.project.microserviceone.domain.Job;
import edu.miu.team4.project.microserviceone.repository.CoachRepository;
import edu.miu.team4.project.microserviceone.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CoachServiceImpl implements CoachService{
    @Autowired
    public CoachRepository coachRepository;


    @Override
    public Coach saveCoach(Coach coach) {
        return coachRepository.save(coach);
    }

    @Override
    public Coach getCoach(int id) {
        return null;
    }

    @Override
    public Coach getCoachById(int id) {
        if(coachRepository.findById(id).isPresent()){
            return coachRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public Coach assignStudent(int coach_id, int stud_id) {
        Coach coach = getCoachById(coach_id);
        coach.addStudent_id(stud_id);
        return saveCoach(coach);
    }

    @Override
    public Coach getCoachByStudentid(int id) {
        return coachRepository.findByStudentid(id);
    }

    @Override
    public List<Coach> getAllCoaches() {
        return coachRepository.findAll();
    }

//    @Override
//    public Coach getCoach(int id) {
//        return coachRepository.findById(id);
//    }
}
