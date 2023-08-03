package com.xworkz.app;

public class Chair extends Table {
	
	public String madeOf;
	
	public Chair(String madeOf) {
		super(price);
		this.madeOf=madeOf;
		
	}
	
	
	
	public void Sit()
	{
		
		System.out.println("invoking the no arguement method in Sit");
		
	}
}
