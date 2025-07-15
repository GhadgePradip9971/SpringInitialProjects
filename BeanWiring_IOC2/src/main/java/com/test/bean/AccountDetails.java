package com.test.bean;

import java.util.Set;

public class AccountDetails {
	private String name;
	private double balance;
	private Set<String> mobiles;
	private Address customerAddress;
	public AccountDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountDetails(String name, double balance, Set<String> mobiles, Address customerAddress) {
		super();
		this.name = name;
		this.balance = balance;
		this.mobiles = mobiles;
		this.customerAddress = customerAddress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Set<String> getMobiles() {
		return mobiles;
	}
	public void setMobiles(Set<String> mobiles) {
		this.mobiles = mobiles;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	

}
