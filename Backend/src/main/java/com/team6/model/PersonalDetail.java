package com.team6.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "personal_detail")
public class PersonalDetail {

	@Id
	private int regId;
	private String maritalStatus;
	private String aadharNo;
	private String pan;
	private int phone;
	private String email;
	public int getRegId() {
		return regId;
	}
	public void setRegId(int regId) {
		this.regId = regId;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public PersonalDetail(int regId, String maritalStatus, String aadharNo, String pan, int phone, String email) {
		super();
		this.regId = regId;
		this.maritalStatus = maritalStatus;
		this.aadharNo = aadharNo;
		this.pan = pan;
		this.phone = phone;
		this.email = email;
	}
	public PersonalDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	
	
	
}
