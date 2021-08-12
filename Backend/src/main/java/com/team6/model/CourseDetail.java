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
	private int courseId;
	private int projectId;
	private String courseName;
	private String courseStartDate;
	private String courseEndDate;
	private String status;
	private String orgName;
	public CourseDetail() {
		super();
	}	
	
	public CourseDetail(int courseId, int projectId, String courseName, String courseStartDate, String status, String courseEndDate,
			String orgName) {
		super();
		this.courseId = courseId;
		this.projectId = projectId;
		this.courseName = courseName;
		this.courseStartDate = courseStartDate;
		this.courseEndDate = courseEndDate;
		this.status = status;
		this.orgName = orgName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseStartDate() {
		return courseStartDate;
	}
	public void setCourseStartDate(String courseStartDate) {
		this.courseStartDate = courseStartDate;
	}
	public String getCourseEndDate() {
		return courseEndDate;
	}
	public void setCourseEndDate(String courseEndDate) {
		this.courseEndDate = courseEndDate;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
		
}
