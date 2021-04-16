package com.nagp.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagp.user.entity.User;
import com.nagp.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	
	@GetMapping("/user/{userId}")
	public User getUserDetail(@PathVariable("userId") Long userId) {
		return userService.getUser(userId);
	}
	
	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		return userService.save(user);
	}
	
}
