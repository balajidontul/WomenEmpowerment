package com.team6.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FamilyDetails")
public class FamilyDetail {
	
	@Id
	int regid;
	String firstname;
	String lastname;
	String relationship;
	public FamilyDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FamilyDetail(int regid, String firstname, String lastname, String relationship) {
		super();
		this.regid = regid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.relationship = relationship;
	}
	public int getRegid() {
		return regid;
	}
	public void setRegid(int regid) {
		this.regid = regid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	@Override
	public String toString() {
		return "FamilyDetail [regid=" + regid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", relationship=" + relationship + "]";
	}
	
	

}
