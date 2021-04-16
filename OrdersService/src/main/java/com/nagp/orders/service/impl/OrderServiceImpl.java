package com.nagp.orders.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.nagp.orders.models.Order;
import com.nagp.orders.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Override
	public List<Order> getOrder(Long userId) {
		List<Order> orders = OrdersUpload.orders;
		return orders.stream().filter(order -> order.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
