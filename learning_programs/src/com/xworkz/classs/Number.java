package com.xworkz.classs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Number {

	public static void main(String[] args) {


		Collection<Integer> ref=new ArrayList<Integer>();
		ref.add(1);
		ref.add(2);
		ref.add(3);
		ref.add(4);
		ref.add(3);
		ref.add(5);
		ref.add(6);
		
		Collection<Integer> ref1=new HashSet<Integer>(ref);
		
        int count=0;
        for(Object e:ref) {
        	if(e.
        }
		
		
		Collection<Integer> ref2=new ArrayList<Integer>(ref1);
		System.out.println(ref2);
		
		
		
		
		
	}

}
