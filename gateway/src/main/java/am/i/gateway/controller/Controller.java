package am.i.gateway.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import am.i.gateway.service.ServiceGatway;
import am.i.databaseBuilder.Course;
import am.i.databaseBuilder.Student;

@RestController
public class Controller {
	@Autowired
	private ServiceGatway service;
	
	@GetMapping("/courses")
	public List<Course> getCourses() {
		System.out.println("Did reach Controller");
		return service.getCourses();
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		System.out.println("Did reach Controller");
		return service.getStudents();
	}
}
