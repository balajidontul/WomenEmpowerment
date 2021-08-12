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
	private String password;
	private long organisationPhone;
	private String location;
	private String status;
	
	
	public OrganisationsInfo(int organisationId, String organisationName, String pan, String organisationMail,
			String password, long organisationPhone, String location, String status) {
		super();
		this.organisationId = organisationId;
		this.organisationName = organisationName;
		this.pan = pan;
		this.organisationMail = organisationMail;
		this.password = password;
		this.organisationPhone = organisationPhone;
		this.location = location;
		this.status = status;
	}
	public OrganisationsInfo() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	@Override
	public String toString() {
		return "OrganisationsInfo [organisationId=" + organisationId + ", organisationName=" + organisationName
				+ ", pan=" + pan + ", organisationMail=" + organisationMail + ", password=" + password
				+ ", organisationPhone=" + organisationPhone + ", location=" + location + ", status=" + status + "]";
	}
	
	
	
	
}
