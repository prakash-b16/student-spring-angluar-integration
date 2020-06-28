package com.prk.main.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class StudentModel implements Serializable {
	private static final long serialVersionUID = -5156575756974335698L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stuid;
	@Column(name = "stu_name")
	private String name;
	@Column(name = "stu_address")
	private String address;
	@Column(name = "stu_mobileno")
	private long mobileno;
	
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

}
