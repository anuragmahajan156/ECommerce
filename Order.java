package com.ecommerce;

public class Order {
	private String orderNumber;
	private String orderStatus;
	private String orderDate;
	private double orderAmount;
	private String orderBill;
	
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getOrderBill() {
		return orderBill;
	}
	public void setOrderBill(String orderBill) {
		this.orderBill = orderBill;
	}
}
