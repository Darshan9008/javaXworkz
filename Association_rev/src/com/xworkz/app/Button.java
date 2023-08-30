package com.xworkz.app;

public class Button {
	
	private String brand;
	private Shirt shirt;
	
	public Button(String brand) {
		this.brand=brand;
	}
	public void setShirt(Shirt shirt) {
		this.shirt=shirt;
		this.shirt.style();
	}
	

}
