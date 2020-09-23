package am.i.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import am.i.faculty.domain.Course;
import am.i.student.domain.Person;
import am.i.student.domain.Student;
import am.i.student.repository.StudentDAO;

@Service
@Transactional
public class StudentService implements IStudentService {
	
	@Autowired
	public StudentDAO studentDao;
	
	@Autowired
	private RestTemplate restTemplate;
	

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentDao.findAll();
		
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentDao.findByStudentId(id);
		//return null;
	}

	@Override
	public Student getStudentByName(String name) {
		// TODO Auto-generated method stub
		return studentDao.findByName(name);
	}

	public StudentDAO getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDAO studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public void addStudents(List<Student> stud) {
		// TODO Auto-generated method stub
		studentDao.saveAll(stud);
	}

	@Override
	public Student updateStudentInfo(Student stud) {
		// TODO Auto-generated method stub
		return studentDao.save(stud);
	}

	@Override
	public List<Course> getAllCoursesOfAStudent(int id) {
		// TODO Auto-generated method stub
		return restTemplate.getForObject("http://localhost:8081/courses/student/"+id+"", List.class);
	}

	@Override
	public Course updateStudentRegistration(int id, String title, String method) {
		// TODO Auto-generated method stub
		return restTemplate.getForObject("http://localhost:8081/courses/student/"+id+"", Course.class);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
