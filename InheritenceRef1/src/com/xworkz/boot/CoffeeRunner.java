package com.xworkz.boot;
import com.xworkz.app.Cafe;
import com.xworkz.app.Coffee;
public class CoffeeRunner {

	public static void main(String[] args) {
		
		System.out.println("invoking coffee runner");
		
		
		Coffee coffee=new Coffee();
		System.out.println("price"+coffee.price);
		System.out.println("type"+coffee.type);
		System.out.println("Location"+coffee.location);
		System.out.println("isGood"+coffee.isGood);
		
		
		
		System.out.println("######################");
		
		Cafe cafe=new Cafe();
		System.out.println("price"+cafe.price);
		System.out.println("type"+cafe.type);
		System.out.println("Location"+cafe.location);
		System.out.println("isGood"+cafe.isGood);
		
		
		
		
		

	}

}
