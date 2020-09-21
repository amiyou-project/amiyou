package am.i.faculty;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import am.i.faculty.domain.Course;

@SpringBootApplication
public class FacultyApplication {
	
	@Autowired
	private static EntityManagerFactory emf;

	public static void main(String[] args) {
		SpringApplication.run(FacultyApplication.class, args);
		System.out.println("Running at port 8085");
	}

}
