package com.nagp.aggregator.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nagp.aggregator.models.Order;
import com.nagp.aggregator.models.OrderDetails;
import com.nagp.aggregator.models.User;
import com.nagp.aggregator.service.AggregatorService;

@Service
public class AggregatorServiceImpl implements AggregatorService {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${order.service.url}")
	private String orderServiceUrl;

	@Value("${user.service.url}")
	private String userServiceUrl;

	@Override
	@SuppressWarnings("rawtypes")
	public OrderDetails getOrderDetails(Long userId) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity entity = new HttpEntity<>(null, headers);
		ResponseEntity<User> user = restTemplate.exchange(userServiceUrl + "/user/" + userId, HttpMethod.GET, entity,
				User.class);
		ResponseEntity<List<Order>> order = restTemplate.exchange(orderServiceUrl + "/orders/" + userId, HttpMethod.GET,
				entity, new ParameterizedTypeReference<List<Order>>() {
				});
		return new OrderDetails(user.getBody(), order.getBody());
	}

}
