package com.example.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Entity.Department;
import com.example.Entity.User;
import com.example.Repository.UserRepository;
import com.example.ValueObject.UserResponse;

@Service
public class UserService {

	Logger log = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		log.info("Insode service saveUser");
		return userRepository.save(user);
	}

	public UserResponse getUserWithDepartment(Long userId) {
		log.info("Insode service getUserWithDepartment");
		UserResponse userResponse = new UserResponse();
		User user = userRepository.findById(userId).get();

		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/getDepartment/"+user.getDeptId(), Department.class);

		userResponse.setUser(user);
		userResponse.setDepartment(department);

		return userResponse;
	}
}
