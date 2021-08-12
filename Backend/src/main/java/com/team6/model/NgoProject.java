package com.team6.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ngo_project_detail")
public class NgoProject {
	
	@Id
	private int ngoProjectID;
	
	@Column
	private ProjectInCharge projectInCharge;
	
	@Column
	private OrganisationsInfo organisationsInfo;
	
	
	public int getNgoProjectID() {
		return ngoProjectID;
	}
	public void setNgoProjectID(int ngoProjectID) {
		this.ngoProjectID = ngoProjectID;
	}
	public ProjectInCharge getProjectInCharge() {
		return projectInCharge;
	}
	public void setProjectInCharge(ProjectInCharge projectInCharge) {
		this.projectInCharge = projectInCharge;
	}
	public OrganisationsInfo getOrganisationsInfo() {
		return organisationsInfo;
	}
	public void setOrganisationsInfo(OrganisationsInfo organisationsInfo) {
		this.organisationsInfo = organisationsInfo;
	}
	public NgoProject(int ngoProjectID, ProjectInCharge projectInCharge, OrganisationsInfo organisationsInfo) {
		super();
		this.ngoProjectID = ngoProjectID;
		this.projectInCharge = projectInCharge;
		this.organisationsInfo = organisationsInfo;
	}
	public NgoProject() {
		super();
		
	}
	@Override
	public String toString() {
		return "NgoProject [ngoProjectID=" + ngoProjectID + ", projectInCharge=" + projectInCharge
				+ ", organisationsInfo=" + organisationsInfo + "]";
	}
	
	

}
