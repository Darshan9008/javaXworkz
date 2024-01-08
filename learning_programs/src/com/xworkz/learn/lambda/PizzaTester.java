package com.xworkz.learn.lambda;

public class PizzaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*
		 * Pizza pizza=(n)->{ System.out.println("arg of lambda , pizza "+n); };
		 */
	
		runPizza((n)->{
			System.out.println("arg of lambda , pizza "+n);
			return 100;
		});
	}

	
	static  void runPizza(Pizza pizza)
	{
	 int value=	pizza.run("Chicken");
	 System.out.println(value);
	}
}
