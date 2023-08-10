package com.xworkz.boot;

import com.xworkz.app.Bakery;
import com.xworkz.app.SmallBakery;
import com.xworkz.app.*;
public class OverloadRunner {

	public static void main(String[] args) {
		System.out.println("invoking main runner in class");

		Bakery bakery = new Bakery();
		bakery.taste();
		bakery.taste("rasgulla");
		bakery.taste(12);
		bakery.taste("bengaluru",2);
		bakery.taste(true,2);
		bakery.taste(4.5f);
		
		Bakery bakery1=new SmallBakery();
		bakery1.taste();
		bakery1.taste("jamun");
		bakery1.taste(122);
		bakery1.taste("mysore",3);
		bakery1.taste(false,4);
		bakery1.taste(3.5f);
		
		System.out.println("#################################");
		
		Hotel hotel=new Hotel();
		hotel.items();
		hotel.items(12);
		hotel.items("sachin");
		hotel.items(3.5f);
		hotel.items(false);
		hotel.items("dosa",22);
		
		Hotel hotel1=new Canteen();
		hotel1.items();
		hotel1.items(12);
		hotel1.items("sachin");
		hotel1.items(3.5f);
		hotel1.items(false);
		hotel1.items("dosa",22);
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
	    Temple temple=new Temple();
	    temple.darshana();
	    temple.darshana(23.2f);
	    temple.darshana(21);
	    temple.darshana("bhadravathi");
	    temple.darshana("tirupathi",1200);
	    temple.darshana("temple","puliyogare");
	    
	    
	    Temple temple1=new Gudi();
	    temple1.darshana();
	    temple1.darshana(23.2f);
	    temple1.darshana(21);
	    temple1.darshana("bhadravathi");
	    temple1.darshana("tirupathi",1200);
	    temple1.darshana("temple","puliyogare");
	    
	    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");





		
		
		
		


		
		
		





	}

}
