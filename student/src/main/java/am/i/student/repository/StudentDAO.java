package am.i.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import am.i.student.domain.Student;

@Repository
public interface StudentDAO extends JpaRepository<Student,Integer>{

}
