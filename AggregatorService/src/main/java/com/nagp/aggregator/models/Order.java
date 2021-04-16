package com.nagp.aggregator.models;

import java.io.Serializable;

public class Order implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long userId;

	private Long orderId;

	private double orderAmount;

	private String orderDate;

	public Order() {
		
	}
	
	public Order(Long userId, Long orderId, double orderAmount, String orderDate) {
		this.userId = userId;
		this.orderId = orderId;
		this.orderAmount = orderAmount;
		this.orderDate = orderDate;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

}
