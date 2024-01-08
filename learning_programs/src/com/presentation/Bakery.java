package com.presentation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Bakery {
	
	public static void main(String[] args) {

	Collection<Integer> ref=new ArrayList<Integer>();
	ref.add(1);
	ref.add(2);
	ref.add(3);
	ref.add(4);
	ref.add(3);
	ref.add(2);
	
	System.out.println(ref);
	
	Collection<Integer> ref1=new HashSet<Integer>(ref);
	
	Collection<Integer> ref2=new ArrayList<Integer>(ref1);
	
	System.out.println("after removing");
	System.out.println(ref2);


			
	
	
	}
	

}
