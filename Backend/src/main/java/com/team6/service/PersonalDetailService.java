package com.team6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team6.model.PersonalDetail;
import com.team6.model.UserRegistration;
import com.team6.repository.PersonalDetailRepository;
import com.team6.repository.UserRegistrationRepository;

@Service
public class PersonalDetailService {

	@Autowired
	PersonalDetailRepository personalDetailRepository;
	
	@Autowired
	UserRegistrationRepository userRegistrationRepository;
	
	public boolean saveRecords(PersonalDetail personalDetail, int user_id) {
		UserRegistration user = userRegistrationRepository.findById(user_id).get();
		personalDetail.setUserRegistration(user);
		personalDetailRepository.save(personalDetail);
		return true;
	}
	
	

}
