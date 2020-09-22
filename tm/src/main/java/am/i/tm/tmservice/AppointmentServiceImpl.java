package am.i.tm.tmservice;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
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

}
