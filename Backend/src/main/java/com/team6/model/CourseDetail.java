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
	private String status;
	public CourseDetail() {
		super();
	}	
	
	public CourseDetail(int courseId, int projectId, String status) {
		super();
		this.courseId = courseId;
		this.projectId = projectId;
		this.status = status;
		
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
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
		
}
