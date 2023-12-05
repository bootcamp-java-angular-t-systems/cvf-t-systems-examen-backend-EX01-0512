package com.example.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.User;

@Repository
public interface UserDAO extends JpaRepository<User, Long>{
	User findByUsername(String username);
	
	Optional<User> findByEmail(String email);
	 
	void deleteByEmail(String email);
}
