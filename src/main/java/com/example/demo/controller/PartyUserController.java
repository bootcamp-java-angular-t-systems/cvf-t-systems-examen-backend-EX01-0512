package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PartyUser;
import com.example.demo.service.PartyUserServiceImpl;

@RestController
@RequestMapping("/party-user")
public class PartyUserController {
	
	@Autowired
	PartyUserServiceImpl partyUserService;
	
	@PostMapping("")
	public PartyUser create(@RequestBody PartyUser partyUser) {
		return partyUserService.create(partyUser);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable(name="id") Integer id) {
		partyUserService.delete(id);
	}
}
