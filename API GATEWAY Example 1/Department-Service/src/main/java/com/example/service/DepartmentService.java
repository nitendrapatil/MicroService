package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Department;
import com.example.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	Logger logger = LoggerFactory.getLogger(DepartmentService.class);
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department) {
		logger.info("Inside save department service "  );
		return departmentRepository.save(department);
	}

	public Department getDepartment(Long id) {
		return departmentRepository.findById(id).get();
	}

}
