package com.xworkz.app;

public class Ground {
	public int size;
	public float area;
	public String type;
	public boolean isGood;
	
	public Ground() {
		this(12,20.9f,"kids",true);
		System.out.println("invoking no arguement const");
	}
	
	
	public Ground(int size,float area,String type,boolean isGood)
	{
		
		this.size=size;
		this.area=area;
		this.type=type;
		this.isGood=isGood;
		System.out.println("invoking arguement const");
		
	}
}
