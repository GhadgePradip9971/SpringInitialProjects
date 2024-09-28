package com.company;

import java.util.List;
import java.util.Map;

public class Employeebean {
	private int empid;
	private List<Integer> empprojects;
	private Map<Integer, String> empmap;

	public Employeebean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public List<Integer> getEmpprojects() {
		return empprojects;
	}

	public void setEmpprojects(List<Integer> empprojects) {
		this.empprojects = empprojects;
	}

	public Map<Integer, String> getEmpmap() {
		return empmap;
	}

	public void setEmpmap(Map<Integer, String> empmap) {
		this.empmap = empmap;
	}

	public void printempid() {
		System.out.println("Employee id" + empid);
	}
}
