package am.i.student.service;

import java.util.List;

import am.i.student.domain.Student;



public interface IStudentService {
	
public List<Student> getAllStudent();
	
	public Student getStudentById(int id);
	
	public Student getStudentByName(String name);

	public void addStudents(List<Student> stud);

	public Student updateStudentInfo(Student stud);

	public List<am.i.databaseBuilder.Course> getAllCoursesOfAStudent(int id);

	public am.i.databaseBuilder.Course updateStudentRegistration(int id, String title, String method);

}
