package com.xworkz.app;

public class PowerBank {
	Battery battery=new Battery();
	
	public void brand()
	{
		System.out.println("Invoking brand in PowerBank");
		if(this.battery!=null)
		{
		this.battery.inputCapacity();
		this.battery.outputCapacity();
		}
		else{
			System.err.println("battery reference is pointing to null...");
		}
	}

}
