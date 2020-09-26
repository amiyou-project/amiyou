package am.i.faculty.service;

import java.util.List;

import am.i.faculty.domain.Faculty;

public interface FacultyService {
	public List<Faculty> getAllFaculty();
	public Faculty createFaculty(Faculty f);
	public boolean deleteFaculty(int id);
	public Faculty getFacultyById(int id);
	public Faculty updateFaculty(Faculty id);
}
