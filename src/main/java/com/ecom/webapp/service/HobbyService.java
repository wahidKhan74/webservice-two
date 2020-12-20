package com.ecom.webapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.webapp.entity.HobbyEntity;
import com.ecom.webapp.repository.HobbyRepository;

@Service
public class HobbyService {
	
	@Autowired
	HobbyRepository hobbyRepository;
	
	public String finHobbyByPersonId(int personId) {
		return hobbyRepository.findHobbyByPersonId(personId);
	}
	
	public void addHobby(HobbyEntity hobby) {
		hobbyRepository.save(hobby);
	}
	
	public Optional<HobbyEntity> findHobbyById(int hobbyId) {
		return hobbyRepository.findById(hobbyId);
	}
}
