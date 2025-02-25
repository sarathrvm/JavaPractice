package com.infybuzz.microservices_example_student_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients
public class MicroservicesExampleStudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesExampleStudentServiceApplication.class, args);
	}

}
