package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Array1 {

	public static void main(String[] args) {

		Collection<String> tools=new ArrayList<String>();
		
		
		tools.add("plier");
		tools.add("spanner");
		tools.add("hammer");
		tools.add("saw");
		tools.add("screw driver");
		tools.add("jack");
		tools.add("cutter");
		
		Collection<String> tools1=new ArrayList<String>();
		tools1.add("flash light");
		tools1.add("wrench");
		
		
		System.out.println(tools.containsAll(tools1));
		
		
		Collection<String> tools2=new ArrayList<String>();
		tools2.add("spanner");
		tools2.add("screw");
		
		
		
		
	  Boolean value= tools.removeAll(tools2);
	  System.out.println(value);
		System.out.println(tools2.size());
		

	   
	   System.out.println(tools);
	   
	  
	   
		
		





		
		
		
	}

}
