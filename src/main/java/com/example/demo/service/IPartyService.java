package com.example.demo.service;

import com.example.demo.dto.Party;

public interface IPartyService {
	
	public Party create(Party party);
	
	public void delete(Integer id);
	
}
