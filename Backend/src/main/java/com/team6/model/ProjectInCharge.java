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
@Table(name = "project_incharge_detail")
public class ProjectInCharge {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inchargeid_generator")
	@SequenceGenerator(name = "inchargeid_generator", sequenceName = "incharge_seq", allocationSize = 1)
	private int projectId;
	//private int orgId;
	private String projectName;
	//private String startDate;
	//private String endDate;
	private String projectMentor;
	
	@OneToOne (cascade= CascadeType.ALL)
	@JoinColumn (name="org_id")
	private OrganisationsInfo organisationsInfo;
	

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public String getProjectMentor() {
		return projectMentor;
	}

	public void setProjectMentor(String projectMentor) {
		this.projectMentor = projectMentor;
	}

	public OrganisationsInfo getOrganisationsInfo() {
		return organisationsInfo;
	}

	public void setOrganisationsInfo(OrganisationsInfo organisationsInfo) {
		this.organisationsInfo = organisationsInfo;
	}


	public ProjectInCharge(int projectId, String projectName, String projectMentor,
			OrganisationsInfo organisationsInfo) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectMentor = projectMentor;
		this.organisationsInfo = organisationsInfo;
	}

	public ProjectInCharge() {
		super();
	}

}
