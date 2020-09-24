package am.i.gateway.service;

import java.util.List;

import am.i.databaseBuilder.Course;
import am.i.databaseBuilder.Student;

public interface IService {
	public List<Course> getCourses();

	List<Student> getStudents();
}
