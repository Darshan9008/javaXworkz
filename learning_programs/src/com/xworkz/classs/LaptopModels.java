package com.xworkz.classs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class LaptopModels {

	public static void main(String[] args) {

		
		Collection<String> laptop=new ArrayList<String>();
		
		laptop.add("azus");
		laptop.add("lenovo");
		laptop.add("dell");
		laptop.add("msi");
		laptop.add("leneo 1020");
		laptop.add("hp");
		laptop.add("apple");
		laptop.add("samsung");
		laptop.add("thinkpad");
		laptop.add("ideapad");
		laptop.add("hseries");
		laptop.add("macbook");
		laptop.add("slimbook");
		laptop.add("notebook");
		laptop.add("pNsonic");
		laptop.add("redmi");
		laptop.add("realme");
		laptop.add("oppo");
		laptop.add("kodak");
		laptop.add("toyota");
		laptop.add("benz");
		laptop.add("volvo");

		
Iterator<String> itr=laptop.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
