package com.team6.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "course_enroll_detail")
public class EnrollmentDetail {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "enroll_generator")
@SequenceGenerator(name="enroll_generator", sequenceName = "enroll_seq", allocationSize=1)
private int enrollId;
private int courseId;
private int regId;
private String courseStatus;
	
	public EnrollmentDetail() {
		super();
	}

	
	public EnrollmentDetail(int enrollId, int courseId, int regId, String courseStatus) {
		super();
		this.enrollId = enrollId;
		this.courseId = courseId;
		this.regId = regId;
		this.courseStatus = courseStatus;
	}


	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getRegId() {
		return regId;
	}

	public void setRegId(int regId) {
		this.regId = regId;
	}

	public String getCourseStatus() {
		return courseStatus;
	}

	public void setCourseStatus(String courseStatus) {
		this.courseStatus = courseStatus;
	}


	public int getEnrollId() {
		return enrollId;
	}


	public void setEnrollId(int enrollId) {
		this.enrollId = enrollId;
	}
	
	
}
