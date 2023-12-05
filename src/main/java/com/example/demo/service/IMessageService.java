package com.example.demo.service;

import com.example.demo.dto.Message;

public interface IMessageService {
	
	public Message findById(Integer id);
	
	public Message create(Message message);
	
	public Message update(Message message);
	
	public void delete(Integer id);

}
