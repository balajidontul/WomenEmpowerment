package com.team6.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team6.model.OrganisationsInfo;
import com.team6.repository.OrganisationRepository;

@Service
@Transactional
public class OrganisationService {
	
	@Autowired
	OrganisationRepository organisationRepository;
	
	public boolean addOrg(OrganisationsInfo org) 
	{
		organisationRepository.save(org);
		return true;
	}

}
