package com.xworkz.Grocery.boot;
import com.xworkz.Grocery.app.*;
import com.xworkz.Grocery.app.service.*;


public class GroceryRunner {

	public static void main(String[] args) {
		
		GroceryRepositoryImpl groceryRepositoryImpl=new GroceryRepositoryImpl();
		
		GroceryService groceryServiceImpl=new GroceryServiceImpl(groceryRepositoryImpl);
		groceryServiceImpl.validateAndSave("Tomato");		
	}

}
