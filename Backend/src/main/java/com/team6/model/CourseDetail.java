package com.team6.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ngo_course_id")
	private NgoCourses ngoCourses;
	
	
	public CourseDetail() {
		super();
	}	
	
	public CourseDetail(int userCourseId, String status) {
		super();
		this.userCourseId = userCourseId;
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

	public NgoCourses getNgoCourses() {
		return ngoCourses;
	}

	public void setNgoCourses(NgoCourses ngoCourses) {
		this.ngoCourses = ngoCourses;
	}
	
	
		
}
