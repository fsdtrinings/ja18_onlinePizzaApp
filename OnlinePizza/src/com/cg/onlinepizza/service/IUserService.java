package com.cg.onlinepizza.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.onlinepizza.entity.Customer;
import com.cg.onlinepizza.entity.Pizza;
import com.cg.onlinepizza.exception.CustomerIdNotFoundException;

public interface IUserService {

	
	//  --- from customer -----------
	Customer addCustomer(Customer customer);  // create profile() 

	Customer updateCustomer(Customer customer);

	Customer deleteCustomer(int customerId) throws CustomerIdNotFoundException;

	List<Customer> viewCustomers();

	Customer viewCustomer(int customerId) throws CustomerIdNotFoundException;
	
	public List<Pizza> getAllOrdersTillDate(String username) ;// admin and customer
	
	
	// --------- from admin
	public List<Pizza> getAllOrders(String input); // input -> city , pizzaName
	public List<Pizza> getAllOrders(LocalDate date1,LocalDate date2);

	public boolean validateUser(String username,String password);
	// login()
	
	public boolean isSessionActive();
	public boolean logoff();

}
