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
@Table(name = "personal_detail")
public class PersonalDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_generator")
    @SequenceGenerator(name="course_generator", sequenceName = "course_seq", allocationSize=1)
	private int regId;
	private String maritalStatus;
	private String aadharNo;
	private String pan;
	private int phone;


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	private UserRegistration userRegistration;
	
	public PersonalDetail() {
		super();

	}

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
	
	

	public UserRegistration getUserRegistration() {
		return userRegistration;
	}

	public void setUserRegistration(UserRegistration userRegistration) {
		this.userRegistration = userRegistration;
	}

	@Override
	public String toString() {
		return "PersonalDetail [regId=" + regId + ", maritalStatus=" + maritalStatus + ", aadharNo=" + aadharNo
				+ ", pan=" + pan + ", phone=" + phone +  "]";
	}

}
