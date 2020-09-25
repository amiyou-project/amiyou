package edu.miu.team4.project.microserviceone.service;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import dtos.CourseDTO;
import edu.miu.team4.project.microserviceone.DTO.Student;
import edu.miu.team4.project.microserviceone.domain.CptReport;
import edu.miu.team4.project.microserviceone.repository.CptReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

@Service
@Transactional
public class CptReportServiceImpl implements CptReportService{
    @Autowired
    public CptReportRepository cptReportRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EurekaClient eurekaClient;
//    @Value("${http://localhost:8085/students/\"+id+\"}")
//    private String studentServiceName;
    @Override
    public CptReport saveCptReport(CptReport cptReport) {
        return cptReportRepository.save(cptReport);
    }

    @Override
    public List<CptReport> getAllcptReports() {
        return cptReportRepository.findAll();
    }

    @Value("${students}")
    private String studentsService;

    private String myEurekaLookup(String serviceName) {
        InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka(serviceName, false);
        return instanceInfo.getHomePageUrl();
    }
    @Override
    public List<Student> getStudents(){
        return restTemplate.getForObject(myEurekaLookup(studentsService)+ "/students", List.class);
    }

//    @Override
//    public List<Student> getStudents() {
//        System.out.println("we hit this point");
//        String url = "http://localhost:8086/students";
//        ResponseEntity<List> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, List.class );
//        List<Student> student = responseEntity.getBody();
//        return student;
//    }

//    @Override
//    public Student getStudentById(int id) {
//        System.out.println("we hit thin7s point");
//        String url = "http://localhost:8086/students/";
//        ResponseEntity<Student> responseEntity = restTemplate.exchange(url + id, HttpMethod.GET, null, Student.class );
//        Student student = responseEntity.getBody();
//        return student;
//    }
    @Override
    public Student getStudentById(int id){
        return restTemplate.getForObject(myEurekaLookup(studentsService)+ "/students/"+id+"", Student.class);
    }
    @Override
    public CptReport getCptReportByStudentId(int id) {
        return cptReportRepository.findByStudentnum(id);
    }
    private String myEurekaLookUp(String serviceName){
        InstanceInfo instanceInfo= eurekaClient.getNextServerFromEureka(serviceName, false);
        return instanceInfo.getHomePageUrl();
    }
}
