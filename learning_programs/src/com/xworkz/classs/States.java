package com.xworkz.classs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class States {

	public static void main(String[] args) {
   
		
		Collection<String> state=new ArrayList<String>();
		
		
		state.add("Karnataka");
		state.add("Andrapradesh");
		state.add("Tamilnadu");
		state.add("kashmir");
		state.add("kerala");
		state.add("Odisha");
		state.add("MAdhyaPardaesh");
		state.add("Bihar");
		state.add("Gujarat");
		state.add("Uttarpradesh");
		state.add("Kolkata");
		state.add("Punjab");
		state.add("Himachal pRadesh");
		
		state.add("Chhattisgarh");
		
		state.add("Goa");
		state.add("Haryana");
		state.add("Jharkhand");
		state.add("Mizoram");
		state.add("Nagaland");
		
		state.add("Meghalaya");
		state.add("Maharastra");
		
		Iterator<String> itr=state.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		}

}
