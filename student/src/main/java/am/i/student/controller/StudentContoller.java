package am.i.student.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import am.i.faculty.domain.Course;
import am.i.student.domain.Address;
import am.i.student.domain.Person;
import am.i.student.domain.Student;
import am.i.student.service.IStudentService;

@RestController
public class StudentContoller {

	@Autowired
	private IStudentService studentService;
	
	@GetMapping()
	public void homeinit1() {
		List<Student> studs = new ArrayList<>();
		studs.add(new Student("Gkane",new Address("streetA","cityA","stateA",4365,"countrA"),111140,new java.util.Date()));
		studs.add(new Student("Bkane",new Address("streetB","cityB","stateB",4365,"countrB"),111141,new java.util.Date()));
		studs.add(new Student("Ckane",new Address("streetC","cityC","stateC",4365,"countrC"),111142,new java.util.Date()));
		
		studentService.addStudents(studs);
	}
	
	@GetMapping("/test")
	public String testtt() {
		return "My Test";
	}
	
	@GetMapping("/students")
	public List<Student> fetchStudents() {
		return studentService.getAllStudent();
	}
	
	@GetMapping("/students/{id}/courses")
	public List<Course> fetchStudentCourses(@PathVariable int id) {
		return studentService.getAllCoursesOfAStudent(id);
	}
	
	
	@GetMapping("/students/{id}")
	public Student fetchStudById(@PathVariable int id) {
		return studentService.getStudentById(id);
	}
	
	
	@GetMapping("/students/byName")
	public Student fetchBYName(@RequestParam String name) {
		return studentService.getStudentByName(name);
	}
	
	@GetMapping("/teststudents")
	public List<Student> getStudent() {
		List<Student> studs = new ArrayList<>();
		studs.add(new Student("Gkane",new Address("streetA","cityA","stateA",4365,"countrA"),111140,new java.util.Date()));
		studs.add(new Student("Bkane",new Address("streetB","cityB","stateB",4365,"countrB"),111141,new java.util.Date()));
		studs.add(new Student("Ckane",new Address("streetC","cityC","stateC",4365,"countrC"),111142,new java.util.Date()));
		return studs;
	}
	
	@PostMapping("/students")
	public Student updateCreateStudentInfo(@RequestBody Student stud) {
		return studentService.updateStudentInfo(stud);
	}
	
	
	@GetMapping("/students/{id}/update_course")
	public Course updateStudentcourse(@PathVariable int id,@RequestParam String method,@RequestParam String title) {
		return studentService.updateStudentRegistration(id,title,method);
	}
	
	
	
	
}
