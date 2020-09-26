package am.i.student.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import am.i.faculty.domain.Course;
import am.i.student.domain.Student;
import dtos.CPTReportDTO;
import dtos.CourseDTO;
import dtos.JobSearchReportDTO;



public interface IStudentService {
	
public List<Student> getAllStudent();
	
	public Student getStudentById(int id);
	
	public Student getStudentByName(String name);

	public void addStudents(List<Student> stud);

	public Student updateStudentInfo(Student stud);
	
	public Student createStudentInfo(Student stud);

	public List<CourseDTO> getAllCoursesOfAStudent(int id);

	List<CourseDTO> getAllCourses();

	List<CourseDTO> getAllTakenCourses(int id);
	
	public CourseDTO registerInACourse(int courseId,int studentId);

	public CPTReportDTO submitACPTReport(CPTReportDTO rprt,int id);
	public JobSearchReportDTO submitJObReport(JobSearchReportDTO jRprt,int id);

	public void cancellAregisterInACourse(int course_id, int id);

}
