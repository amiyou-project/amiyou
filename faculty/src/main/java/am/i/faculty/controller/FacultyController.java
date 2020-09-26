package am.i.faculty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import am.i.faculty.domain.Course;
import am.i.faculty.domain.Faculty;
import am.i.faculty.service.CourseService;
import am.i.faculty.service.FacultyService;

@CrossOrigin
@RestController
@RequestMapping("/faculties")
public class FacultyController {
	@Autowired
	private FacultyService facultyService;

	@GetMapping("")
	public List<Faculty> getFaculty() {
		return facultyService.getAllFaculty();
	}
	
	@PostMapping("")
	public Faculty createFaculty(@RequestBody Faculty c) {
		return facultyService.createFaculty(c);
	}
}
