package com.xworkz.app;

public class Stone extends Diamond {
	
	
	public Stone() {
		System.out.println("invoking no arguement const");
	}
	
	public Stone(int price,String color,String type,boolean isOriginal) {

		super(price,color,type,isOriginal);
		
		
	}

}
