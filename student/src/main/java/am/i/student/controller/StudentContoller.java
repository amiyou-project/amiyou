package am.i.student.controller;

import java.util.ArrayList;
import java.util.Arrays;
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

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import am.i.student.domain.Student;
import am.i.student.service.IStudentService;
import dtos.CPTReportDTO;
import dtos.CourseDTO;
import dtos.JobSearchReportDTO;
import am.i.databaseBuilder.Address;
import am.i.faculty.domain.Course;

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
	
	@GetMapping("/testinit")
	public void homeinit1() {
		List<Student> studs = new ArrayList<>();
		
		
		  Student stud1 = new Student("Gkane",1,111140,new java.util.Date());
				  stud1.setCoachId(null);
		  Student stud2 = new Student("Bkane",2,111141,new java.util.Date());
		  stud2.setCoachId(null); 
		  Student stud3 = new Student("Ckane",3,111142,new java.util.Date());
		  stud3.setCoachId(null);
		  
		  studs.addAll(Arrays.asList(stud1,stud2,stud3));
		 
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
		List<CourseDTO> courss = studentService.getAllCoursesOfAStudent(id);
		return  courss;
	}
	
	@GetMapping("/students/{id}/courses/taken")
	public List<CourseDTO> fetchTakenCourses(@PathVariable int id) {
		List<CourseDTO> courss = studentService.getAllTakenCourses(id);
		return  courss;
	}
	
	
	@GetMapping("/students/courses")
	public List<CourseDTO> fetchCourses() {
		List<CourseDTO> courss = studentService.getAllCourses();
		return  courss;
	}
	
	@GetMapping("/students/{id}")
	public Student fetchStudById(@PathVariable int id) {
		return studentService.getStudentById(id);
	}
	
	
	@GetMapping("/students/byName")
	public Student fetchBYName(@RequestParam String name) {
		return studentService.getStudentByName(name);
	}
	
	@PostMapping("/students")
	public Student updateCreateStudentInfo(@RequestBody Student stud) {
		return studentService.updateStudentInfo(stud);
	}
	
	@GetMapping("/students/{id}/register")
	public CourseDTO registerAStudent(@PathVariable int id,@RequestParam int course_id) {
		return studentService.registerInACourse(course_id, id);
	}
	
	
	@PostMapping("/student/{id}/submitCPTReport")
	public CPTReportDTO submitCPT(@RequestBody CPTReportDTO rprt,@PathVariable int id) {
		
		return studentService.submitACPTReport(rprt,id);
		
	}
	
	@PostMapping("/student/{id}/submitJObReport")
	public JobSearchReportDTO submitJobCptReport(@RequestBody JobSearchReportDTO rprt,@PathVariable int id) {
		
		return studentService.submitJObReport(rprt,id);
		
	}
	
	
}
