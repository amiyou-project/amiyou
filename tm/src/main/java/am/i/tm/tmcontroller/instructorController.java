
package am.i.tm.tmcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import am.i.tm.tmdomain.TMInstructor;
import am.i.tm.tmservice.instructorService;


@RestController
@RequestMapping("/instructors")
public class instructorController {

	@Autowired
	instructorService instructorservice;

	@GetMapping("/{id}")
	public TMInstructor getInstructor(@PathVariable int id) {
		return instructorservice.getInstructorById(id);
	}
  
  }

