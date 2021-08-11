package com.team6.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "personal_detail")
public class PersonalDetail {
	
	//@Id
	int regid;
	int userid;
	String maritalstatus;
	String aadharno;
	String panno;
	int phoneno;
	String email;
	
	public PersonalDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonalDetail(int regid, int userid, String maritalstatus, String aadharno, String panno, int phoneno,
			String email) {
		super();
		this.regid = regid;
		this.userid = userid;
		this.maritalstatus = maritalstatus;
		this.aadharno = aadharno;
		this.panno = panno;
		this.phoneno = phoneno;
		this.email = email;
	}

	public int getRegid() {
		return regid;
	}

	public void setRegid(int regid) {
		this.regid = regid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getMaritalstatus() {
		return maritalstatus;
	}

	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}

	public String getAadharno() {
		return aadharno;
	}

	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}

	public String getPanno() {
		return panno;
	}

	public void setPanno(String panno) {
		this.panno = panno;
	}

	public int getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "PersonalDetail [regid=" + regid + ", userid=" + userid + ", maritalstatus=" + maritalstatus
				+ ", aadharno=" + aadharno + ", panno=" + panno + ", phoneno=" + phoneno + ", email=" + email + "]";
	}
	
	
	
	
	
	
	

}
