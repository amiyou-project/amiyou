package am.i.tm.tmservice;

import java.util.List;

import am.i.tm.tmdomain.TMAppointment;

public interface AppointmentService {

	TMAppointment getAppointmentById(int id);
	public List<TMAppointment>getAllAppointments();
}
