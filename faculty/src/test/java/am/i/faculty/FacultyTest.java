
package am.i.faculty;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import am.i.faculty.domain.Attendance;
import am.i.faculty.repository.AttendanceRepository;
import am.i.faculty.service.AttendanceService;


@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class FacultyTest {
   @Autowired
   private AttendanceService attendanceService;
   @MockBean
   private AttendanceRepository attendanceRepository;
   
  
@Test
	public void getInstructors() {
		when(attendanceRepository.findAll())
				.thenReturn(
						java.util.stream.Stream
								.of(new Attendance(new Date(),2, 2, "remote", 0, null),
										new Attendance(new Date(),2, 2, "remote", 0, null))
								.collect(Collectors.toList()));
		assertEquals(2, attendanceService.getAllAttendance().size());
	}
}