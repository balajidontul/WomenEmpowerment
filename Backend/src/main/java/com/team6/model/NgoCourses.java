package com.team6.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ngo_courses")
public class NgoCourses {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ngo_course_generator")
	@SequenceGenerator(name = "ngo_course_generator", sequenceName = "ngo_course_seq", allocationSize = 1)
	private int ngoCourseId;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="projectId")
	private ProjectInCharge projectInCharge;
	private String ngoCourseName;
	private String startDate;
	private String endDate;
	public int getNgoCourseId() {
		return ngoCourseId;
	}
	public void setNgoCourseId(int ngoCourseId) {
		this.ngoCourseId = ngoCourseId;
	}
	public ProjectInCharge getProjectInCharge() {
		return projectInCharge;
	}
	public void setProjectInCharge(ProjectInCharge projectInCharge) {
		this.projectInCharge = projectInCharge;
	}
	public String getNgoCourseName() {
		return ngoCourseName;
	}
	public void setNgoCourseName(String ngoCourseName) {
		this.ngoCourseName = ngoCourseName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public NgoCourses(int ngoCourseId, ProjectInCharge projectInCharge, String ngoCourseName, String startDate,
			String endDate) {
		super();
		this.ngoCourseId = ngoCourseId;
		this.projectInCharge = projectInCharge;
		this.ngoCourseName = ngoCourseName;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public NgoCourses() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	

}
