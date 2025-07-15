package com.flipcart.order;

public class OrderManagement {
	private int noOfOrder;
	private double totalAmount;
	private Order order;
	public OrderManagement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderManagement(int noOfOrder, double totalAmount, Order order) {
		super();
		this.noOfOrder = noOfOrder;
		this.totalAmount = totalAmount;
		this.order = order;
	}
	public int getNoOfOrder() {
		return noOfOrder;
	}
	public void setNoOfOrder(int noOfOrder) {
		this.noOfOrder = noOfOrder;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	

}
