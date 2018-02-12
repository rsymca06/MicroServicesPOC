package com.microservices.poc.finance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.microservices.poc.finance.service.FinanceService;
import com.microservices.poc.finance.service.FinanceServiceImpl;
@EnableEurekaClient
@SpringBootApplication
public class FinanceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinanceServiceApplication.class, args);
	}
	
	@Bean
	FinanceService financeService(){
		return new FinanceServiceImpl();
	}
}
