package com.xworkz.collection;

import java.security.Identity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;
import learning_programs.AlphabetCounting;

public class Array {

	public static void main(String[] args) {

		Collection<String> collection = new ArrayList<String>();
		collection.add("tunga");
		collection.add("bhadra");
		collection.add("yamuna");
		collection.add("sindhu");
		collection.add("kaveri");

		Collection<String> collection1 = new ArrayList<String>();
		collection1.add("godhavari");
		collection1.add("krishna");
		
		collection.stream().filter(i->i.length()>5).map(i->i).forEach(i->System.out.println(i));
		

		System.out.println("total elements :" + collection.size());

		Iterator<String> itr = collection.iterator();

		while (itr.hasNext()) {
			System.out.println("elements :" + itr.next()); // addAll() remove,contains,isempty,clear
															// removeall,containsAll
		}

		for (String e : collection) {
			System.out.println(e);
		}

		System.out.println("----------------remove");
		collection.remove("kaveri");
		Iterator<String> itr1 = collection.iterator();

		while (itr1.hasNext()) {
			System.out.println("elements :" + itr1.next()); // addAll() remove,contains,isempty,clear
															// removeall,containsAll
		}

		collection.addAll(collection1);

		Iterator<String> itr2 = collection.iterator();

		while (itr2.hasNext()) {
			System.out.println("elements :" + itr2.next()); // addAll() remove,contains,isempty,clear
															// removeall,containsAll
		}

		System.out.println(collection.contains("yamuna"));

		System.out.println(collection.isEmpty());

//collection.clear();	 
		Iterator<String> itr3 = collection.iterator();

		while (itr3.hasNext()) {
			System.out.println("elements :" + itr3.next()); // addAll() remove,contains,isempty,clear
															// removeall,containsAll
		}

		System.out.println(collection.containsAll(collection1));
		
		
		
		
		collection.removeAll(collection1);
		Iterator<String> itr4 = collection.iterator();

		while (itr4.hasNext()) {
			System.out.println("elements :" + itr4.next()); // addAll() remove,contains,isempty,clear
															// removeall,containsAll
		}
		
		
		ArrayList<Integer> arry3=new ArrayList<Integer>();
		arry3.add(55);
		arry3.add(12);
		arry3.add(76);
		arry3.add(34);
		arry3.add(90);
		arry3.add(33);
		
		Collections.sort(arry3);

		arry3.forEach(e->System.out.println(e));
		System.out.println("*****************");
	    Object[] arry4=arry3.toArray();
	    for(int i=arry4.length;i>=0;i--) {
	    	System.out.println(arry4[i]);
	    }
	    
	    String one="good morning good night";
	    Map<String, Long> two=one.toString()
	               .mapToObj(c -> (String)c)
	               .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	    System.out.println(two);
		
	}

}
