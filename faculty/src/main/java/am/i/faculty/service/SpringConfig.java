package am.i.faculty.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	@Bean
	public AttendanceServiceImpl transactionService() {
	    return new AttendanceServiceImpl() {
		};
	}

}
