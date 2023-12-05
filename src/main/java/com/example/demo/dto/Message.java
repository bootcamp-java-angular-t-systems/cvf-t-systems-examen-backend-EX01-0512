package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="messages")
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String text;
	
	@ManyToOne
	@JsonIgnoreProperties("message")
	@JoinColumn(name = "party_id")
	private Party party;
	
	@ManyToOne
	@JsonIgnoreProperties("message")
	@JoinColumn(name = "user_id")
	private User user;

	public Message(int id, String text, Party party, User user) {
		super();
		this.id = id;
		this.text = text;
		this.party = party;
		this.user = user;
	}

	public Message() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
		
}
