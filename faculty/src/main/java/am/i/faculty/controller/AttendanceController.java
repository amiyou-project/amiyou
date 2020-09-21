package am.i.faculty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import am.i.faculty.service.AttendanceService;

@RestController
public class AttendanceController {
	
	 @Autowired
	    private AttendanceService attendanceService;

}
