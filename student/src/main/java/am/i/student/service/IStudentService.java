package am.i.student.service;

import java.util.List;

import am.i.faculty.domain.Course;
import am.i.student.domain.Student;
import dtos.CourseDTO;



public interface IStudentService {
	
public List<Student> getAllStudent();
	
	public Student getStudentById(int id);
	
	public Student getStudentByName(String name);

	public void addStudents(List<Student> stud);

	public Student updateStudentInfo(Student stud);

	public List<CourseDTO> getAllCoursesOfAStudent(int id);

	public Course updateStudentRegistration(int id, String title, String method);

}
