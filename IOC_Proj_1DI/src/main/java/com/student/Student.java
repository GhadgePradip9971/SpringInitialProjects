package com.student;

import java.util.Set;

public class Student {
	private String name;
	private String City;
	private String schoolName;
	private int id;
	private Set<String> studentdata;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Set<String> getStudentdata() {
		return studentdata;
	}
	public void setStudentdata(Set<String> studentdata) {
		this.studentdata = studentdata;
	}
	

}
