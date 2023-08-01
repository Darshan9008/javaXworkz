package com.xworkz.app;

public class Ingredients {

	public String name;
	public int quantity;
	public double cost;
	
	public Ingredients(String name,int quantity,double cost)
	{
		System.out.println("Invoking no-arg const in Ingredients");
		this.name=name;
		this.quantity=quantity;
		this.cost=cost;
		
	}
	public void printInfo()
	{
		System.out.println("Invoking printInfo() in Ingredients");
		System.out.println("Name of the ingredients : "+this.name);
		System.out.println("Quantity of the Ingredients : "+this.quantity);
		System.out.println("Cost of the Ingredient :"+this.cost);
		
		System.out.println("--------------------------------------------------------------------------------------");
	}
	
}
