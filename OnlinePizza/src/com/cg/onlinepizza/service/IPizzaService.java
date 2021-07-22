package com.cg.onlinepizza.service;

import java.util.List;

import com.cg.onlinepizza.entity.Pizza;
import com.cg.onlinepizza.exception.InvalidMinCostException;
import com.cg.onlinepizza.exception.PizzaIdNotFoundException;



public interface IPizzaService {
	
	Pizza addPizza(Pizza pizza);

	Pizza updatePizza(Pizza pizza);

	Pizza deletePizza(int pizzaId) throws PizzaIdNotFoundException;

	Pizza viewPizza(int pizzaId) throws PizzaIdNotFoundException;

	List<Pizza> viewPizzaList();

	List<Pizza> viewPizzaList(double minCost, double maxCost)throws InvalidMinCostException;
	
	List<Pizza> viewPizzaList(String type); // veg or non-veg
	
	
	
	


}
