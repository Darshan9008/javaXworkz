package com.xworkz.app;

public class Cafe extends Coffee {

	public Cafe(){
      System.out.println("invoking the no argument const in cafe");		
		
	}
	
	public Cafe(int price,String type,String location,boolean isGood) {
		
		super(price,type,location,isGood);
		
	}
	
	
}
