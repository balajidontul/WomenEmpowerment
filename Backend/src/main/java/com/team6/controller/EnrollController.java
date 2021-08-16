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

import com.team6.model.EnrollmentDetail;
import com.team6.repository.EnrollRepository;
import com.team6.service.EnrollService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("rest/api")
public class EnrollController {
	
	@Autowired
	EnrollRepository enrollRepo;
	
	@Autowired
	EnrollService enrollService;
	
	@GetMapping("/enroll")
	public List<EnrollmentDetail> getAllEnrolls() {
		return enrollRepo.findAll();
	}
	
	@PutMapping("/enroll")
	public String updateProduct(@RequestBody EnrollmentDetail enrollmentDetail) {
		EnrollmentDetail enrollUpd = enrollRepo.findById(enrollmentDetail.getEnrollId()).get();
		enrollUpd = enrollmentDetail;
		enrollRepo.save(enrollUpd);
		return "updated";
	}
	
	
	@PostMapping("/enroll")
	public boolean addEnroll(@RequestBody EnrollmentDetail enrollmentDetail) {
		return enrollService.addenroll(enrollmentDetail);
	}
	
	@DeleteMapping("/enroll")
	public String deleteProduct(@RequestBody EnrollmentDetail enrollmentDetail) {
		enrollRepo.delete(enrollmentDetail);
		return "deleted";	
	}
}
