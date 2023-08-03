package com.xworkz.app;

public class Diploma extends Engineering {

	public int subjects;
	
	public Diploma(String collegeName,int branch,int subjects) {
		super(collegeName,branch);
		this.subjects=subjects;
	}
	
	public void EngineeringDays()
	{
		
		System.out.println("invoking the engineering days method");
	}
}
