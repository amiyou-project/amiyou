package am.i.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

import am.i.databaseBuilder.Course;
import am.i.student.domain.Person;
import am.i.student.domain.Student;
import am.i.student.repository.StudentDAO;

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
		// EUREKA CODE
		Course c = restTemplate.getForObject(myEurekaLookup(facultyService) + "/courses/1", Course.class);
		System.out.println("Course: "+c.getTitle());
		// EUREKA CODE
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
	
}
