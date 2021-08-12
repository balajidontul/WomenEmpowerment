package com.team6.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team6.model.OrganisationsInfo;
import com.team6.repository.OrganisationRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("rest/api")
public class OrganisationController {
	@Autowired
	OrganisationRepository organisationRepository;
	
	@GetMapping("/Organisation")
	public List<OrganisationsInfo> getAll() {
		return organisationRepository.findAll();
	}
	
	@GetMapping("/pending-ngo")
	public List<OrganisationsInfo>getPendingNgo() {
		return organisationRepository.findPendingNgo();
	}
	
	@GetMapping("/approved-ngo")
	public List<OrganisationsInfo>getApprovedNgo() {
		return organisationRepository.findApprovedNgo();
	}
	
	@PostMapping("/Organisation")
	public OrganisationsInfo add(@RequestBody OrganisationsInfo organisationsInfo) {
		return organisationRepository.save(organisationsInfo);
	}
	
	
	@PutMapping("/Organisation")
	public String update(@RequestBody OrganisationsInfo organisationsInfo) {
		OrganisationsInfo organisationsTemp = organisationRepository.findById(organisationsInfo.getOrganisationId()).get();
		organisationsTemp = organisationsInfo;
		organisationRepository.save(organisationsTemp);
		return "updated";
	}
	
	@Transactional
	@PutMapping("/pending-ngo/{organisationId}")
	public void approvePendingNgo(@PathVariable(value = "organisationId") int organisationId) {
		organisationRepository.approveNgoRequest(organisationId);
		
	}
	
	@Transactional
	@DeleteMapping("/approved-ngo/{organisationId}")
	public void delete(@PathVariable(value = "organisationId") int organisationId) {
		organisationRepository.deleteNgo(organisationId);
	
		
	}
	
	
}
