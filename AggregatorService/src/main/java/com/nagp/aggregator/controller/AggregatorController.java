package com.nagp.aggregator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nagp.aggregator.models.OrderDetails;
import com.nagp.aggregator.service.AggregatorService;

@RestController
public class AggregatorController {

	@Autowired
	private AggregatorService aggregatorService;
	
	
	@GetMapping("/orderdetails/{userId}")
	public OrderDetails getOrderDetails(@PathVariable("userId") Long userId) {
		return aggregatorService.getOrderDetails(userId);
	}
	
}
