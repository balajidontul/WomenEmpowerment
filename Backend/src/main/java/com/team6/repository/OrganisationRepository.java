package com.team6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.team6.model.CourseDetail;
import com.team6.model.OrganisationsInfo;

public interface OrganisationRepository extends JpaRepository<OrganisationsInfo, Integer>{

}
