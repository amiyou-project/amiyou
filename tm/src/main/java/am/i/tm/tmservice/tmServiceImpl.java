package am.i.tm.tmservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import DTO.Student;
import am.i.tm.tmRepository.ApptRepository;
import am.i.tm.tmRepository.InstructorRepository;
import am.i.tm.tmRepository.tmRepository;
import am.i.tm.tmdomain.TMAppointment;
import am.i.tm.tmdomain.TMAttendance;
import am.i.tm.tmdomain.TMInstructor;

@Service
public class tmServiceImpl implements tmService {
	 
	@Autowired
	private tmRepository tmrepository;
	@Autowired
	private ApptRepository apptRepository;
	@Autowired
	private InstructorRepository instructorRepository;

	@Override
	public TMAppointment saveOrUpdateAppointment(TMAppointment appointment) {
		tmrepository.save(appointment);
		return appointment;
	}

	@Override
	public TMAttendance saveOrUpdateAttendance(TMAttendance attendance) {
		apptRepository.save(attendance);
		return attendance;

	}

	@Override
	public TMInstructor saveOrUpdateInstructor(TMInstructor instructor) {
		instructorRepository.save(instructor);
		return instructor;
	}

	@Override
	public TMInstructor saveOrUpdateAssignment(int inst_id, int stud_id) {
		TMInstructor instructor = getInstructorById(inst_id);
		instructor.addStudent(stud_id);
		return saveOrUpdateInstructor(instructor);

	}

	public TMInstructor getInstructorById(int id) {
		if (instructorRepository.findById(id).isPresent()) {
			return instructorRepository.findById(id).get();
		}
		return null;
	}

	@Override
	public TMInstructor getInstructorByName(String lname) {
		return instructorRepository.findBylname(lname);
	}
}
