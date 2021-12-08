package com.example.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.exmaple.model.TechStack;
import com.exmaple.model.WorkHistory;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class FallbackService {

	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "getFallbackTechStack")
	public List<TechStack> getTechStack(String id) {
		return restTemplate.getForObject("http://TECHSTACK/stack/getStack/"+id,List.class);
	}
	
	public List<TechStack> getFallbackTechStack(String id) {
		return Arrays.asList(new TechStack("0", "0"));
	}

	@HystrixCommand(fallbackMethod = "getFallbackWorkHistory")
	public List<WorkHistory> getWorkHistory(String id) {
		return restTemplate.getForObject("http://WORKHISTORY//work/getWorkHistory/"+id,List.class);
	}
	
	public List<WorkHistory> getFallbackWorkHistory(String id) {
		return Arrays.asList(new WorkHistory("0","0", "0", "0"));
	}
}
