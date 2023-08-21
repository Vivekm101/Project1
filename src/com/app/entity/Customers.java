package com.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table
public class Customers implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int cid;
	@Column
	private String cfName;
	@Column
	private String clName;
	@Column
	private String cgmail;
	@OneToOne
	@JoinColumn
	private SalesMan mr;
	
	public Customers() {}

	public Customers(String cfName, String clName, String cgmail) {
		super();
		this.cfName = cfName;
		this.clName = cfName;
		this.cgmail = cgmail;
	}

	public Customers(int cid, String cfName, String clName, String cgmail, SalesMan mr) {
		super();
		this.cid = cid;
		this.cfName = cfName;
		this.clName = clName;
		this.cgmail = cgmail;
		this.mr = mr;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCfName() {
		return cfName;
	}

	public void setCfName(String cfName) {
		this.cfName = cfName;
	}

	public String getClName() {
		return clName;
	}

	public void setClName(String clName) {
		this.clName = clName;
	}

	public String getCgmail() {
		return cgmail;
	}

	public void setCgmail(String cgmail) {
		this.cgmail = cgmail;
	}

	public SalesMan getMr() {
		return mr;
	}

	public void setMr(SalesMan mr) {
		this.mr = mr;
	}

	@Override
	public String toString() {
		return "Customers [cid=" + cid + ", cfName=" + cfName + ", clName=" + clName + ", cgmail=" + cgmail + ", mr="
				+ mr + "]";
	}
	

}
