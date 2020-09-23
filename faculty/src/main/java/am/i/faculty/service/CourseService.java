package am.i.faculty.service;

import java.util.List;

import am.i.faculty.domain.Course;

public interface CourseService {
	public Course getCourseById(int id);
	public List<Course> getCourseByStudentId(int student_id);
	public List<Course> getAllCourse();
	public Course createCourse(Course c);
	public boolean registerStudent(int course_id, int student_id);
}
