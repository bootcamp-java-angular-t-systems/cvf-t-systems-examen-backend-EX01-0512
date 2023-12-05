package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.PartyUser;

@Repository
public interface IPartyUserDAO extends JpaRepository<PartyUser, Integer>{

}
