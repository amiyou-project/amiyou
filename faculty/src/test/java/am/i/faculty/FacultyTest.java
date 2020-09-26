
package am.i.faculty;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import am.i.faculty.domain.Course;
import am.i.faculty.domain.Faculty;
import am.i.faculty.domain.StudentCourses;
import am.i.faculty.domain.Attendance;
import am.i.faculty.repository.AttendanceRepository;
import am.i.faculty.repository.CourseRepository;
import am.i.faculty.repository.FacultyRepository;
import am.i.faculty.repository.StudentCoursesRepository;
import am.i.faculty.service.AttendanceService;
import am.i.faculty.service.CourseService;
import am.i.faculty.service.FacultyService;


@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class FacultyTest {
   @Autowired
   private CourseService courseService;
   @Autowired
   private FacultyService facultyService;
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
   private CourseRepository courseRepository;
   @MockBean
   private StudentCoursesRepository studentCoursesRepository;
   @MockBean
   private FacultyRepository facultyRepository;
      
   @Test
   public void getCourseById() {
	  Course c = new Course();
	  c.setTitle("remote");
	  Optional<Course> o = Optional.of(c); 
      when(courseRepository.findById(0)).thenReturn(o);
      String testName = courseService.getCourseById(0).getTitle();
      Assert.assertEquals("remote", testName);
   }
   
   @Test
   public void getCourseNull() {
	  Optional<Course> n = Optional.empty();
      when(courseRepository.findById(999)).thenReturn(n);
      Assert.assertEquals(null, courseService.getCourseById(999));
   }
   
   @Test
   public void getCourses() {
	   List<Course> l = Stream.of(new Course(), new Course()).collect(Collectors.toList());
       when(courseRepository.findAll()).thenReturn(l);
       Assert.assertEquals(2, courseService.getAllCourse().size());
   }
   @Test
   public void getCoursesByStudentId() {
	   StudentCourses sc = new StudentCourses();
	   sc.setCourse(new Course());
       when(studentCoursesRepository.findByStudentId(0)).thenReturn(Stream.of(sc).collect(Collectors.toList()));
       Assert.assertEquals(1, courseService.getCourseByStudentId(0).size());
   }
   @Test
   public void createCourse() {
	   Course c = new Course();
	   Course ci = new Course();
	   ci.setId(0); 
       when(courseRepository.save(c)).thenReturn(ci);
       Assert.assertEquals(0, courseService.createCourse(c).getId());
   }
   @Test
   public void registerStudent() {
	   Course c = new Course();
	   c.setId(0);
	   Optional<Course> o = Optional.of(c); 
	   StudentCourses sc = new StudentCourses();
	   sc.setCourse(c);
	   sc.setStudentId(1);
//	   StudentCourses sct2 = new StudentCourses();
//	   sct2.setCourse(c);
//	   sct2.setStudentId(1);
//	   sct2.setId(2);
	   when(courseRepository.findById(0)).thenReturn(o);
	   //when(studentCoursesRepository.save(sc)).thenReturn(sct2);
	   StudentCourses sc3 = courseService.registerStudent(0,1);
	   Assert.assertEquals(0, sc3.getCourse().getId());
	   Assert.assertEquals(1, sc3.getStudentId());
	   //Assert.assertEquals(2, sc3.getId());
   }
   
   @Test
   public void deleteCourse() {
	   boolean resp = courseService.deleteCourse(0);
	   Assert.assertEquals(true, resp);
   }
   @Test
   public void unregisterStudent() {
	   List<StudentCourses> l = Stream.of(new StudentCourses(), new StudentCourses()).collect(Collectors.toList());
	   when(studentCoursesRepository.findByCourseIdAndStudentId(0,1)).thenReturn(l);
	   boolean resp = courseService.unregisterStudent(0, 1);
	   Assert.assertEquals(true, resp);
   }
   
   // Faculty
   
   @Test
   public void createFaculty() {
	   Faculty c = new Faculty();
	   Faculty ci = new Faculty();
	   ci.setId(0); 
       when(facultyRepository.save(c)).thenReturn(ci);
       Assert.assertEquals(0, facultyService.createFaculty(c).getId());
   }
   
   @Test
   public void getFaculties() {
	   List<Faculty> l = Stream.of(new Faculty(), new Faculty()).collect(Collectors.toList());
       when(facultyRepository.findAll()).thenReturn(l);
       Assert.assertEquals(2, facultyService.getAllFaculty().size());
   }
   
   @Test
   public void getFacultyById() {
	  Faculty c = new Faculty();
	  c.setName("remote");
	  Optional<Faculty> o = Optional.of(c); 
      when(facultyRepository.findById(0)).thenReturn(o);
      String testName = facultyService.getFacultyById(0).getName();
      Assert.assertEquals("remote", testName);
   }
   
   @Test
   public void getFacultyNull() {
	  Optional<Faculty> n = Optional.empty();
      when(facultyRepository.findById(99999)).thenReturn(n);
      Assert.assertEquals(null, facultyService.getFacultyById(99999));
   }
   
   @Test
   public void deleteFaculty() {
	   boolean resp = facultyService.deleteFaculty(0);
	   Assert.assertEquals(true, resp);
   }
   @Test
   public void updateFaculty() {
	   Faculty f = new Faculty();
	   f.setName("Najeeb");
	   when(facultyRepository.save(f)).thenReturn(f);
	   Faculty resp = facultyService.updateFaculty(f);
	   Assert.assertEquals("Najeeb", resp.getName());
   }
   
}