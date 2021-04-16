package com.nagp.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagp.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findById(Long id);
	
}
