package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.dto.User;

public interface IUserService {
	
	List<User> getUsers();
	
	User userPerId(Long userId);
	
	User saveUser(User userId);
	
	User updateUser(User userId);
	
	void deleteUser(Long userId);

	User userByUsername(String username);
	
    Page<User> getPaginatedProyectos(Pageable pageable);

    
	User getUser(String email);
}
