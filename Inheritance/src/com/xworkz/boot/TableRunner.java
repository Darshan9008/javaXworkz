package com.xworkz.boot;

import com.xworkz.app.Chair;
import com.xworkz.app.Home;
import com.xworkz.app.Table;


public class TableRunner {

	public static void main(String[] args) {
		
		System.out.println("invoking the table runner class");
		
		Chair chair=new Chair("wood");
		Table chair1=new Chair("teek");
	    chair.Sit();
	    chair1.noOfLegs();
	    
	    Table table1=new Chair("darshan");
	    
	    
	    
	    Home h1=new Home(15);
	    
	    h1.HomePrice();
	    
	    
	    
		
		
		

	}

}
