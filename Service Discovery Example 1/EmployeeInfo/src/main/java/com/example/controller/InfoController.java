package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.exmaple.model.EmployeeInformation;
import com.exmaple.model.TechStack;
import com.exmaple.model.WorkHistory;

@RestController
@RequestMapping("/Employee")
public class InfoController {
	
	@Autowired
	
	private RestTemplate restTemplate;
	
	@GetMapping(value = "/getEmployee/{id}")
	public ResponseEntity<EmployeeInformation> getEmployeeInfo(@PathVariable("id") String id) throws Exception {

		EmployeeInformation empInfo = null;
		try {
			List<WorkHistory> workList = restTemplate.getForObject("http://WORKHISTORY//work/getWorkHistory/"+id,List.class);
			
			System.out.println("work "+workList);
			
			List<TechStack> stackList = restTemplate.getForObject("http://TECHSTACK/stack/getStack/"+id,List.class);
			
			empInfo = new EmployeeInformation("1", "Nitendra", "Pune", "n@gmail.com",workList,stackList);

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
		return new ResponseEntity<EmployeeInformation>(empInfo, HttpStatus.OK);
	}

}
