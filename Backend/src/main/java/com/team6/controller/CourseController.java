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

import com.team6.model.CourseDetail;
import com.team6.repository.CourseRepository;
import com.team6.service.CourseService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("rest/api")
public class CourseController {
	
	@Autowired
	CourseRepository courseRepo;
	
	@Autowired
	CourseService courseService;
	
	@PostMapping("/courses/{ngo_course_id}" )
	public boolean addCourse(@RequestBody CourseDetail courseDetail, @PathVariable("ngo_course_id") int ngo_course_id) {
		return courseService.saveRecords(courseDetail, ngo_course_id);
	}
	
	@GetMapping("/courses")
	public List<CourseDetail> getAll() {
		return courseRepo.findAll();
	}
	
	@PostMapping("/courses")
	public CourseDetail addCourse(@RequestBody CourseDetail courseDetail) {
		return courseRepo.save(courseDetail);
	}
	
	@DeleteMapping("/courses")
	public String deleteCourse(@RequestBody CourseDetail courseDetail) {
		courseRepo.delete(courseDetail);
		return "deleted";
		
	}
	
	@PutMapping("/courses")
	public String updateCourse(@RequestBody CourseDetail courseDetail) {
		CourseDetail courseUpd = courseRepo.findById(courseDetail.getUserCourseId()).get();
		courseUpd = courseDetail;
		System.out.println("aa");
		courseRepo.save(courseUpd);
		System.out.println("bb");
		return "updated";
	}
}
