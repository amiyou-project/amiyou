package am.i.tm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import am.i.tm.tmRepository.AppointmentRepository;
import am.i.tm.tmRepository.InstructorRepository;
import am.i.tm.tmRepository.TMAttendanceRepository;
import am.i.tm.tmdomain.TMAppointment;
import am.i.tm.tmdomain.TMAttendance;
import am.i.tm.tmdomain.TMInstructor;
import am.i.tm.tmservice.AppointmentService;
import am.i.tm.tmservice.InstructorService;
import am.i.tm.tmservice.TMAttendanceService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TmApplicationTests {

	@Autowired
	private AppointmentService appointmentService;

	@Autowired
	private InstructorService instructorService;

	@Autowired
	private TMAttendanceService attendanceService;

	@MockBean
	private AppointmentRepository appointmentRepository;

	@MockBean
	private InstructorRepository instructorRepository;
	@MockBean
	private TMAttendanceRepository attendancerRepository;

	@Test
	public void getAppointmentTest() {
		when(appointmentRepository.findAll())
				.thenReturn(
						java.util.stream.Stream
								.of(new TMAppointment(1, "2020-24-9", "3:45", "no", 3, 1),
										new TMAppointment(1, "2020-24-9", "4:45", "no", 4, 2))
								.collect(Collectors.toList()));
		assertEquals(2, appointmentService.getAllAppointments().size());
	}

	@Test
	public void getInstructors() {
		when(instructorRepository.findAll())
				.thenReturn(
						java.util.stream.Stream
								.of(new TMInstructor(1, "Dereje", "Mock", 1, "Mock Tester", 3),
										new TMInstructor(2, "Najeeb", "Najeeb", 5, "EArchitect", 10))
								.collect(Collectors.toList()));
		assertEquals(2, instructorService.getAllInstructors().size());
	}

	
	@Test
	public void getAttendances() {
		when(attendancerRepository.findAll())
				.thenReturn(
						java.util.stream.Stream
								.of(new TMAttendance(1, "2020-21-9", "morning", "present", 1, 1),
										new TMAttendance(2, "2020-21-9", "afternoon", "absent", 1, 1))
								.collect(Collectors.toList()));
		assertEquals(2, attendanceService.getAllAttendances().size());
	}
	
	
	@Test
	void contextLoads() {
	}

}
