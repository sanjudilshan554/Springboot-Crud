package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.OrderEntity;
import com.example.demo.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	OrderService OrderService;
	
	@RequestMapping(value = "/CreateOrder", method = RequestMethod.POST)
	@ResponseBody
	public String create(@ModelAttribute OrderEntity order) {
		OrderService.SaveOrder(order);
		
		return "Data Saved Successfully";
	}
	
//	Render index page 
	@RequestMapping 
	public String BasicForm() {
		return "index";
	}
}
