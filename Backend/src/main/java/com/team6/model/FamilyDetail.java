package com.team6.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.SequenceGenerator;

@Entity
@Table(name = "family_detail")
public class FamilyDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "family_generator")
	@SequenceGenerator(name="family_generator", sequenceName = "family_seq", allocationSize=1)
	private int regId;
	private String firstName;
	private String lastName;
	private String relationship;

	public FamilyDetail() {
		super();

	}

	public FamilyDetail(int regId, String firstName, String lastName, String relationship) {
		super();
		this.regId = regId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.relationship = relationship;
	}

	public int getRegId() {
		return regId;
	}

	public void setRegId(int regId) {
		this.regId = regId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	@Override
	public String toString() {
		return "FamilyDetail [regId=" + regId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", relationship=" + relationship + "]";
	}

}
