package am.i.tm.tmcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import am.i.tm.tmdomain.TMAttendance;
import am.i.tm.tmservice.TMAttendanceService;

@RestController
@RequestMapping("/attendances")
public class TMAttendanceController {
	@Autowired
	TMAttendanceService tmattendanceService;

	@GetMapping("/{id}")
	public TMAttendance getAttendance(@PathVariable int id) {
		return tmattendanceService.getAttendanceById(id);
	}
}
