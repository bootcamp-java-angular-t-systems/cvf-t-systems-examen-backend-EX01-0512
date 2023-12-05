package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IMessageDAO;
import com.example.demo.dto.Message;

@Service
public class MessageServiceImpl implements IMessageService{

	@Autowired
	IMessageDAO messageDAO;
	
	@Override
	public Message findById(Integer id) {
		return messageDAO.findById(id).get();
	}
	
	@Override
	public Message create(Message message) {
		return messageDAO.save(message);
	}

	@Override
	public Message update(Message message) {
		return messageDAO.save(message);
	}

	@Override
	public void delete(Integer id) {
		messageDAO.deleteById(id);
	}

}
