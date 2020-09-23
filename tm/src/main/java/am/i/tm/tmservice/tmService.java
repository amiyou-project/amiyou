package am.i.tm.tmservice;

import am.i.tm.tmdomain.TMAppointment;
import am.i.tm.tmdomain.TMAttendance;
import am.i.tm.tmdomain.TMInstructor;

public interface tmService {

	public TMAppointment saveOrUpdateAppointment(TMAppointment appointment);

	public TMAttendance saveOrUpdateAttendance(TMAttendance attendance);

	public TMInstructor saveOrUpdateInstructor(TMInstructor instructor);

	public TMInstructor saveOrUpdateAssignment(int inst_id,int stud_id);

	public TMInstructor getInstructorById(int id);

	//public TMInstructor getInstructorByName(String lname);

}
