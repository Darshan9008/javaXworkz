package com.xworkz.app;

public class Gudi extends Temple{

	public void darshana() {
		System.out.println("invoking no arg method in gudi");
	}

	public void darshana(String location) {
		System.out.println("location:"+location);
		
	}
	
	public void darshana(int door) {
		System.out.println("no of doors:"+door);
	}
	
	public void darshana(String godName,int steps) {
		System.out.println("god name"+godName);
		System.out.println("steps:"+steps);
		
	}
	
	public void darshana(String name,String prasada) {
		System.out.println("name:"+name);
		System.out.println("prasada"+prasada);
	}
	
	public void darshana(float expenses)
	{
		System.out.println("expenses:"+expenses);
	}
}
