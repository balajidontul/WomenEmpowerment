package com.team6.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="course_detail")
public class CourseDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_generator")
    	@SequenceGenerator(name="course_generator", sequenceName = "course_seq", allocationSize=1)
	private int userCourseId;
// 	private int courseId;
	private String status;
	public CourseDetail() {
		super();
	}	
	
	public CourseDetail(int userCourseId, String status) {
		super();
		this.courseId = courseId;
		this.status = status;
		
	}

	public int getUserCourseId() {
		return userCourseId;
	}

	public void setUserCourseId(int userCourseId) {
		this.userCourseId = userCourseId;
	}

	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
		
}
