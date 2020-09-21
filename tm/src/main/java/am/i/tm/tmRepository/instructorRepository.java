package am.i.tm.tmRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import am.i.tm.tmdomain.TMInstructor;

@Repository
public interface instructorRepository extends JpaRepository<TMInstructor, Integer>{

}
