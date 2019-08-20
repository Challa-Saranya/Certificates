package com.cg.ums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@ComponentScan("com.cg.ums")
public class UmsprojectspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmsprojectspringApplication.class, args);
		System.out.println("this is the ums project");
	}

}