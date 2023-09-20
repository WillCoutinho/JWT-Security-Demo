package coutinho.demo.jwt.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class DemoJwtSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJwtSecurityApplication.class, args);
	}

}
