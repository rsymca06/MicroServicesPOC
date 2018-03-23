package com.poc.microservices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.config.EnableAdminServer;


@SpringBootApplication
@EnableAdminServer
public class MicroServicesAdmin {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesAdmin.class, args);
	}
}
