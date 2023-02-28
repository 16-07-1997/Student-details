package com.accessdata.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stddetails")

public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "stdid")
	Integer stdid;

	@Column(name = "name")
	private String name;

	@Column(name = "semester")
	private int semester;

	@Column(name = "gender")
	private String gender;

	public Integer getStdid() {
		return stdid;
	}

	public void setStdid(Integer stdid) {
		this.stdid = stdid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
