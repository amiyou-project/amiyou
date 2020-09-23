package am.i.faculty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import am.i.faculty.domain.Course;
import am.i.faculty.service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {
	@Autowired
	private CourseService courseService;

	@GetMapping("")
	public List<Course> getCourse() {
		return courseService.getAllCourse();
	}
	
	@PostMapping("")
	public Course createCourse(@RequestBody Course c) {
		System.out.println("comming: "+c.toString());
		return courseService.createCourse(c);
	}
	
	@GetMapping("/{id}")
	public Course getCourse(@PathVariable int id) {
		return courseService.getCourseById(id);
	}
	
	@GetMapping("/student/{student_id}")
	public List<Course> getStudentCourses(@PathVariable int student_id) {
		return courseService.getCourseByStudentId(student_id);
	}
	
	@GetMapping("/courses/{course_id}/register/{student_id}")
	public boolean registerStudent(@PathVariable int course_id, @PathVariable int student_id) {
		
		return courseService.registerStudent(course_id, student_id);
	}
}
