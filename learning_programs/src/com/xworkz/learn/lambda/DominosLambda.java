package com.xworkz.learn.lambda;

public class DominosLambda {

	public static void main(String[] args) {

		
		Dominos dominos=()->{
			return "Darshan";
			
		};
		System.out.println("name: "+dominos.walk());
		
		
		
	}

}
