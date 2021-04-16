package com.nagp.user.service;

import com.nagp.user.entity.User;

public interface UserService {

	User getUser(Long userId);
	
	User save(User user);
	
}
