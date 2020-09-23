package am.i.faculty.service;

import java.util.List;

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

	@Override
	public List<Attendance> getAttendanceByCourseAndStudentId(int student_id, int course_id) {
		// TODO Auto-generated method stub
		if (attendanceRepository.findById(student_id).isPresent())
			if (attendanceRepository.findById(course_id).isPresent())
				return (List<Attendance>) attendanceRepository.findById(student_id).get();
		return null;
	}

	@Override
	public Attendance saveAttendance(Attendance attendance) {

		return attendanceRepository.save(attendance);
	}

	@Override
	public void deleteAttendance(int id) {
		
		attendanceRepository.deleteById(id);
		
	}

	@Override
	public int getcountAttendance(int student_id, int course_id) {
		
		if (attendanceRepository.findById(student_id).isPresent())
			if (attendanceRepository.findById(course_id).isPresent())
				return  (int) attendanceRepository.countByAttendanceId(student_id);
		return (Integer) null;
	}

}
