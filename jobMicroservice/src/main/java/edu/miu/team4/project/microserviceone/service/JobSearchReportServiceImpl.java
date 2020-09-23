package edu.miu.team4.project.microserviceone.service;


import am.i.databaseBuilder.Student;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import edu.miu.team4.project.microserviceone.domain.CptReport;
import edu.miu.team4.project.microserviceone.repository.CptReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
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
    @Value("${http://localhost:8085/students/\"+id+\"}")
    private String studentServiceName;
    @Override
    public CptReport saveCptReport(CptReport cptReport) {
        return cptReportRepository.save(cptReport);
    }

    @Override
    public List<CptReport> getAllcptReports() {
        return cptReportRepository.findAll();
    }

    @Override
    public List<Student> getStudents() {
        return restTemplate.getForObject("http://localhost:8085/students",List.class);
    }

//    @Override
//    public Student getStudentById(int id) {
//        System.out.println("we hit thin7s point");
//        return restTemplate.getForObject("http://localhost:8085/students/"+id+"",Student.class);
//    }
    @Override
    public Student getStudentById(int id) {
        System.out.println("we hit this point");
        return restTemplate.getForObject(studentServiceName,Student.class);
    }

    private String myEurekaLookUp(String serviceName){
        InstanceInfo instanceInfo= eurekaClient.getNextServerFromEureka(serviceName, false);
        return instanceInfo.getHomePageUrl();
    }
}
