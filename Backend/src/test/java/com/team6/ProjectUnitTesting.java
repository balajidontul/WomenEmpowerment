package com.team6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.team6.model.FamilyDetail;
import com.team6.model.OrganisationsInfo;
import com.team6.model.PersonalDetail;
import com.team6.model.ProjectInCharge;
import com.team6.model.UserRegistration;
import com.team6.repository.OrganisationRepository;
import com.team6.service.FamilyDetailService;
import com.team6.service.OrganisationService;
import com.team6.service.PersonalDetailService;
import com.team6.service.ProjectInchargeService;
import com.team6.service.UserRegistrationService;

@SpringBootTest
class ProjectUnitTesting {
	
	@Autowired
	OrganisationService organisationService;
	
	@Autowired
	ProjectInchargeService projectInchargeService;
	
	@Autowired
	PersonalDetailService personalDetailService;
	
	@Autowired
	FamilyDetailService familyService;

	@Autowired
	UserRegistrationService userRegistrationService;
	
	@Test
	void test() {
		assertEquals(true, true);
	}
	
	@Test
	void UserRegistrationTest() {
		
		UserRegistration user = new UserRegistration();
		user.setUserId(1);
		user.setFirstName("Nitin");
		user.setLastName("Tiwari");
		user.setEmail("nitins.tiwari@lntinfotech.com");
		user.setDob("21-08-1999");
		user.setPassword("password@123");
		user.setContactNo("9000080000");
		
		boolean result=userRegistrationService.addUser(user);
		assertEquals(true, result);
	}
	
	@Test
	void OrgInfoTest() {
		OrganisationsInfo org=new OrganisationsInfo();
		
		org.setOrganisationId(1);
		org.setOrganisationName("For The Children");
		org.setLocation("Chennai");
		org.setOrganisationMail("abcd@gmail.com");
		org.setOrganisationPhone(1234567890);
		org.setPan("ABCD123456");
		org.setPassword("abcd@1234");
		org.setStatus("Pending");
		
		boolean response=organisationService.addOrg(org);
		
		assertEquals(true,response);
	}
	
	@Test
	void ProjInChargeTest() {
		ProjectInCharge proj=new ProjectInCharge();
		
		proj.setProjectId(1);
		proj.setProjectName("Daily Meals");
		proj.setProjectMentor("Adam");
		
		boolean response=projectInchargeService.addIncharge(proj, 1);
		
		assertEquals(true,response);
	}
	
	@Test
	void PersonalDetTest() {
		PersonalDetail personal=new PersonalDetail();
		
		personal.setRegId(1);
		personal.setPan("ABCD123456");
		personal.setAadharNo("EFGH789012");
		personal.setMaritalStatus("Single");
		personal.setPhone(1234567890);
		
		boolean response=personalDetailService.saveRecords(personal, 1);
		
		assertEquals(true, response);
	}
	
	@Test
	void FamilyDetailTest()
	{
		FamilyDetail family = new FamilyDetail();
		family.setFirstName("Flarance");
		family.setLastName("Raju");
		family.setRegistrationId(1);
		family.setRelationship("Father");
		
		boolean response = familyService.saveRecords(family, 1);
		assertEquals(true, response);
	}


}
