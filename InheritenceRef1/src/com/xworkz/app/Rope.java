package com.xworkz.app;

public class Rope {
	
	public int length;
	public int thickness;
	public String type;
	public String usedFor;
	
	public Rope() {
		this(23,44,"strong","climbing");
		System.out.println("invoking no arguemnet const");
		
	}

	
	public Rope(int length,int thickness,String type,String usedFor) {
		
		this.length=length;
		this.thickness=thickness;
		this.type=type;
		this.usedFor=usedFor;
		System.out.println("invoking arguement const");
	}
}
