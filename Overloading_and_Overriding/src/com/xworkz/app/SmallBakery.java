package com.xworkz.app;

public class SmallBakery extends Bakery {
	
	@Override
	public void taste() {
		System.out.println("invoking no arg method in small bakery");
	}
	@Override
	public void taste(String sweetName) {
		System.out.println("sweet name"+sweetName);
	}
	@Override
	public void taste(int noOfSweet) {
		System.out.println("no of sweet "+noOfSweet);
	}
	@Override
	
	public void taste(String location,int name) {
		System.out.println("location:"+location);
		
	}
	@Override
	public void taste(boolean famous,int quantity) {
		System.out.println("famous:"+famous);
		System.out.println("quantity:"+quantity);
	}
	@Override
	public void taste(float rating) {
		System.out.println("Rating:"+rating);
	}
	

}
