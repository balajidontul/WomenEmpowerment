package com.team6.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ngo_detail")
public class OrganisationsInfo {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "org_id_generator")
    @SequenceGenerator(name="org_id_generator", sequenceName = "org_id_seq", allocationSize=1)
	private int organisationId;
	private String organisationName;
	private String pan;
	private String organisationMail;
	private long organisationPhone;
	private String location;
	private String status;
	private String password;
	
	
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getOrganisationId() {
		return organisationId;
	}
	public void setOrganisationId(int organisationId) {
		this.organisationId = organisationId;
	}
	public String getOrganisationName() {
		return organisationName;
	}
	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getOrganisationMail() {
		return organisationMail;
	}
	public void setOrganisationMail(String organisationMail) {
		this.organisationMail = organisationMail;
	}
	public long getOrganisationPhone() {
		return organisationPhone;
	}
	public void setOrganisationPhone(long organisationPhone) {
		this.organisationPhone = organisationPhone;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	public OrganisationsInfo(int organisationId, String organisationName, String pan, String organisationMail,
			long organisationPhone, String location, String status, String password) {
		super();
		this.organisationId = organisationId;
		this.organisationName = organisationName;
		this.pan = pan;
		this.organisationMail = organisationMail;
		this.organisationPhone = organisationPhone;
		this.location = location;
		this.status = status;
		this.password = password;
	}
	public OrganisationsInfo() {
		super();

	}
	
	
	
}
