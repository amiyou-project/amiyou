package am.i.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import am.i.student.domain.Student;

@Repository
public interface StudentDAO extends JpaRepository<Student,Integer>{
	public Student findByName(String name);
	public Student findByStudentId(int studentId);
	//public List<Student> findAllStudent();
}
