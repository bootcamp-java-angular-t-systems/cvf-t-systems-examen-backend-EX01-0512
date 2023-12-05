package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPartyDAO;
import com.example.demo.dto.Party;

@Service
public class PartyServiceImpl implements IPartyService {

	@Autowired
	IPartyDAO partyDAO;
	
	@Override
	public Party create(Party party) {
		return partyDAO.save(party);
	}

	@Override
	public void delete(Integer id) {
		partyDAO.deleteById(id);
	}

}
