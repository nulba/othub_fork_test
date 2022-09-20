package com.project.othub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@ComponentScan(basePackages = "controller")
public class OthubApplication {

	public static void main(String[] args) {
		SpringApplication.run(OthubApplication.class, args);
	}

}
