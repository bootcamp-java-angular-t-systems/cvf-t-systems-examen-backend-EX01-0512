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
@Table(name="party_user")
public class PartyUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JsonIgnoreProperties("party_user")
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne
	@JsonIgnoreProperties("party_user")
	@JoinColumn(name = "party_id")
	private Party party;

	public PartyUser(int id, User user, Party party) {
		super();
		this.id = id;
		this.user = user;
		this.party = party;
	}

	public PartyUser() {
		super();
	}


}
