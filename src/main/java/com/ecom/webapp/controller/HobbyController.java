package com.ecom.webapp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.webapp.entity.HobbyEntity;
import com.ecom.webapp.service.HobbyService;

@RestController
@RequestMapping(path="/webapitwo")
public class HobbyController {
	
	@Autowired(required = true)
	HobbyService hobbyService;
	
	@GetMapping("/hobby/person/{personId}")
	public String findHobbyByPersonId(@PathVariable int personId) {
		return hobbyService.finHobbyByPersonId(personId);
	}
	
	@GetMapping("/hobby/{hobbyId}")
	public Optional<HobbyEntity> findHobbyById(@PathVariable int hobbyId) {
		return hobbyService.findHobbyById(hobbyId);
	}
	
	@PostMapping("/hobby")
	public void addHobby(@RequestBody HobbyEntity hobby) {
		hobbyService.addHobby(hobby);
	}

}
