package com.team6.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.team6.model.CourseDetail;
import com.team6.model.OrganisationsInfo;

public interface OrganisationRepository extends JpaRepository<OrganisationsInfo, Integer>{

	@Query("from OrganisationsInfo org where org.status = 'Pending'")
	public List<OrganisationsInfo> findPendingNgo();
	
	@Query("from OrganisationsInfo org where org.status = 'Approved'")
	public List<OrganisationsInfo> findApprovedNgo();
}
