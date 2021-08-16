package com.team6.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team6.model.EnrollmentDetail;
import com.team6.repository.EnrollRepository;

@Service
@Transactional
public class EnrollService {
	
	@Autowired
	EnrollRepository enrollRepository;
	
	public boolean addenroll(EnrollmentDetail enrollmentDetail) 
	{
		enrollRepository.save(enrollmentDetail);
		return true;
	}

}
