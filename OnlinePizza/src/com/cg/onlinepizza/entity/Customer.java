package com.cg.onlinepizza.entity;

import java.util.Map;

public class Customer extends User{
	
	
	private String customerName;
	private String customerAddress;
	private long phoneNumber;
	private int totalOrderCost; // Total order cost till date

	private Map<Pizza,Integer> userCart;
	
	
	
	
}
