package com.team6.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "project_incharge_detail")
public class ProjectInCharge {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inchargeid_generator")
    @SequenceGenerator(name="inchargeid_generator", sequenceName = "incharge_seq", allocationSize=1)
	private int projectid;
	//private int orgid; //(FK)
	private String projectname;
	private String startdate;
	private String enddate;
	private String projectmentor;
	
	
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	/*public int getOrgid() {
		return orgid;
	}
	public void setOrgid(int orgid) {
		this.orgid = orgid;
	}*/
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getProjectmentor() {
		return projectmentor;
	}
	public void setProjectmentor(String projectmentor) {
		this.projectmentor = projectmentor;
	}
	
	public ProjectInCharge(int projectid, String projectname, String startdate, String enddate, String projectmentor) {
		super();
		this.projectid = projectid;
		this.projectname = projectname;
		this.startdate = startdate;
		this.enddate = enddate;
		this.projectmentor = projectmentor;
	}
	
	public ProjectInCharge() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
