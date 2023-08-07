package com.xworkz.boot;
import com.xworkz.app.*;
import com.xworkz.app.Thread;

public class RopeRunner {

	public static void main(String[] args) {
		
		
		System.out.println("invoking main method");
		Rope rope=new Rope();
	    
		
		System.out.println("length"+rope.length);
		System.out.println("area"+rope.thickness);
		System.out.println("type"+rope.type);
		System.out.println("used for"+rope.usedFor);
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
              Thread thread=new Thread();
	    
		
		System.out.println("length"+thread.length);
		System.out.println("area"+thread.thickness);
		System.out.println("type"+thread.type);
		System.out.println("used for"+thread.usedFor);
	}

}
