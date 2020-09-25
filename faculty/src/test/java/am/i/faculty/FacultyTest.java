
package am.i.faculty;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import java.util.Date;
import java.util.Optional;
import java.util.stream.Collectors;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import am.i.faculty.domain.Attendance;
import am.i.faculty.repository.AttendanceRepository;
import am.i.faculty.repository.CourseRepository;
import am.i.faculty.service.AttendanceService;
import am.i.faculty.service.CourseService;


@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class FacultyTest {
   @Autowired
   private CourseService courseService;
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
   private CourseRepository courseRepository;
      
   @Test
   public void getCourse() {
	  Course c = new Course();
	  c.setTitle("remote");
	  Optional<Course> o = Optional.of(c); 
      when(courseRepository.findById(0)).thenReturn(o);
      String testName = courseService.getCourseById(0).getTitle();
      Assert.assertEquals("remote", testName);
   }
   
   @Test
   public void getCourses() {
       when(courseRepository.findAll()).thenReturn(java.util.stream.Stream.of(new Course(), new Course()).collect(Collectors.toList()));
       Assert.assertEquals(2, courseService.getAllCourse().size());
   }
}