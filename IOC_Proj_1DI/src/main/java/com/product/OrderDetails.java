package com.product;

import java.util.List;

public class OrderDetails {
private long orderId;
private double orderPrice;
private List<String> items;//group of values;
//private boolean getOrderDelivered;
public long getOrderId() {
	return orderId;
}
public void setOrderId(long orderId) {
	this.orderId = orderId;
}
public double getOrderPrice() {
	return orderPrice;
}
public void setOrderPrice(double orderPrice) {
	this.orderPrice = orderPrice;
}
public List<String> getItems() {
	return items;
}
public void setItems(List<String> items) {
	this.items = items;
}
/*
 * public boolean getOrderDelivered() { return getOrderDelivered; } public void
 * setOrderDelivered(boolean isOrderDelivered) { this.getOrderDelivered =
 * isOrderDelivered; }
 */


}
