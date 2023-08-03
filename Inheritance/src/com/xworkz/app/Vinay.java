package com.xworkz.app;

public class Vinay extends Venu {

	public String workType;
	
	public Vinay(String color,float height,float weight,String workType) {
		super(color,height, weight);
		this.workType=workType;
	}
	public void Topper() {
		System.out.println("invoking the topper method");
	}
	
}
