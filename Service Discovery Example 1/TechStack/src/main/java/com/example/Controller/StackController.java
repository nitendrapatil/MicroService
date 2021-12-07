package com.example.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.TechStack;

@RestController
@RequestMapping("/stack")
public class StackController {

	@GetMapping("/getStack/{id}")
	public ResponseEntity<List<TechStack>> getStack(@PathVariable("id") String id) throws Exception {
		List<TechStack> techStackList = new ArrayList<>();
		try {
		List<TechStack> list = Arrays.asList(
				new TechStack("1", "Java"), 
				new TechStack("2", ".Net"),
				new TechStack("3", "Python"), 
				new TechStack("1", "Databse"), 
				new TechStack("2", "Cloud"));

		techStackList = list.stream().filter(stack -> stack.getEmpId().equalsIgnoreCase(id))
				.collect(Collectors.toList());
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return new ResponseEntity<List<TechStack>>(techStackList, HttpStatus.OK);
	}
}
