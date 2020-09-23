package am.i.tm.tmservice;

import java.util.List;

import am.i.tm.tmdomain.TMAttendance;

public interface TMAttendanceService {
	public TMAttendance getAttendanceById(int id);

	public List<TMAttendance> getAllAttendances();
}
