package com.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class SalesMan implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String region;
	@Column
	private String email;
	
	public SalesMan() {
		
	}
	

	public SalesMan(int id) {
		super();
		this.id = id;
	}


	public SalesMan(String firstName, String lastName, String region, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.region = region;
		this.email = email;
	}

	public SalesMan(int id, String firstName, String lastName, String region, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.region = region;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "SalesMan [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", region=" + region
				+ ", email=" + email + "]";
	}
	


}
