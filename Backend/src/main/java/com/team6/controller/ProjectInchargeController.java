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

import com.team6.model.CourseDetail;
import com.team6.model.ProjectInCharge;
import com.team6.model.UserRegistration;
import com.team6.repository.ProjectInchargeRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/rest/api")
public class ProjectInchargeController {

	@Autowired
	ProjectInchargeRepository projectInchargeRepository;

	@GetMapping("/project-incharge")
	public List<ProjectInCharge> getAllProjectIncharge() {
		return projectInchargeRepository.findAll();
	}

	@PostMapping("/project-incharge")
	public ProjectInCharge addIncharge(@RequestBody ProjectInCharge incharge) {
		return projectInchargeRepository.save(incharge);

	}

	@PutMapping("/project-incharge")
	public String updIncharge(@RequestBody ProjectInCharge incharge) {
		ProjectInCharge updatedIncharge = projectInchargeRepository.findById(incharge.getProjectId()).get();
		updatedIncharge = incharge;
		projectInchargeRepository.save(updatedIncharge);
		return "Updated.";
	}

	@DeleteMapping("/project-incharge")
	public String deleteIncharge(@RequestBody ProjectInCharge incharge) {
		projectInchargeRepository.delete(incharge);
		return "Deleted.";
	}

}
