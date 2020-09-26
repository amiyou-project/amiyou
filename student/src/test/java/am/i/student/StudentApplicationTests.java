package am.i.student;

import am.i.student.domain.Student;
import am.i.student.repository.StudentDAO;
import am.i.student.service.IStudentService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
class StudentApplicationTests {
	@Autowired
	private IStudentService studentService;
	@MockBean
	private StudentDAO studentDao;

	@Test
	public void getStudentTest() {
		when(studentDao.findAll())
				.thenReturn(
						java.util.stream.Stream
								.of(new Student("Gkane",1,111140,new java.util.Date()),
										new Student("Gkane",2,111140,new java.util.Date()))
								.collect(Collectors.toList()));
		assertEquals(2, studentService.getAllStudent().size());
	}
	@Test
	void contextLoads() {
	}

}
