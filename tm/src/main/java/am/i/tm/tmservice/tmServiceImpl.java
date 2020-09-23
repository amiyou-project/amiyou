/*
 * package am.i.tm.tmservice;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.beans.factory.annotation.Value; import
 * org.springframework.stereotype.Service; import
 * org.springframework.web.client.RestTemplate;
 * 
 * import com.netflix.appinfo.InstanceInfo; import
 * com.netflix.discovery.EurekaClient; import
 * com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand; import
 * com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
 * 
 * import am.i.tm.tmRepository.tmRepository; import am.i.tm.tmdomain.Student;
 * 
 * @Service public class tmServiceImpl implements tmService {
 * 
 * @Autowired private RestTemplate restTemplate;
 * 
 * @Autowired private tmRepository tmrepository;
 * 
 * @Autowired private EurekaClient eurekaClient;
 * 
 * @Value("${tm-service}") private String studentServiceName; private int i = 0;
 * 
 * private List<Student> studentsCache = new ArrayList<>();
 * 
 * @Override
 * 
 * @HystrixCommand(fallbackMethod = "getStudentsFallback", commandProperties = {
 * 
 * @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",
 * value = "1000") }) public List<Student> getAllStudents() { // return
 * restTemplate.getForObject("http://localhost:8081/countries/all", List.class);
 * studentsCache = restTemplate.getForObject(myEurekaLookup(studentServiceName)
 * + "/students", List.class); return studentsCache; }
 * 
 * public List<Student> getCountriesFallback() { return studentsCache; }
 * 
 * private String myEurekaLookup(String serviceName) { //
 * System.out.println(serviceName); InstanceInfo instanceInfo =
 * eurekaClient.getNextServerFromEureka(serviceName, false); return
 * instanceInfo.getHomePageUrl(); }
 * 
 * }
 */