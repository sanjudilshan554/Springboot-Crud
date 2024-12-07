package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.OrderEntity;
import com.example.demo.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository OrderRepo;
	
	public void SaveOrder(OrderEntity order) {
		OrderRepo.SaveOrder(order);
		
	}

}
