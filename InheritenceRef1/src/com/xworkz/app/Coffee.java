package com.xworkz.app;

public class Coffee {

	public int price;
	public String type;
	public String location;
	public boolean isGood;
	
	public Coffee() {
		
		this(12,"cold","magadi",true);
		System.out.println("invoking the no arguement in coffee");
	}
	 
	public Coffee(int price,String type,String location,boolean isGood) {
		
	this.price=price;
	this.type=type;
	this.location=location;
	this.isGood=isGood;
	System.out.println("invoking argument constructor in coffee");
	}
	
}
