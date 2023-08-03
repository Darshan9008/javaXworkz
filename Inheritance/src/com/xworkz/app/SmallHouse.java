package com.xworkz.app;

public class SmallHouse extends Home {
	
	public int homePrice;
	public String homeType;
	
	public SmallHouse(int price,int homePrice,String homeType) {
		super(price);
		this.homePrice=homePrice;
		this.homeType=homeType;
		
	}
	 public void TreeHouse() {
		 
		 System.out.println("invoking the tree house method");
	 }
	
	
	
	
	
	
	

}
