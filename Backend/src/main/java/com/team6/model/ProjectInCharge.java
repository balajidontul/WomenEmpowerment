package com.team6.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "project_incharge_detail")
public class ProjectInCharge {

	
	//@Id
	private int projectID;
	private int organisationID;
	private String projectName;
	private String startDate;
	private String endDate;
	private String projectMentor;
	public int getProjectID() {
		return projectID;
	}
	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}
	public int getOrganisationID() {
		return organisationID;
	}
	public void setOrganisationID(int organisationID) {
		this.organisationID = organisationID;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
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
	public String getProjectMentor() {
		return projectMentor;
	}
	public void setProjectMentor(String projectMentor) {
		this.projectMentor = projectMentor;
	}
	public ProjectInCharge(int projectID, int organisationID, String projectName, String startDate, String endDate,
			String projectMentor) {
		super();
		this.projectID = projectID;
		this.organisationID = organisationID;
		this.projectName = projectName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.projectMentor = projectMentor;
	}
	public ProjectInCharge() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ProjectInCharge [projectID=" + projectID + ", organisationID=" + organisationID + ", projectName="
				+ projectName + ", startDate=" + startDate + ", endDate=" + endDate + ", projectMentor=" + projectMentor
				+ "]";
	}
	
	
	
}
