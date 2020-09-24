package am.i.gateway.service;

import java.util.List;

import am.i.databaseBuilder.Attendance;
import am.i.databaseBuilder.Course;

public interface IService {
	public List<Course> getCourses();
	public List<Attendance> getStudents(int student_id, int course_id);
}
