package com.team6.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team6.model.UserRegistration;
import com.team6.repository.UserRegistrationRepository;

@Service
@Transactional
public class UserRegistrationService {

	@Autowired
	UserRegistrationRepository userRegistrationRepository;

	public boolean addUser(UserRegistration user) {
		userRegistrationRepository.save(user);
		return true;
	}

}
