package com.flipcart.order;

import com.flipcart.product.Product;

public class Order {
	private String orderId;
	private double orderValue;
	private  Product product;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(String orderId, double orderValue, Product product) {
		super();
		this.orderId = orderId;
		this.orderValue = orderValue;
		this.product = product;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public double getOrderValue() {
		return orderValue;
	}
	public void setOrderValue(double orderValue) {
		this.orderValue = orderValue;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}


}
