package am.i.tm.tmservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

import DTO.Student;
import am.i.tm.tmRepository.ApptRepository;
import am.i.tm.tmRepository.InstructorRepository;
import am.i.tm.tmRepository.tmRepository;
import am.i.tm.tmdomain.TMAppointment;
import am.i.tm.tmdomain.TMAttendance;
import am.i.tm.tmdomain.TMInstructor;

@Service
public class tmServiceImpl implements tmService {


	@Autowired
    private RestTemplate restTemplate;
	
	// EUREKA CODE

	 @Autowired
	private EurekaClient eurekaClient;
	 @Value("${student}")
	 private String studentService;
	 
	 private String myEurekaLookup(String serviceName) {
	        InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka(serviceName, false);
	        return instanceInfo.getHomePageUrl();
	    }
	 
	
	 
	@Autowired
	private tmRepository tmrepository;
	@Autowired
	private ApptRepository apptRepository;
	@Autowired
	private InstructorRepository instructorRepository;

	@Override
	public TMAppointment saveOrUpdateAppointment(TMAppointment appointment) {
		tmrepository.save(appointment);
		return appointment;
	}

	@Override
	public TMAttendance saveOrUpdateAttendance(TMAttendance attendance) {
		apptRepository.save(attendance);
		return attendance;

	}

	@Override
	public TMInstructor saveOrUpdateInstructor(TMInstructor instructor) {
		instructorRepository.save(instructor);
		return instructor;
	}

	@Override
	public TMInstructor saveOrUpdateAssignment(int inst_id, int stud_id) {
		TMInstructor instructor = getInstructorById(inst_id);
		instructor.addStudent(stud_id);
		return saveOrUpdateInstructor(instructor);

	}

	public TMInstructor getInstructorById(int id) {
		if (instructorRepository.findById(id).isPresent()) {
			return instructorRepository.findById(id).get();
		}
		return null;
	}

	@Override
	public TMInstructor getInstructorByName(String lname) {
		return instructorRepository.findBylname(lname);
	}
	
	
 
    @Override
    public List<Student> getStudents() {
//        String url = "http://localhost:8086/students";
//        ResponseEntity<List> responseEntity = restTemplate.exchange("http://localhost:8086/students",  Student.class);
//        List<Student> student = responseEntity.getBody();
        //return restTemplate.getForObject("http://localhost:8086/students",  List.class);
    	return  restTemplate.getForObject(myEurekaLookup(studentService) + "/students", List.class);
    }
    

}
