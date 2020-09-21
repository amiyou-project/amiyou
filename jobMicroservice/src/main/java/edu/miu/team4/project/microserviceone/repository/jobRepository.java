package edu.miu.team4.project.microserviceone.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import edu.miu.team4.project.microserviceone.domain.Job;

public interface jobRepository extends JpaRepository<Job, String>{
}
