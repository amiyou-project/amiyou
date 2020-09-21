package am.i.faculty.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import am.i.faculty.domain.Attendance;
import am.i.faculty.repository.AttendanceRepository;

@Service
@Transactional
public class AttendanceServiceImpl implements AttendanceService {

	@Autowired
	private AttendanceRepository attendanceRepository;

	public Attendance getAttendanceById(int id) {
		if (attendanceRepository.findById(id).isPresent())
			return attendanceRepository.findById(id).get();
		return null;
	}

}
