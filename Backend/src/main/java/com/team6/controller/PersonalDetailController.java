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

import com.team6.model.PersonalDetail;
import com.team6.repository.PersonalDetailRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("rest/api")
public class PersonalDetailController {
	
		@Autowired
		PersonalDetailRepository personalRepo;
		
		@GetMapping("/personaldetail")
		public List<PersonalDetail> getAll() {
			return personalRepo.findAll();
		}
		
		@PostMapping("/personaldetail")
		public PersonalDetail addCourse(@RequestBody PersonalDetail personalDetail) {
			return personalRepo.save(personalDetail);
		}
		
		@DeleteMapping("/personaldetail")
		public String deleteProduct(@RequestBody PersonalDetail personalDetail) {
			personalRepo.delete(personalDetail);
			return "deleted";
			
		}
		
		@PutMapping("/personaldetail")
		public String updateProduct(@RequestBody PersonalDetail personalDetail) {
			PersonalDetail detailsUpd = personalRepo.findById(personalDetail.getRegid()).get();
			detailsUpd = personalDetail;
			personalRepo.save(detailsUpd);
			return "updated";
		}
	}



