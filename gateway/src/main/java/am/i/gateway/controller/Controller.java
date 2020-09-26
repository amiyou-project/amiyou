package am.i.gateway.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import am.i.gateway.service.ServiceGatway;
import am.i.databaseBuilder.CPTReport;
import am.i.databaseBuilder.Course;
import am.i.databaseBuilder.Student;
import am.i.databaseBuilder.TMInstructor;

@RestController
public class Controller {
	@Autowired
	private ServiceGatway service;
	
	///========================Courses========================//
	
	@GetMapping("/courses")
	public List<Course> getCourses() {
		System.out.println("Did reach Controller");
		return service.getCourses();
	}
	
	@GetMapping("/courses/student/{student_id}")
	public List<Course> getStudentCourses(@PathVariable int student_id) {
		return service.getCourseByStudentId(student_id);
	}
	
	
	///========================Student========================//
	@GetMapping("/students")
	public List<Student> getStudents() {
		System.out.println("Did reach Controller");
		return service.getStudents();
	}
	
	///========================TM-INstructors========================//
	@GetMapping("/instructors")
	public List<TMInstructor> getTMInstructors() {
		System.out.println("Did reach Controller");
		return service.getTMInstrutor();
	}
	
	///========================JOb-Search========================//
	
	@GetMapping("/cptReport/byStudent")
	public List<CPTReport> getCPTReportsBy(@RequestParam int id) {
		System.out.println("Did reach Controller");
		return service.getCptReport(id);
	}
	
	
}
