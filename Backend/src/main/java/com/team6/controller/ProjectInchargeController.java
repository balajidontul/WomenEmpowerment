package com.team6.controller;

import java.util.List;

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

import com.team6.model.CourseDetail;
import com.team6.model.ProjectInCharge;
import com.team6.model.UserRegistration;
import com.team6.repository.ProjectInchargeRepository;
import com.team6.service.ProjectInchargeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/rest/api")
public class ProjectInchargeController {

	@Autowired
	ProjectInchargeRepository projectInchargeRepository;
	
	@Autowired
	ProjectInchargeService projectInchargeService;

	@GetMapping("/project-incharge")
	public List<ProjectInCharge> getAllProjectIncharge() {
		return projectInchargeService.getAllIncharge();
	}

	@PostMapping("/project-incharge/{org_id}")
	public boolean addIncharge(@RequestBody ProjectInCharge newincharge, @PathVariable(value= "org_id") int orgId) 
	{
		return projectInchargeService.addIncharge(newincharge,orgId);
	}

	/*@PutMapping("/project-incharge")
	public String updIncharge(@RequestBody ProjectInCharge incharge) {
		ProjectInCharge updatedIncharge = projectInchargeRepository.findById(incharge.getProjectId()).get();
		updatedIncharge = incharge;
		projectInchargeRepository.save(updatedIncharge);
		return "Updated.";
	}*/

	@DeleteMapping("/project-incharge")
	public String deleteIncharge(@RequestBody ProjectInCharge incharge) {
		projectInchargeService.delIncharge(incharge);
		return "Deleted.";
	}

}
