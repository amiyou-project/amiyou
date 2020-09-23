package am.i.tm.tmservice;



import java.util.List;

import am.i.tm.tmdomain.TMInstructor;


public interface InstructorService {
	//public TMInstructor getInstructorById(int id);
	public List<TMInstructor> getAllInstructors();
}
