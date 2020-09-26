package am.i.gateway.service;

import java.util.List;

import am.i.databaseBuilder.CPTReport;
import am.i.databaseBuilder.Course;
import am.i.databaseBuilder.Student;
import am.i.databaseBuilder.TMInstructor;

public interface IService {
	public List<Course> getCourses();

	List<Student> getStudents();
	List<TMInstructor> getTMInstrutor();
	List<CPTReport> getCptReport(int id);
	public List<Course> getCourseByStudentId(int student_id);
}
