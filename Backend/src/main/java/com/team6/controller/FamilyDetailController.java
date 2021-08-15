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

import com.team6.model.FamilyDetail;
import com.team6.repository.FamilyDetailRepository;
import com.team6.service.FamilyDetailService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("rest/api")
public class FamilyDetailController {
	
	
		@Autowired
		FamilyDetailRepository familyRepo;
		
		@Autowired
		FamilyDetailService familyDetailService;
		
		@GetMapping("/familydetail")
		public List<FamilyDetail> getAll() {
			return familyRepo.findAll();
		}
		
		@PostMapping("/familydetail/{regId}" )
		public boolean addCourse(@RequestBody FamilyDetail familyDetail, @PathVariable("regId") int regId)
		{
			return familyDetailService.saveRecords(familyDetail, regId);
		}
		
		@DeleteMapping("/familydetail")
		public String deleteProduct(@RequestBody FamilyDetail familyDetail) {
			familyRepo.delete(familyDetail);
			return "deleted";
			
		}
		
		@PutMapping("/familydetail")
		public String updateProduct(@RequestBody FamilyDetail familyDetail) {
			FamilyDetail familyUpd = familyRepo.findById(familyDetail.getRegistrationId()).get();
			familyUpd = familyDetail;
			familyRepo.save(familyUpd);
			return "updated";
		}
	}



