package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.OrderEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class OrderRepository {

	@PersistenceContext
	private EntityManager Manager;
	
	@Transactional 
	public void SaveOrder(OrderEntity order) {
		Manager.persist(order);
	}
}
