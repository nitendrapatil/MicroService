package com.example.EmployeeInfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan("com.example")
@EnableEurekaClient
public class EmployeeInfoApplication {
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplae() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeInfoApplication.class, args);
	}

}
