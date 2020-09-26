package am.i.tm.tmservice;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import am.i.tm.tmRepository.AppointmentRepository;
import am.i.tm.tmdomain.TMAppointment;
import am.i.tm.tmdomain.TMInstructor;

@Service
@Transactional
public class AppointmentServiceImpl implements AppointmentService {
	@Autowired
	AppointmentRepository appointmentRepository;

	@Override
	public TMAppointment getAppointmentById(int id) {
		if (appointmentRepository.findById(id).isPresent()) {
			return appointmentRepository.findById(id).get();
		}
		return null;

	}

	@Override
	public List<TMAppointment> getAllAppointments() {
		return appointmentRepository.findAll();

	}

	@Override 
	public TMAppointment saveOrUpdateAppointment(int stud_id, String apptDate) {
		TMAppointment appointment =getStudentAppointment(stud_id,apptDate);
		appointment.setChecked("yes"); 
		return saveAppointment(appointment);
		}

	@Override
	public TMAppointment saveAppointment(TMAppointment appointment) {
		appointmentRepository.save(appointment);
		return appointment;
	}
	/*
	 * @Override public TMAppointment getAppointmentByStudId(int stud_id) { return
	 * appointmentRepository.findByStudentId(stud_id); }
	 * 
	 * @Override public TMAppointment getAppointmentByApptDate(String apptDate) {
	 * return appointmentRepository.findByApptDate(apptDate); }
	 */

	public TMAppointment getStudentAppointment(int stud_id, String apptDate) {
		TMAppointment appointment = appointmentRepository.findAppointmentByStudIdAndApptDate(stud_id, apptDate);
		return appointment;
	}

}
