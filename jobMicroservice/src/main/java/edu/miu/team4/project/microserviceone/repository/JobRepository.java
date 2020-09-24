package edu.miu.team4.project.microserviceone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.miu.team4.project.microserviceone.domain.Job;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, String> {
}
