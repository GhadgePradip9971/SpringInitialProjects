package com.nt.beans;

public class Robot {
	private int id;
	private String name;
	private String lab;
	private double price;
	public void setId(int id) {
		System.out.println("Robot.setId()");
		this.id = id;
	}
	public void setName(String name) {
		System.out.println("Robot.setName()");
		this.name = name;
	}
	public void setLab(String lab) {
		System.out.println("Robot.setLab()");

		this.lab = lab;
	}
	public void setPrice(double price) {
		System.out.println("Robot.setPrice()");

		this.price = price;
	}
	@Override
	public String toString() {
		return "Robot [id=" + id + ", name=" + name + ", lab=" + lab + ", price=" + price + "]";
	}
	

}
