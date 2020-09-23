package am.i.databaseBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseBuilderApplication {
	public static void main(String[] args) {
		SpringApplication.run(DatabaseBuilderApplication.class, args);
		System.out.println("Table creation is lazy!");
	}

}
