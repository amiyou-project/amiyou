
package am.i.tm.tmcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import am.i.tm.tmdomain.TMAppointment;
import am.i.tm.tmdomain.TMInstructor;
import am.i.tm.tmservice.AppointmentService;

@RestController

//@RequestMapping("/appointments")
public class AppointmentController {

	@Autowired
	AppointmentService appointmentService;

	@GetMapping("/appointments")
	public List<TMAppointment> getAppointments() {
		return appointmentService.getAllAppointments();
	}
	
	@PatchMapping("/updateappointment")
	public TMAppointment updateAppointment(@RequestParam int stud_id, @RequestParam String apptDate) {
		//return appointmentService.saveOrUpdateAppointment(stud_id, apptDate);
		return null;
		
	}
}
