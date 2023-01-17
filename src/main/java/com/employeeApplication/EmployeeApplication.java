package com.employeeApplication;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeApplication {
	
	static Logger logger = LoggerFactory.getLogger(EmployeeApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application Started in Jenkins");
	}

	public static void main(String[] args) {
		logger.info("Application executed in Jenkins");
		SpringApplication.run(EmployeeApplication.class, args);
	}

}
