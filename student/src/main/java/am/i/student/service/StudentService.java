package am.i.student.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

import am.i.faculty.domain.Course;
import am.i.student.domain.Student;
import am.i.student.repository.StudentDAO;
import dtos.CourseDTO;

@Service
@Transactional
public class StudentService implements IStudentService {

	@Autowired
	public StudentDAO studentDao;

	
	// EUREKA CODE
	@Autowired
	private EurekaClient eurekaClient;
	
	@Value("${faculty}")
	private String facultyService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	private String myEurekaLookup(String serviceName) {
		InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka(serviceName, false);
		return instanceInfo.getHomePageUrl();
	}
	// EUREKA CODE

	@Override
	public List<Student> getAllStudent() {
		return studentDao.findAll();
	}


	public StudentDAO getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDAO studentDao) {
		this.studentDao = studentDao;
	}

	

	@Override
	public Student updateStudentInfo(Student stud) {
		// TODO Auto-generated method stub
		return studentDao.save(stud);
	}
	
	@Override
	public List<CourseDTO> getAllCourses() {		
		return restTemplate.getForObject(myEurekaLookup(facultyService) + "/courses", List.class);
	}
	

	@Override
	public List<CourseDTO> getAllTakenCourses(int id) {		
		 List<CourseDTO> allC =  restTemplate.getForObject(myEurekaLookup(facultyService) + "/courses/student/"+id+"", List.class);
		 
		 List<CourseDTO> taken = allC.stream().filter((obj)-> obj.getEnd().compareTo(new java.util.Date())==0).collect(Collectors.toList());
		 
		 return taken;
	}
	
	

	@Override
	public Course updateStudentRegistration(int id, String title, String method) {
		// TODO Auto-generated method stub
		return restTemplate.getForObject("http://localhost:8086/courses/student/"+id+"", Course.class);
	}

//	/courses/{course_id}/register/{student_id}
	
	
	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentDao.findByStudentId(id);
	}

	@Override
	public Student getStudentByName(String name) {
		// TODO Auto-generated method stub
		return studentDao.findByName(name); 
		
	}

	@Override
	public void addStudents(List<Student> stud) {
		// TODO Auto-generated method stub
		studentDao.saveAll(stud);
		
	}

	@Override
	public List<CourseDTO> getAllCoursesOfAStudent(int id) {
		// TODO Auto-generated method stub
		return restTemplate.getForObject(myEurekaLookup(facultyService) + "/courses/student/"+id+"", List.class);
	}


	@Override
	public CourseDTO registerInACourse(int courseId,int studentId) {
		return restTemplate.getForObject(myEurekaLookup(facultyService) + "/courses/"+courseId+"/register/"+studentId+"", CourseDTO.class);
	}











}
