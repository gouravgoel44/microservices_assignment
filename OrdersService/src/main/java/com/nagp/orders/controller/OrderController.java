package com.nagp.orders.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nagp.orders.models.Order;
import com.nagp.orders.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping("/orders/{userId}")
	public List<Order> getOrderDetail(@PathVariable("userId") Long userId) {
		return orderService.getOrder(userId);
	}

}
