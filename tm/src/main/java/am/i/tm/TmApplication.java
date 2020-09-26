package am.i.tm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TmApplication {
	public static void main(String[] args) {
		SpringApplication.run(TmApplication.class, args);
		System.out.println("Hello ...");
	}

	
}
