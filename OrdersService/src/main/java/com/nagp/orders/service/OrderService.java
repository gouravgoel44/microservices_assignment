package com.nagp.orders.service;

import java.util.List;

import com.nagp.orders.models.Order;

public interface OrderService {

	List<Order> getOrder(Long userId);

}
