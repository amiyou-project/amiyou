package am.i.gateway.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.stereotype.Service;

import am.i.databaseBuilder.Attendance;
import am.i.databaseBuilder.Course;

@Service
public class ServiceGatway implements IService{
	
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private EurekaClient eurekaClient;
	@Value("${country-service}")
	private String courseService;
	
	@Value("${faculty-service}")
	private String attendanceService;

	@Override
	public List<Course> getCourses() {
		return restTemplate.getForObject(myEurekaLookup(courseService) + "/courses", List.class);
	}
	
	private String myEurekaLookup(String serviceName) {
		InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka(serviceName, false);
		return instanceInfo.getHomePageUrl();
	}
	
	
	@Override
	public List<Attendance> getStudents(int student_id, int course_id) {
		return restTemplate.getForObject(myEurekaLookup(attendanceService) + "/"+ student_id + "/" + course_id, List.class);
	}
	

}
