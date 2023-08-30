package com.xworkz.app;

public class Zip {
	
	private String brand;
	private Pant pant;
	
	public Zip(String brand) {
		this.brand=brand;
		
	}
	
	public void setPant(Pant pant) {
		this.pant=pant;
		this.pant.comfort();
	}

}
