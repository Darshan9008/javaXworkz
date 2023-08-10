package com.xworkz.app;

public class Tent extends Theater {
	
	@Override
	public void area() {
		System.out.println("invoking no arg method area in city");
	}
	@Override

	public void area(int length) {
		System.out.println("length:"+length);
		
	}
	@Override

	public void area(float perimeter) {
		System.out.println("perimeter:"+perimeter);
	}
	@Override

	public void area(int population,int male) {
		
		System.out.println("population:"+population);
		System.out.println("male:"+male);
		
	}
	
	@Override

	public void area(boolean isItGood) {
		System.out.println("is it a good city"+isItGood);
	}
	@Override

	public void area(String cityName) {
		System.out.println("city name:"+cityName);
	}


}
