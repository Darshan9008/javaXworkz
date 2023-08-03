package com.xworkz.app;

public class MediumHouse extends SmallHouse {
	
	public String tiles;
	public int noOfBricks;
	
	public MediumHouse(int homePrice,String homeType,int price,String tiles,int noOfBricks) {
		super(homePrice,price,homeType);
		this.tiles=tiles;
		this.noOfBricks=noOfBricks;
		
	}
	
	public void niceHouse() {
		System.out.println("invoking the nice house method");
	}

}
