
package am.i.faculty;
import static org.mockito.Mockito.when;

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
   public void getAttendanceTest() {
//      when(attendanceService.getAttendanceById(0).getDescription())
//      .thenReturn("remote");
      String testName = attendanceService.getAttendanceById(0).getDescription();
      System.out.println(testName + "8888888888888888888888888888888888888888888888888888888888888888888888");
      Assert.assertEquals("remote", testName);
   }

//	@Test
//	public void getInstructors() {
//		when(attendanceRepository.findAll())
//				.thenReturn(
//						java.util.stream.Stream
//								.of(new Attendance(1, "Dereje", "Mock", 1, "Mock Tester", 3),
//										new Attendance(2, "Najeeb", "Najeeb", 5, "EArchitect", 10))
//								.collect(Collectors.toList()));
//		assertEquals(2, attendanceService.getAllInstructors().size());
//	}
}