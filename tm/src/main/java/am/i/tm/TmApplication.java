package am.i.tm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableDiscoveryClient
//@EnableCircuitBreaker
public class TmApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmApplication.class, args);
		System.out.println("Hello ...");
	}

	/*
	 * @Bean public RestTemplate restTemplate() { return new RestTemplate(); }
	 */

}
