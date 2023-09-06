package com.xworkz.Grocery.app.service;

import com.xworkz.Grocery.app.GroceryRepository;
import com.xworkz.Grocery.app.GroceryRepositoryImpl;

public class GroceryServiceImpl implements GroceryService {
	
	
	private GroceryRepositoryImpl groceryRepositoryImpl ;
	
	public GroceryServiceImpl(GroceryRepositoryImpl groceryRepositoryImpl) {
		this.groceryRepositoryImpl=groceryRepositoryImpl;
	    
		
	}
	
	@Override
	public void validateAndSave(String grocery) {
         
		System.out.println("invoking validate and save in grocery impl"+this.getClass().getSimpleName());
		
		if(grocery!=null && !grocery.isEmpty() && grocery.length()>3 && grocery.length()<20) {
			System.out.println(grocery);
			System.out.println("grocery name is valid");
			this.groceryRepositoryImpl.save(grocery);
		}
		else
		{
			System.out.println(grocery);
			System.out.println("grocery is invalid");
		}
		
		
	}

}
