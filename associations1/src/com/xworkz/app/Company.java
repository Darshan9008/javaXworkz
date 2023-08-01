package com.xworkz.app;

public class Company {

	public String name;
	public String ceo;
	public String originCountry;
	
	public Company(String name,String ceo,String originCountry)
	{
		this.name=name;
		this.ceo=ceo;
		this.originCountry=originCountry;
	}
	
	public void printInfo()
	{
		System.out.println("Invoking printInfo in Company");
		System.out.println("Name of the Company : "+this.name);
		System.out.println("Ceo of the company : "+this.ceo);
		System.out.println("Origin of the company :"+this.originCountry);
	}
}
