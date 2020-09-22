/*
 * package am.i.tm.tmcontroller;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import am.i.tm.tmdomain.Student; import am.i.tm.tmservice.tmService;
 * 
 * @RestController
 * 
 * @RequestMapping("/tm") public class tmController {
 * 
 * @Autowired private tmService tmservice;
 * 
 * @GetMapping("/students") public List<Student> getAllStudents() {
 * List<Student> studs = tmservice.getAllStudents(); return studs;
 * 
 * } }
 */