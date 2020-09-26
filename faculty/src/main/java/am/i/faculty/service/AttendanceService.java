package am.i.faculty.service;

import java.util.List;

import am.i.faculty.domain.Attendance;

public interface AttendanceService {

	public Attendance getAttendanceById(int id);

//	public Attendance getAttendanceByCourseAndStudentId(int student_id, int course_id);

	public Attendance saveAttendance(Attendance attendance);

	public void deleteAttendance(int id);

	public List<Attendance> getAttendanceByStudentId(int student_id);

	public List<Attendance> getAttendanceByCourseAndStudentId(int student_id, int course_id);

	//public List<Attendance> getAllAttendanceById(int id);

	public List<Attendance> getAllAttendance();

 public int getcountAttendance(int student_id, int course_id);

}
