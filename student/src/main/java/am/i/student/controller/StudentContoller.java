package am.i.student.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import am.i.student.domain.Student;

@RestController
public class StudentContoller {

	@GetMapping("/test")
	public String testtt() {
		return "My Test";
	}
	
	@GetMapping("/teststudents")
	public List<Student> getStudent() {
		List<Student> studs = new ArrayList<>();
		studs.add(new Student(111140,new java.util.Date()));
		studs.add(new Student(111141,new java.util.Date()));
		studs.add(new Student(111142,new java.util.Date()));
		studs.add(new Student(111143,new java.util.Date()));
		studs.add(new Student(111144,new java.util.Date()));
		return studs;
	}
	
}
