package com.nagp.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagp.user.entity.User;
import com.nagp.user.repository.UserRepository;
import com.nagp.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User getUser(Long userId) {
		return userRepository.findById(userId).orElseGet(null);
	}

	@Override
	public User save(User user) {
		return userRepository.save(user);
		
	}

}
