package com.team6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team6.model.CourseDetail;
import com.team6.model.NgoCourses;
import com.team6.model.PersonalDetail;
import com.team6.repository.CourseRepository;
import com.team6.repository.NgoCoursesRepository;
import com.team6.repository.PersonalDetailRepository;

@Service
public class CourseService {

	@Autowired
	NgoCoursesRepository ngoCoursesRepository;
	
	@Autowired
	CourseRepository courseRepository;
	
	@Autowired
	PersonalDetailRepository personalDetailRepository;
	

	public boolean saveRecords(CourseDetail courseDetail, int ngo_course_id) {
		NgoCourses ngoCourses = ngoCoursesRepository.findById(ngo_course_id).get();
		courseDetail.setNgoCourses(ngoCourses);
		courseRepository.save(courseDetail);
		return true;
	}
	
	public boolean saveUserCourses(CourseDetail courseDetail, int reg_id) {
		PersonalDetail personalDetail = personalDetailRepository.findById(reg_id).get();
		courseDetail.setPersonalDetail(personalDetail);
		courseRepository.save(courseDetail);
		return true;
	}

}
