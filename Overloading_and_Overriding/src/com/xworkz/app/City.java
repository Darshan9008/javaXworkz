package com.xworkz.app;

public class City {
	
	
	public void area() {
		System.out.println("invoking no arg method area in city");
	}
	
	public void area(int length) {
		System.out.println("length:"+length);
		
	}
	
	public void area(float perimeter) {
		System.out.println("perimeter:"+perimeter);
	}
	
	public void area(int population,int male) {
		
		System.out.println("population:"+population);
		System.out.println("male:"+male);
		
	}
	
	public void area(boolean isItGood) {
		System.out.println("is it a good city"+isItGood);
	}
	
	public void area(String cityName) {
		System.out.println("city name:"+cityName);
	}

}
