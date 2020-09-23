package am.i.tm.tmcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import am.i.tm.tmdomain.TMAppointment;
import am.i.tm.tmservice.AppointmentService;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {
@Autowired
AppointmentService appointmentService;

@GetMapping("/{id}")
public TMAppointment getAppointment(@PathVariable int id) {
	return appointmentService.getAppointmentById(id);
}
}
