package com.xworkz.app;

public class Shop {
	
	Salesman salesman=new Salesman();
	public void shopLocation()
	{
		System.out.println("Invoking shopLocation in Shop");
		if(this.salesman!=null)
		{
			this.salesman.experience();
			this.salesman.age();
		}
		else{
			System.err.println("Salesman is pointing to null");
		}
	}

}
