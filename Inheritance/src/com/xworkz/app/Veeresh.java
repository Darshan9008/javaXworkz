package com.xworkz.app;

public class Veeresh extends Vinay{
	public boolean isMarried;
	
	public Veeresh(String color,float height,float weight,String workType,boolean isMarried) {
		super(color,height, weight,workType);
		this.isMarried=isMarried;
	}
	
	public void Age()
	{
		System.out.println("invoking the age method");
	}
}
