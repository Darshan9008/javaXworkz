package com.xworkz.app.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Actor {

	public static void main(String[] args) {


		Collection<String> actor=new ArrayList<String>();
		
		actor.add("darshan");
		actor.add("yash");
		actor.add("sudeep");
		actor.add("druva");
		actor.add("naveen");
		actor.add("prem");
		actor.add("saiKumar");
		actor.add("sadhu");
		actor.add("jaggesh");
		actor.add("chiru");
		actor.add("ravichandran");
		
		
		Collection<String> actor1=new ArrayList<String>();
		
           actor1.add("yash");
           actor1.add("darshan");
           actor1.add("ambrish");
           
           boolean ref=actor.containsAll(actor1);
           System.out.println(ref);
           
         
           actor1.removeAll(actor);
           System.out.println(actor1);
           
           
           actor.remove("yash");
           System.out.println(actor);
           
           
           boolean ref1=actor.contains("yash");
           System.out.println(ref1);
           
           
           boolean ref2=actor.contains("sudeep");
           System.out.println(ref2);
           
           
           System.err.println("using for loop");
           
           
           for(String ref3:actor) {
        	   
        	   System.out.println(ref3);
        	   
           }
           
           
           System.err.println("Using iterator");
           
           
           Iterator itr=actor.iterator();
           
           while(itr.hasNext()) {
        	   System.out.println(itr.next());
           }
	}

}
