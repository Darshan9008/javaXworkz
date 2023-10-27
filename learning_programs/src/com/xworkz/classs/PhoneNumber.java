package com.xworkz.classs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PhoneNumber {

	public static void main(String[] args) {

		Collection<Long> number=new ArrayList<Long>();
		
		number.add(9008106466l);
		number.add(8765435678l);
		number.add(76543456778l);
		number.add(8765487678l);
		number.add(8765567678l);
		number.add(4565435678l);
		number.add(9875435678l);
		number.add(8734565678l);
		number.add(9879435678l);
		number.add(876543345l);
		number.add(873435678l);
		number.add(8761235678l);
		number.add(765435678l);
		number.add(8456735678l);
		
		
		Iterator<Long> itr=number.iterator();
		 
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
