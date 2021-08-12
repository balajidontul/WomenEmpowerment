package com.team6.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team6.model.CourseDetail;
import com.team6.repository.CourseRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("rest/api")
public class CourseController {
	
	@Autowired
	CourseRepository courseRepo;
	
	@GetMapping("/courses")
	public List<CourseDetail> getAll() {
		return courseRepo.findAll();
	}
	
	@PostMapping("/courses")
	public CourseDetail addCourse(@RequestBody CourseDetail courseDetail) {
		return courseRepo.save(courseDetail);
	}
	
	@DeleteMapping("/courses")
	public String deleteProduct(@RequestBody CourseDetail courseDetail) {
		courseRepo.delete(courseDetail);
		return "deleted";
		
	}
	
	@PutMapping("/courses")
	public String updateProduct(@RequestBody CourseDetail courseDetail) {
		CourseDetail courseUpd = courseRepo.findById(courseDetail.getCourseId()).get();
		courseUpd = courseDetail;
		System.out.println("aa");
		courseRepo.save(courseUpd);
		System.out.println("bb");
		return "updated";
	}
}
