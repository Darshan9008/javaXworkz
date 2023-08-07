package com.xworkz.app;

public class Diamond {
	
	public int price;
	public String color;
	public String type;
	public boolean isOriginal;
	
	public Diamond() {
		this(23,"purple","square",true);
		System.out.println("invoking no arguemnet const");
	}
	
	public Diamond(int price,String color,String type,boolean isOriginal) {
		
		this.price=price;
		this.color=color;
		this.type=type;
		this.isOriginal=isOriginal;
		System.out.println("invoking arguement const in diamond");
	}

}
