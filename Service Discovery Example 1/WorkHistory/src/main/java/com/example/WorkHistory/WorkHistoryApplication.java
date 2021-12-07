package com.example.WorkHistory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
@EnableDiscoveryClient
public class WorkHistoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkHistoryApplication.class, args);
	}

}
