package com.nagp.orders.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.nagp.orders.models.Order;

@Component
public class OrdersUpload {

	public static List<Order> orders = new ArrayList<>();

	public static void populateOrdersData() {
		orders.add(new Order(1L, 1L, 250.0, LocalDate.now()));
		orders.add(new Order(1L, 2L, 450.0, LocalDate.now().plusDays(1L)));
		orders.add(new Order(2L, 2L, 1450.0, LocalDate.now()));
	}
}
