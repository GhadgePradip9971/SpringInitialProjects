package com.product;

public class ProductDetails {
	private String productName;
	private int price;
	private String productId;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
public void  printproductDetails() {
	System.out.println("product details");
	}
public void  calculateProductPrice() {
	System.out.println("calculate product detailas ");
}
}
