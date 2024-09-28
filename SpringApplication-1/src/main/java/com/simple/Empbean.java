package com.simple;

public class Empbean {
	private int empid;
	private String empname;
	private String desg;
	private String cmpname;
	private double salary;

	public Empbean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public String getCmpname() {
		return cmpname;
	}

	public void setCmpname(String cmpname) {
		this.cmpname = cmpname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void printemp() {
		System.out.println("my id" + empid);
		System.out.println("my name" + empname);
		System.out.println("my desg" + desg);
		System.out.println("my cmp" + cmpname);
		System.out.println("my sal" + salary);

	}
}
