package com.team6.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course_enroll_detail")
public class EnrollmentDetail {
	@Id
	private int enrollId;
	private int courseId;
	private int regId;
	private String courseStatus;
	
	public EnrollmentDetail() {
		super();
	}

	public EnrollmentDetail(int courseId, int regId, String courseStatus) {
		super();
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
	
}
