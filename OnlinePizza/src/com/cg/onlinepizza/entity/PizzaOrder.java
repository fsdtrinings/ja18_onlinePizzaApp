package com.cg.onlinepizza.entity;

import java.time.LocalDate;
import java.util.Map;



// saved in the database
public class PizzaOrder {

	private int bookingOrderId;
	private LocalDate dateOfOrder;
	private String transactionMode;
	private Coupan coupan;
	
	private Map<Pizza, Integer> orderItems;
	private String orderDescription;
	private String orderType;
	private Customer customer;
	private double totalCost;
	
	// -------------------------------
	
	
	
	
	
}
