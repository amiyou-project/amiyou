package am.i.faculty.service;

import java.util.List;

import am.i.faculty.domain.Attendance;

public interface AttendanceService {
	
	public Attendance getAttendanceById(int id);

	public List<Attendance> getAttendanceByCourseAndStudentId(int student_id, int course_id);
		

}
