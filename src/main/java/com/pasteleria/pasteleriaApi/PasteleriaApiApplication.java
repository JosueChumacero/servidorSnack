package com.pasteleria.pasteleriaApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.pasteleria.dao")
@ComponentScan(basePackages = "com.pasteleria")
@EntityScan("com.pasteleria.modelo")
public class PasteleriaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PasteleriaApiApplication.class, args);
	}
}
