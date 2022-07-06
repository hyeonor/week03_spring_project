package com.sparta.week03_spring_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Week03SpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week03SpringProjectApplication.class, args);
	}

}
