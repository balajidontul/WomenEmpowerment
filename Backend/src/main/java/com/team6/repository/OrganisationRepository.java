package com.team6.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.team6.model.OrganisationsInfo;

public interface OrganisationRepository extends JpaRepository<OrganisationsInfo, Integer>{

	@Query("from OrganisationsInfo org where org.status = 'Pending'")
	public List<OrganisationsInfo> findPendingNgo();
	
	@Query("from OrganisationsInfo org where org.status = 'Approved'")
	public List<OrganisationsInfo> findApprovedNgo();
	
	@Modifying
	@Query("UPDATE OrganisationsInfo org SET org.status = 'Approved' WHERE org.organisationId=:organisationId")
	void approveNgoRequest(@Param(value = "organisationId") int organisationId);
	
	@Modifying
	@Query("DELETE FROM OrganisationsInfo org WHERE org.organisationId=:organisationId")
	void deleteNgo(int organisationId);
	
}
