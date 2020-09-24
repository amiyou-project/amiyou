package am.i.tm.tmservice;

import java.util.List;

import am.i.tm.tmdomain.TMAppointment;

public interface AppointmentService {

	public TMAppointment getAppointmentById(int id);

	public List<TMAppointment> getAllAppointments();

	//public TMAppointment getAppointmentByStudId(int stud_id);

	//public TMAppointment getAppointmentByApptDate(String apptDate);

	public TMAppointment saveAppointment(TMAppointment appointment);

	TMAppointment saveOrUpdateAppointment(int stud_id, String apptDate);

	
}
