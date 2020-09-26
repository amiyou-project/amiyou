package am.i.faculty.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import am.i.faculty.domain.Attendance;
import am.i.faculty.domain.Course;
import am.i.faculty.repository.AttendanceRepository;

@Service
@Transactional
public abstract class AttendanceServiceImpl implements AttendanceService {

	@Autowired
	private AttendanceRepository attendanceRepository;

	public Attendance getAttendanceById(int id) {
		if (attendanceRepository.findById(id).isPresent())
			return attendanceRepository.findById(id).get();
		return null;
	}

	public List<Attendance> getAllAttendance() {

		return attendanceRepository.findAll();

	}

	@Override
	public Attendance saveAttendance(Attendance attendance) {

		return attendanceRepository.save(attendance);
	}

	@Override
	public List<Attendance> getAttendanceByStudentId(int student_id) {
		// TODO Auto-generated method stub
		List<Attendance> res = new ArrayList<>();

		if (!attendanceRepository.findByStudentId(student_id).isEmpty())
			res.add((Attendance) attendanceRepository.findByStudentId(student_id).stream().map(sc -> sc.toString())
					.distinct().collect(Collectors.toList()));
		System.out.println("**********************************" + res);
		return res;

	}

	@Override
	public List<Attendance> getAttendanceByCourseAndStudentId(int student_id, int course_id) {
		// TODO Auto-generated method stub
		List<Attendance> res = new ArrayList<>();

		if (!attendanceRepository.findByStudentId(student_id).isEmpty()
				&& !attendanceRepository.findByStudentId(course_id).isEmpty())
			res.add((Attendance) attendanceRepository.findByStudentId(student_id).stream().map(sc -> sc.toString())
					.distinct().collect(Collectors.toList()));
		System.out.println("**********************************" + res);
		return res;
	}

	@Override
	public void deleteAttendance(int id) {

		attendanceRepository.deleteById(id);

	}

}
