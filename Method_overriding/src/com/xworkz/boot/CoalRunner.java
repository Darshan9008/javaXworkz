package com.xworkz.boot;
import com.xworkz.app.*;

public class CoalRunner {

	public static void main(String[] args) {
		System.out.println("invoking runner in main method");
		
		Coal coal=new Coal();
		coal.burn();
		
		Coal ash =new Ash();
		ash.burn();
		
		System.out.println("##########################");
		
		
		Amoeba amoeba=new Amoeba();
		amoeba.move();
		
		Amoeba amoeba1=new SmallAmoeba();
		amoeba1.move();
		
		System.out.println("##########################");
		
		Bangle bangle=new Bangle();
		bangle.shine();
		
	    Bangle bangle2=new Pearls();
	    bangle2.shine();
        
		System.out.println("##########################");

		Gate gate=new Gate();
		gate.security();
		
		Gate gate2=new Door();
		gate2.security();
		
		System.out.println("##########################");
		Drum drum=new Drum();
		drum.facility();
		
		Drum drum1=new Bucket();
		drum1.facility();
		
		System.out.println("##########################");

		Theater theater=new Theater();
		theater.watch();
		
		Theater theater1=new Seats();
		theater1.watch();
		
		System.out.println("##########################");

		Dinosaur dinosaur=new Dinosaur();
		dinosaur.run();
		
		Dinosaur dinosaur1=new Crocodile();
		dinosaur1.run();
		

		
		
	}
	
}
