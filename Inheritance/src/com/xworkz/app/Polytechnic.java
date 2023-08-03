package com.xworkz.app;

public class Polytechnic extends Diploma {
	public String sirName;
	
	public Polytechnic(String collegeName,int branch,int subjects,String sirName) {
		super(collegeName,branch,subjects);
		this.sirName=sirName;		
	}
	public void subjects() {
		System.out.println("invoking the subject method");
	}

}
