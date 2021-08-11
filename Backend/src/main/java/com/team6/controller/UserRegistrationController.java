package com.team6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.team6.model.UserRegistration;
import com.team6.repository.UserRegistrationRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("rest/api")
public class UserRegistrationController {
	@Autowired
	UserRegistrationRepository userRegistrationRepository;
	
	@GetMapping("/users")
	public List<UserRegistration> getAllUsers() {
		return userRegistrationRepository.findAll();
	}
	
	@PostMapping("/users")
	public UserRegistration addUser(@RequestBody UserRegistration userRegistration) {
		return userRegistrationRepository.save(userRegistration);
	}
	
	@DeleteMapping("/users")
	public String deleteUser(@RequestBody UserRegistration userRegistration) {
		userRegistrationRepository.delete(userRegistration);
		return "User deleted.";
		
	}
	
	@PutMapping("/users")
	public String updateUser(@RequestBody UserRegistration userRegistration) {
		UserRegistration updatedUser = userRegistrationRepository.findById(userRegistration.getUserId()).get();
		updatedUser = userRegistration;
		userRegistrationRepository.save(updatedUser);
		return "User updated.";
	}
}
