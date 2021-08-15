package com.team6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team6.model.FamilyDetail;
import com.team6.model.PersonalDetail;
import com.team6.repository.FamilyDetailRepository;
import com.team6.repository.PersonalDetailRepository;


@Service
public class FamilyDetailService {
	@Autowired
	FamilyDetailRepository familyDetailRepository;
	
	@Autowired
	PersonalDetailRepository personalDetailRepository;
	
	public boolean saveRecords(FamilyDetail familyDetail, int regId) {
		PersonalDetail personal = personalDetailRepository.findById(regId).get();
		familyDetail.setPersonaldetail(personal);
		familyDetailRepository.save(familyDetail);
		return true;
	}
	
	
	

}
