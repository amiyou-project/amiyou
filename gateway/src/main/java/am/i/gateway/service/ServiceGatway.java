package am.i.gateway.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.stereotype.Service;

import am.i.databaseBuilder.CPTReport;
import am.i.databaseBuilder.Course;
import am.i.databaseBuilder.Student;
import am.i.databaseBuilder.TMInstructor;

@Service
public class ServiceGatway implements IService{
	
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private EurekaClient eurekaClient;
	
	@Value("${faculty-service}")
	private String facultyService;
	
	@Value("${student-service}")
	private String studentService;
	
	@Value("${tm-service}")
	private String TMService;
	
	@Value("${job-service}")
	private String JobService;

	@Override
	public List<Course> getCourses() {
		return restTemplate.getForObject(myEurekaLookup(facultyService) + "/courses", List.class);
	}
	
	@Override
	public List<Student> getStudents() {
		return restTemplate.getForObject(myEurekaLookup(studentService) + "/students", List.class);
	}
	
	
	
	private String myEurekaLookup(String serviceName) {
		InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka(serviceName, false);
		return instanceInfo.getHomePageUrl();
	}

	@Override
	public List<TMInstructor> getTMInstrutor() {
		// TODO Auto-generated method stub
		return restTemplate.getForObject(myEurekaLookup(TMService) + "/instructors", List.class);
	}

	@Override
	public List<CPTReport> getCptReport(int id) {
		// TODO Auto-generated method stub
		return restTemplate.getForObject(myEurekaLookup(JobService) + "/cptReport/getCptReportByStudentid/"+id+"", List.class);
	}

}
