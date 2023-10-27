package com.xworkz.classs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Cities {

	public static void main(String[] args) {

		
		

				List<String> karnatakaCities = new ArrayList<>();

				karnatakaCities.add("Bangalore");
				karnatakaCities.add("Mysore");
				karnatakaCities.add("Hubli");
				karnatakaCities.add("Mangalore");
				karnatakaCities.add("Belgaum");
				karnatakaCities.add("Gulbarga");
				karnatakaCities.add("Dharwad");
				karnatakaCities.add("Bidar");
				karnatakaCities.add("Shimoga");
				karnatakaCities.add("Hassan");
				karnatakaCities.add("Davanagere");
				karnatakaCities.add("Raichur");
				karnatakaCities.add("Bellary");
				karnatakaCities.add("Tumkur");
				karnatakaCities.add("Udupi");
				karnatakaCities.add("Bagalkot");
				karnatakaCities.add("Karwar");
				karnatakaCities.add("Gadag");
				karnatakaCities.add("Chitradurga");
				karnatakaCities.add("Hospet");

				System.out.println("Cities in Karnataka:");
				Iterator<String> iterator = karnatakaCities.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
			}
		}
	}

}
