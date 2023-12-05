package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="parties")
public class Party {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "party")
	private List<Message> messages;
	
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "party")
	private List<PartyUser> partyUsers;

	public Party(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Party() {
		super();
	}
}
