package com.vishnu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.vishnu.repository")
public class RestfullApplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfullApplicationApplication.class, args);
	}

}
