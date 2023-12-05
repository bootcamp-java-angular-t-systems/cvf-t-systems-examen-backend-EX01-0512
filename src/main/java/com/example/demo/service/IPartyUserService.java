package com.example.demo.service;

import com.example.demo.dto.PartyUser;

public interface IPartyUserService {

	
	public PartyUser create(PartyUser party);
	
	public void delete(Integer id);
}

