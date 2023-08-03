package com.xworkz.app;

public class Home {

	public  int price;
	
	public Home(int price) {
		this.price=price;
		System.out.println("invoking arguement constructor"+this.price);
	}
	
	public  void HomePrice() {
		System.out.println("invoking home price method");
	}
	
	
	
}
