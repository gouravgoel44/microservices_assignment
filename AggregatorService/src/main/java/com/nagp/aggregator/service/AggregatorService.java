package com.nagp.aggregator.service;

import com.nagp.aggregator.models.OrderDetails;

public interface AggregatorService {

	OrderDetails getOrderDetails(Long userId);

}
