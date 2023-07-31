package com.xworkz.app;

public class Hotel {
	Cook cook=new Cook();
	public void hotelName()
	{
		System.out.println("Invoking Hotelname in Hotel");
		if(this.cook!=null)
		{
		cook.shift();
		cook.specialization();
		}
		else{
			System.err.println("Cook variable is referring to null pointer exception");
		}
	}
	
	
}
