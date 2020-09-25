
package am.i.tm.tmcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import am.i.tm.tmdomain.TMAppointment;
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
}
