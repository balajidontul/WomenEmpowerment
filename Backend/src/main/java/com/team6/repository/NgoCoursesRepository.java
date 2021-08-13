package com.team6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.team6.model.NgoCourses;


@Repository
public interface NgoCoursesRepository extends JpaRepository<NgoCourses, Integer>  {

}
