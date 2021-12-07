package com.example.TechStack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
@EnableEurekaClient
public class TechStackApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechStackApplication.class, args);
	}

}
