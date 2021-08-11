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

import com.team6.model.ProjectInCharge;
import com.team6.service.ProjectInchargeService;

@RestController
@CrossOrigin(origins="http://localhost:8084")
@RequestMapping("/Rest/api")
public class ProjectInchargeController {
	
	@Autowired
	ProjectInchargeService inchargeService;
	
	@GetMapping("/projincharge")
	public List<ProjectInCharge> getAll()
	{
		return inchargeService.getAllIncharge();
	}
	
	@PostMapping("/projincharge")
	public boolean addIncharge(@RequestBody ProjectInCharge incharge)
	{
		inchargeService.addIncharge(incharge);
		return true;
	}
	
	@PutMapping("/projincharge")
	public boolean updIncharge(@RequestBody ProjectInCharge incharge)
	{
		inchargeService.updIncharge(incharge);
		return true;
	}
	
	@DeleteMapping("/projincharge")
	public boolean delIncharge(@RequestBody ProjectInCharge incharge)
	{
		inchargeService.delIncharge(incharge);
		return true;
	}

}
