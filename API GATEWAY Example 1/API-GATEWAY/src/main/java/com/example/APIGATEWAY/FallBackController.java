package com.example.APIGATEWAY;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

	@GetMapping("/getFallBackUserService")
	public String getFallUserService() {
		return "User service is not responding...";
	}
	
	@GetMapping("/getFallDepartmentService")
	public String getFallDepartmentService() {
		return "Department service is not responding...";
	}
}
