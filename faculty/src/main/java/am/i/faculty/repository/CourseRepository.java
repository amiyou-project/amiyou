package am.i.faculty.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import am.i.faculty.domain.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
	//public List<Course> findByStudentId(int id);
}

