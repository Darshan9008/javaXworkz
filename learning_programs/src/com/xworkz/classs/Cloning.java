package com.xworkz.classs;

import java.util.Collections;

public class Cloning implements Cloneable {
	
	int id;
	String name;
	
	public Cloning(int id,String name) {
		this.id=id;
		this.name=name;
		
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {
		
		try {
			Cloning c1=new Cloning(1, "pal");

			Cloning c2=(Cloning)c1.clone();
			System.out.println(c2.name);
			System.out.println(c1.name +""+c1.id);
			System.out.println(c2.name+""+c2.id);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
