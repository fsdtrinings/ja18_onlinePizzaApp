package com.cg.onlinepizza.service;

import java.util.List;

import com.cg.onlinepizza.entity.PizzaOrder;
import com.cg.onlinepizza.exception.InvalidSizeException;
import com.cg.onlinepizza.exception.OrderIdNotFoundException;



public interface IPizzaOrderService {
	
	PizzaOrder bookPizzaOrder(PizzaOrder order);

	PizzaOrder updatePizzaOrder(PizzaOrder order);

	PizzaOrder cancelPizzaOrder(int orderId) throws OrderIdNotFoundException;

	PizzaOrder viewPizzaOrder(int orderId) throws OrderIdNotFoundException;

	
	
	// replace with 
	List<PizzaOrder> getPizzaOrder(String size, int quantity) throws InvalidSizeException;
}


