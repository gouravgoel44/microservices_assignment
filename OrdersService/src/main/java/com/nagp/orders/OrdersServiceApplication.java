package com.nagp.orders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nagp.orders.service.impl.OrdersUpload;

@SpringBootApplication
public class OrdersServiceApplication {

	public static void main(String[] args) {
		OrdersUpload.populateOrdersData();
		SpringApplication.run(OrdersServiceApplication.class, args);
	}

}
