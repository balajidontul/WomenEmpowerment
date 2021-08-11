package com.team6.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team6.model.CourseDetail;
import com.team6.model.OrganisationsInfo;
import com.team6.repository.CourseRepository;
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
	
	@DeleteMapping("/Organisation")
	public String delete(@RequestBody OrganisationsInfo organisationsInfo) {
		organisationRepository.delete(organisationsInfo);
		return "deleted";
		
	}
	
	@PutMapping("/Organisation")
	public String update(@RequestBody OrganisationsInfo organisationsInfo) {
		OrganisationsInfo organisationsTemp = organisationRepository.findById(organisationsInfo.getOrganisationId()).get();
		organisationsTemp = organisationsInfo;
		organisationRepository.save(organisationsTemp);
		return "updated";
	}
}
