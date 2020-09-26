package am.i.faculty.controller;

import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import am.i.databaseBuilder.Student;
import am.i.faculty.domain.Attendance;
import am.i.faculty.service.AttendanceService;

@CrossOrigin
@RestController
@RequestMapping("/attendances")
@Transactional
public class AttendanceController {

	@Autowired
	private AttendanceService attendanceService;

	@GetMapping("/{id}")
	public Attendance getAttendance(@PathVariable int id) {
		return attendanceService.getAttendanceById(id);
	}

	@GetMapping("/{student_id}/{course_id}")
	public List<Attendance> getStudentCourses(@PathVariable int student_id, @PathVariable int course_id) {
		return attendanceService.getAttendanceByCourseAndStudentId(student_id, course_id);
	}
	 @GetMapping("")
	 public List<Attendance> getAllAttendance() {
		 return attendanceService.getAllAttendance();
	 }

	@PostMapping("")
	public Attendance saveAttendance(@RequestBody final Attendance attendance) {

		return attendanceService.saveAttendance(attendance);
	}

	@GetMapping("/student/{student_id}")
	public List<Attendance> getStudentAttendance(@PathVariable int student_id) {
		return attendanceService.getAttendanceByStudentId(student_id);
	}

	@DeleteMapping("delete/{id}")
	public boolean deleteAttendance(@PathVariable("id") int id) {
		Attendance attendance = attendanceService.getAttendanceById(id);
		if (attendance == null)
			return false;
		attendanceService.deleteAttendance(id);

		return true;
	}
}
