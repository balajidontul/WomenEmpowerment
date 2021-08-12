package com.team6.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import ch.qos.logback.classic.joran.action.ContextNameAction;

@Entity
@Table(name = "user_registration")
public class UserRegistration {

	@Id
	private int userId;
	private  String firstName ;
	private String lastName;
	private String userName;
	private String dob;
	private String password;
	private String contactNo;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public UserRegistration(int userId, String firstName, String lastName, String userName, String dob, String password,
			String contactNo) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.dob = dob;
		this.password = password;
		this.contactNo = contactNo;
	}
	public UserRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserRegistration [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", userName=" + userName + ", dob=" + dob + ", password=" + password + ", contactNo=" + contactNo
				+ "]";
	}
	
	
	
}
