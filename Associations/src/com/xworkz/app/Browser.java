package com.xworkz.app;

public class Browser {
	
	Internet internet=new Internet();
	public void name()
	{
		
		System.out.println("Invoking name in Browser");
		if(internet!=null)
		{
			internet.type();
			internet.speed();
		}
		else{
			System.err.println("Null pointer exception where internet is pointing to a null reference ");
		}
		
		
	}

}
