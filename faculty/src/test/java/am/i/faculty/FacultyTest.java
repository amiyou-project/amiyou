
package am.i.faculty;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import am.i.faculty.domain.Attendance;
import am.i.faculty.domain.Course;
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
      when(attendanceRepository.findById(0).get().getDescription())
      .thenReturn("remote");
      String testName = attendanceService.getAttendanceById(0).getDescription();
      Assert.assertEquals("remote", testName);
   }
}