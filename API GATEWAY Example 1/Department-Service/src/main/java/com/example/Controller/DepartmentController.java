package com.example.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Department;
import com.example.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	Logger log = LoggerFactory.getLogger(DepartmentController.class);
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/department")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("Inside save department controller method");
		Department department2 = new Department();
		try {
			department2 =  departmentService.saveDepartment(department);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return department2;
	}
	
	@GetMapping("/getDepartment/{id}")
	public Department getDepartment(@PathVariable("id") Long id) {
		return departmentService.getDepartment(id);
	}

}
