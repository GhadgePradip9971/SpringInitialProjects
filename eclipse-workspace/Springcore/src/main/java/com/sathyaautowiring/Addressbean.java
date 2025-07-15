package com.sathyaautowiring;

public class Addressbean {
	private int hno;
	private String city;
	private String state;

	// Default constructor
	public Addressbean() {
		// No need to call super() explicitly for default constructor
	}

	// Getter and Setter methods
	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	// Overriding toString method for better representation
	@Override
	public String toString() {
		return "AddressBean [hno=" + hno + ", city=" + city + ", state=" + state + "]";
	}
}
