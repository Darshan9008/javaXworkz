package com.xworkz.app;

public class Bakery {
	
	public void taste() {
		System.out.println("invoking no arg method in bakery");
	}
	
	public void taste(String sweetName) {
		System.out.println("sweet name"+sweetName);
	}
	
	public void taste(int noOfSweet) {
		System.out.println("no of sweet "+noOfSweet);
	}
	
	public void taste(String location,int name) {
		System.out.println("location:"+location);
		
	}
	public void taste(boolean famous,int quantity) {
		System.out.println("famous:"+famous);
		System.out.println("quantity:"+quantity);
	}
	public void taste(float rating) {
		System.out.println("Rating:"+rating);
	}
	

}
