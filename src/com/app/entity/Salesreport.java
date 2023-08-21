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
public class Salesreport implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int pid;
	@Column
	private String productName;
	@Column
	private int quantity;
	@OneToOne
	@JoinColumn
	private SalesMan mr;
	
	public Salesreport() {}

	public Salesreport(String productName, int quantity) {
		super();
		this.productName = productName;
		this.quantity = quantity;
	}

	public Salesreport(int pid, String productName, int quantity, SalesMan mr) {
		super();
		this.pid = pid;
		this.productName = productName;
		this.quantity = quantity;
		this.mr = mr;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public SalesMan getMr() {
		return mr;
	}

	public void setMr(SalesMan mr) {
		this.mr = mr;
	}

	@Override
	public String toString() {
		return "Salesreport [pid=" + pid + ", productName=" + productName + ", quantity=" + quantity + ", mr=" + mr
				+ "]";
	}
	

}
