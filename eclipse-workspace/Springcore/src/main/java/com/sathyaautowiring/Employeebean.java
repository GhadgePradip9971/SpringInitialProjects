package com.sathyaautowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employeebean {
	private int empid;
	private String empname;

	@Qualifier("id2")
	@Autowired

	private Addressbean addr;

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

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Addressbean getAddr() {
		return addr;
	}

	public void setAddr(Addressbean addr) {
		this.addr = addr;
	}

	public void printEmployee() {
		System.out.println("empid:" + empid);
		System.out.println("empname:" + empname);
		System.out.println("addr:" + addr);

	}

}
