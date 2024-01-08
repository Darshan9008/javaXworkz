package com.xworkz.boot;

import com.xworkz.classs.Access;

public class Mini extends Access {
	
	
	public void run1(float num2) {
     System.out.println(super.num2);	}

	public static void main(String[] args) {

		Access access1 = new Access();
		System.out.println(access1.num);
		System.out.println(access1.num1);
		
		access1.run();
		access1.walk();
		access1.play(12.3f);
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
