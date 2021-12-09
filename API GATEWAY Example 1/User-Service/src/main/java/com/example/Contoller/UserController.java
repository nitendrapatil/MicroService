package com.example.Contoller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.User;
import com.example.Service.UserService;
import com.example.ValueObject.UserResponse;

@RestController
@RequestMapping("/User")
public class UserController {

	Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User user) {
		log.info("insied save user");
		return userService.saveUser(user);
	}
	
	@GetMapping("/getUser/{userId}")
	public UserResponse getUserWithDepartment(@PathVariable("userId") Long userId) {
		log.info("insied getUserWithDepartment");
		return userService.getUserWithDepartment(userId);
	}
}
