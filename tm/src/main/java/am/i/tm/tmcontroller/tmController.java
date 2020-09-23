package am.i.tm.tmcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import am.i.tm.tmdomain.TMAppointment;
import am.i.tm.tmdomain.TMAttendance;
import am.i.tm.tmdomain.TMInstructor;

import am.i.tm.tmservice.tmService;

@RestController
@RequestMapping("/tm")
public class tmController {

	@Autowired
	private tmService tmservice;

	@PostMapping("/addappointment")
	public TMAppointment saveAppointment(@RequestBody TMAppointment appointment) {
		tmservice.saveOrUpdateAppointment(appointment);
		return appointment;
	}

	@PostMapping("/addattendance")
	public TMAttendance saveAttendance(@RequestBody TMAttendance attendance) {
		tmservice.saveOrUpdateAttendance(attendance);
		return attendance;
	}

	@PostMapping("/addinstructor")
	public TMInstructor saveInstructor(@RequestBody TMInstructor instructor) {
		tmservice.saveOrUpdateInstructor(instructor);
		return instructor;
	}

	@PatchMapping("/assignstudent") 
	public TMInstructor assignStudent(@RequestParam int inst_id, @RequestParam int stud_id)	{ 
	
		return	tmservice.saveOrUpdateAssignment(inst_id,stud_id);
		//return instructor; 
		}
//=========================By Id=================================================================
	
//get instructor by Id
	@GetMapping("/instructor/{id}")  
	public TMInstructor getInstructor(@PathVariable int id) {
		return tmservice.getInstructorById(id);
	}
	
	/*
	 * //get instructor by name
	 * 
	 * @GetMapping("/instructor/{lname}") public TMInstructor
	 * getByName(@RequestParam String lname) { return
	 * tmservice.getInstructorByName(lname); }
	 */
}
