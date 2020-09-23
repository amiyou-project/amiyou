package am.i.student.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import am.i.student.domain.Student;
import am.i.student.service.IStudentService;
import dtos.CourseDTO;
import am.i.databaseBuilder.Address;
import am.i.databaseBuilder.Course;

@RestController
public class StudentContoller {

	@Autowired
	private IStudentService studentService;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	private CourseDTO convertToCourseDTO(Course course) {
		   CourseDTO courseDto = modelMapper.map(course, CourseDTO.class);
		   return courseDto;
	}
	
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
	public List<CourseDTO> fetchStudentCourses(@PathVariable int id) {
		return studentService.getAllCoursesOfAStudent(id).stream().map((obj)-> convertToCourseDTO(obj)).collect(Collectors.toList());
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
	public CourseDTO updateStudentcourse(@PathVariable int id,@RequestParam String method,@RequestParam String title) {
		return convertToCourseDTO(studentService.updateStudentRegistration(id,title,method));
	}
	
	
}
