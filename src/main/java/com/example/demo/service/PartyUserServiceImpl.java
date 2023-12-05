package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPartyUserDAO;
import com.example.demo.dto.PartyUser;

@Service
public class PartyUserServiceImpl implements IPartyUserService {
	
	@Autowired
	IPartyUserDAO partyUserDAO;
	

	@Override
	public PartyUser create(PartyUser partyUser) {
		return partyUserDAO.save(partyUser);
	}

	@Override
	public void delete(Integer id) {
		partyUserDAO.deleteById(id);
		
	}

}
