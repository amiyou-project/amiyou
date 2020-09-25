package am.i.faculty.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import am.i.faculty.domain.StudentCourses;

@Repository
public interface StudentCoursesRepository extends JpaRepository<StudentCourses, Integer>{
	public List<StudentCourses> findByStudentId(int id);
	public List<StudentCourses> findByCourseIdAndStudentId(int courseId, int studentId);
}
