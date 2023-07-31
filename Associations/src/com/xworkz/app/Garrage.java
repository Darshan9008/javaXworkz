package com.xworkz.app;

public class Garrage {

	
	Mechanic mechanic=new Mechanic();
	public void wash()
	{
		System.out.println("Invoking wash in Garrage");
		if(this.mechanic!=null)
		{
			this.mechanic.exp();
			this.mechanic.qualification();
		}
		else{
			System.err.println("Mechnic is pointer to a null");
		}
	}

}
