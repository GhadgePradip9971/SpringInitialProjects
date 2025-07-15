package com.test.bean;

public class Address {
	private int flatNo;
	private String houseName;
	private long mobile;
	private AreaDetails area;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int flatNo, String houseName, long mobile, AreaDetails area) {
		super();
		this.flatNo = flatNo;
		this.houseName = houseName;
		this.mobile = mobile;
		this.area = area;
	}
	public int getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public AreaDetails getArea() {
		return area;
	}
	public void setArea(AreaDetails area) {
		this.area = area;
	}
	
	
	

}
