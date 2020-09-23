package am.i.tm.tmservice;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import am.i.tm.tmRepository.InstructorRepository;
import am.i.tm.tmdomain.TMInstructor;

@Service
@Transactional
public class InstructorServiceImpl implements InstructorService{
@Autowired
private InstructorRepository instructorRepository;

/*
 * public TMInstructor getInstructorById(int id) {
 * if(repository.findById(id).isPresent()) { return
 * repository.findById(id).get(); } return null; }
 */

@Override
public List<TMInstructor> getAllInstructors() {
	return instructorRepository.findAll();
	
}
}
