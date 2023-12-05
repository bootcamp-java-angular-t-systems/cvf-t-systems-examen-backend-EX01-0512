package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Message;
import com.example.demo.service.MessageServiceImpl;

@RestController
@RequestMapping("/message")
public class MessageController {
	
	@Autowired
	MessageServiceImpl messageService;
	
	@PostMapping("")
	public Message create(@RequestBody Message message) {
		return messageService.create(message);
	}
	
	@PutMapping("/{id}")
	public Message updateMessage(@PathVariable(name="id")Integer id,@RequestBody Message message) {
		
		Message messageSeleccionada= new Message();
		
		messageSeleccionada= messageService.findById(id);
		
		messageSeleccionada.setText(message.getText());
		messageSeleccionada.setParty(message.getParty());
		messageSeleccionada.setUser(message.getUser());
		
		messageSeleccionada = messageService.update(messageSeleccionada);
		
		return messageSeleccionada;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable(name="id") Integer id) {
		messageService.delete(id);
	}

}
