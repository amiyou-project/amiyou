/*
 * package am.i.tm.tmcontroller;
 * 
 * import java.time.LocalDate; import java.util.Arrays; import java.util.Date;
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import am.i.tm.tmdomain.Studentdd; import am.i.tm.tmservice.IStudentService;
 * 
 * @RestController
 * 
 * @RequestMapping("/student") public class StudentController {
 * 
 * @Autowired private IStudentService studentService;
 * 
 * @GetMapping("/add") public void addStudent() { Studentdd student=new
 * Studentdd(126,"TestName","Lastname",3.8); studentService.addStudent(student);
 * 
 * }
 * 
 * @GetMapping("/show") public List<Studentdd> showStudent() { return
 * studentService.showStudent();
 * 
 * }
 * 
 * 
 * 
 * }
 * 
 * 
 */