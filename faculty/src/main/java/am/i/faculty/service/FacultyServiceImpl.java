package am.i.faculty.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import am.i.faculty.domain.Faculty;
import am.i.faculty.repository.FacultyRepository;

@Service
@Transactional
public class FacultyServiceImpl implements FacultyService {
	
	@Autowired
	FacultyRepository facultyRepository;

	@Override
	public List<Faculty> getAllFaculty() {
		return facultyRepository.findAll();
	}

	@Override
	public Faculty createFaculty(Faculty f) {
		return facultyRepository.save(f);
	}

	@Override
	public boolean deleteFaculty(int id) {
		facultyRepository.deleteById(id);
		return true;
	}

	@Override
	public Faculty getFacultyById(int id) {
		if(facultyRepository.findById(id).isPresent())
			return facultyRepository.findById(id).get();
		else return null;
	}

	@Override
	public Faculty updateFaculty(Faculty f) {
		Faculty g = facultyRepository.save(f);
		return g;
	}

}
