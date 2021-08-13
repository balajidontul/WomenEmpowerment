package com.team6.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

@Entity
@Table(name = "personal_detail")
public class PersonalDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "enroll_generator")
	@SequenceGenerator(name="enroll_generator", sequenceName = "enroll_seq", allocationSize=1)
	private int regId;
	private String maritalStatus;
	private String aadharNo;
	private String pan;
	private int phone;

	public PersonalDetail() {
		super();

	}

	public PersonalDetail(int regId, String maritalStatus, String aadharNo, String pan, int phone) {
		super();
		this.regId = regId;
		this.maritalStatus = maritalStatus;
		this.aadharNo = aadharNo;
		this.pan = pan;
		this.phone = phone;
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

	@Override
	public String toString() {
		return "PersonalDetail [regId=" + regId + ", maritalStatus=" + maritalStatus + ", aadharNo=" + aadharNo
				+ ", pan=" + pan + ", phone=" + phone + "]";
	}

}
