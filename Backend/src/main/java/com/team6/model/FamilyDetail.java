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
@Table(name = "family_detail")
public class FamilyDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "family_generator")
	@SequenceGenerator(name="family_generator", sequenceName = "family_seq", allocationSize=1)
	private int registrationId;
	private String firstName;
	private String lastName;
	private String relationship;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="regId")
	private PersonalDetail personaldetail;

	public FamilyDetail() {
		super();

	}

	public FamilyDetail(int registrationId, String firstName, String lastName, String relationship) {
		super();
		this.registrationId = registrationId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.relationship = relationship;
	}

	public int getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
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

	public PersonalDetail getPersonaldetail() {
		return personaldetail;
	}

	public void setPersonaldetail(PersonalDetail personaldetail) {
		this.personaldetail = personaldetail;
	}
	
	
	
}
