package am.i.tm.tmcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import DTO.Student;
import am.i.tm.tmdomain.TMAppointment;
import am.i.tm.tmdomain.TMAttendance;
import am.i.tm.tmdomain.TMInstructor;
import am.i.tm.tmservice.AppointmentService;
import am.i.tm.tmservice.TMAttendanceService;
import am.i.tm.tmservice.tmService;

@RestController
@RequestMapping("/tm")
public class tmController {

	@Autowired
	private tmService tmservice;

	@Autowired
	TMAttendanceService tmattendanceService;
	
	@Autowired
	AppointmentService appointmentService;

//=========================Add attendance=======================================

	@PostMapping("/addattendance")
	public TMAttendance saveAttendance(@RequestBody TMAttendance attendance) {
		tmservice.saveOrUpdateAttendance(attendance);
		return attendance;
	}

//=========================Add appointment=======================================

	@PostMapping("/addappointment")
	public TMAppointment saveAppointment(@RequestBody TMAppointment appointment) {
		tmservice.saveOrUpdateAppointment(appointment);
		return appointment;
	}

//=========================Add instructor=======================================

	@PostMapping("/addinstructor")
	public TMInstructor saveInstructor(@RequestBody TMInstructor instructor) {
		tmservice.saveOrUpdateInstructor(instructor);
		return instructor;
	}

//=========================Assign a student=======================================

	@PatchMapping("/assignstudent")
	public TMInstructor assignStudent(@RequestParam int inst_id, @RequestParam int stud_id) {
		return tmservice.saveOrUpdateAssignment(inst_id, stud_id);
		
	}

// =========================show attendance=======================================

	// @RequestMapping("")
	@GetMapping("/attendances/{id}")
	public TMAttendance getAttendance(@PathVariable int id) {
		return tmattendanceService.getAttendanceById(id);
	}

//=========================show Instructor====================================

//get instructor by Id
	@GetMapping("/instructor/{id}")
	public TMInstructor getInstructor(@PathVariable int id) {
		return tmservice.getInstructorById(id);
	}
	
//=========================show appointments====================================
	@GetMapping("/appointments/{id}")
	public TMAppointment getAppointment(@PathVariable int id) {
		return appointmentService.getAppointmentById(id);
	}
	
	//=========================show Students====================================
	@GetMapping("/students")
	public List<Student>getAllStudentsFromService(){
		return tmservice.getStudents();
	}

}
