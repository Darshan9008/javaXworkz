package com.xworkz.app;


public class StringRunner {

	public static void main(String[] args)
	{
		String string =new String("virat");
		char one=string.charAt(2);
		System.out.println(one);
		
		String[] two=string.split("vi");
		System.out.println(two);
		
		
		String[] three=string.split("v", 2);
		System.out.println(three);
		
		
		String four=string.concat("kohli");
		System.out.println(four);
		
		int five=string.compareTo("v");
		System.out.println(five);
		
		String six=string.substring(3);
		System.out.println(six);
		
		boolean seven=string.isEmpty();
		System.out.println(seven);
		
		int eight=string.length();
		System.out.println(eight);
		
		boolean nine=string.startsWith("kohli");
		System.out.println(nine);
		
		boolean ten=string.endsWith("virat");
		System.out.println(ten);
		
		boolean eleven=string.equalsIgnoreCase("kohli");
		System.out.println(eleven);
		
		boolean twelve=string.equals("virat");
		System.out.println(twelve);
		
		String thirteen=string.toUpperCase();
		System.out.println(thirteen);
		
		String fourteen=string.toLowerCase();
		System.out.println(fourteen);
		
		boolean fifteen=string.isBlank();
		System.out.println(fifteen);
		
		int sixteen=string.indexOf(2);
		System.out.println(sixteen);
		
		String seventeen=string.trim();
		System.out.println(seventeen);
		
		
		
		
		
		
		
		
		
		
		
		
	    
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
