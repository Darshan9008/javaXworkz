package com.presentation;

public class Laptop {
	
	String brand;
	String name;
	int cost;
	Boolean working;
	char size;
	
	public void work()
	{
		System.out.println("laptop is too working and fuction....");
	}
	
	
	
	
	public void work(String brand,String name,int cost,boolean working,char size)
	{
		System.out.println("laptop is working...");
		this.brand=brand;
		this.cost=cost;
		this.name=name;
		this.size=size;
		this.working=working;
		
	}




	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", name=" + name + ", cost=" + cost + ", working=" + working + ", size="
				+ size + "]";
	}
	
	

}
