package com.team6.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ngo_courses")
public class NgoCourses {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ngo_course_generator")
	@SequenceGenerator(name = "ngo_course_generator", sequenceName = "ngo_course_seq", allocationSize = 1)
	private int ngoCourseId;
	private int projecId;

	public NgoCourses(int ngoCourseId, int projecId, String ngoCourseName, String startDate, String endDate) {
		super();
		this.ngoCourseId = ngoCourseId;
		this.projecId = projecId;
		this.ngoCourseName = ngoCourseName;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	private String ngoCourseName;
	private String startDate;
	private String endDate;

	public NgoCourses() {
		super();

	}

	public int getNgoCourseId() {
		return ngoCourseId;
	}

	public void setNgoCourseId(int ngoCourseId) {
		this.ngoCourseId = ngoCourseId;
	}

	public int getProjecId() {
		return projecId;
	}

	public void setProjecId(int projecId) {
		this.projecId = projecId;
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

	@Override
	public String toString() {
		return "NgoCourses [ngoCourseId=" + ngoCourseId + ", projecId=" + projecId + ", ngoCourseName=" + ngoCourseName
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}

}
