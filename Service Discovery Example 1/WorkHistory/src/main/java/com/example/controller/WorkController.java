package com.example.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.WorkHistory;

@RestController
@RequestMapping("work")
public class WorkController {

	@GetMapping(value = "/getWorkHistory/{id}")
	public ResponseEntity<List<WorkHistory>> getWorkHistory(@PathVariable("id") String id) throws Exception {
		List<WorkHistory> workList = new ArrayList<>();
		List<WorkHistory> list = new ArrayList<>();

		list.add(new WorkHistory("1", "Infosys", "3", "Sr. Developer"));
		list.add(new WorkHistory("2", "CTS ", "1", "Jr. Developer"));
		list.add(new WorkHistory("1", "TCS", "4", "Developer"));
		list.add(new WorkHistory("2", "Capgemini", "3.5", "System Analyst"));
		list.add(new WorkHistory("3", "Tech M", "1.4", "Developer"));
		list.add(new WorkHistory("4", "Amdocs", "7", "Developer"));

		try {

			workList = list.stream().filter(work -> work.getEmpId().equalsIgnoreCase(id)).collect(Collectors.toList());

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
		return new ResponseEntity<List<WorkHistory>>(workList, HttpStatus.OK);
	}

}
