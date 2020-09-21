package am.i.tm.tmservice;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import am.i.tm.tmRepository.instructorRepository;
import am.i.tm.tmdomain.TMInstructor;

@Service
@Transactional
public class instructorServiceImpl implements instructorService{
@Autowired
private instructorRepository repository;

public TMInstructor getInstructorById(int id) {
	if(repository.findById(id).isPresent()) {
		return repository.findById(id).get();
	}
	return null;
}
}
