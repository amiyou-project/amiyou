
package am.i.tm.tmcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import am.i.tm.tmdomain.TMInstructor;
import am.i.tm.tmservice.InstructorService;

@RestController

//@RequestMapping("/instructors")
public class InstructorController {

	@Autowired
	InstructorService instructorservice;

	@GetMapping("/instructors")
	public List<TMInstructor> getInstructors() {
		return instructorservice.getAllInstructors();
	}

}
