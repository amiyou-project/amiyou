package am.i.faculty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import am.i.faculty.domain.Attendance;
import am.i.faculty.service.AttendanceService;

@RestController
@RequestMapping("/attendances")
public class AttendanceController {
	
	 @Autowired
	    private AttendanceService attendanceService;
	 
	 @GetMapping("/{id}")
	 public Attendance getAttendance(@PathVariable int id) {
		 return attendanceService.getAttendanceById(id);
	 }

}
