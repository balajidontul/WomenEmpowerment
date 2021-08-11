package com.team6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.team6.model.CourseDetail;

public interface ProjectRepository extends JpaRepository<CourseDetail, Integer> {

}