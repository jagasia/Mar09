package com.mphasis.hrms.model;

import java.util.Arrays;
import java.util.Date;

public class Associate {
	private Long associateId;
	private String firstName;
	private String lastName;
	private Date dateOfJoining;
	private String gender;
	private byte[] picture;
	public Associate() {}
	public Associate(Long associateId, String firstName, String lastName, Date dateOfJoining, String gender,
			byte[] picture) {
		super();
		this.associateId = associateId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfJoining = dateOfJoining;
		this.gender = gender;
		this.picture = picture;
	}
	public Long getAssociateId() {
		return associateId;
	}
	public void setAssociateId(Long associateId) {
		this.associateId = associateId;
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
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public byte[] getPicture() {
		return picture;
	}
	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	@Override
	public String toString() {
		return "Associate [associateId=" + associateId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfJoining=" + dateOfJoining + ", gender=" + gender + ", picture=" + picture.length
				+ "]";
	}
	
}
