package com.test.bean;

public class AreaDetails {
	private String street;
	private String pincode;
	public AreaDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AreaDetails(String street, String pincode) {
		super();
		this.street = street;
		this.pincode = pincode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	

}
