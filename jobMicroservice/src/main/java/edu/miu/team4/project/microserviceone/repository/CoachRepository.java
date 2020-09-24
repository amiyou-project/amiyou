package edu.miu.team4.project.microserviceone.repository;

import edu.miu.team4.project.microserviceone.domain.Coach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoachRepository extends JpaRepository<Coach, Integer> {
    Coach findByStudentid(int id);
}
