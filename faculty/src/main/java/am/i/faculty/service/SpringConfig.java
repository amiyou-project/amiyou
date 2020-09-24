package am.i.faculty.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	@Bean
	public AttendanceServiceImpl transactionService() {
	    return new AttendanceServiceImpl() {

			@Override
			public int getcountAttendance(int student_id, int course_id) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}

}
