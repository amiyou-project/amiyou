package am.i.faculty.service;

import java.util.List;

import am.i.faculty.domain.Course;
import am.i.faculty.domain.StudentCourses;

public interface CourseService {
	public Course getCourseById(int id);
	public List<Course> getCourseByStudentId(int student_id);
	public List<Course> getAllCourse();
	public Course createCourse(Course c);
	public StudentCourses registerStudent(int course_id, int student_id);
	public boolean deleteCourse(int id);
	public boolean unregisterStudent(int course_id, int student_id);
}
