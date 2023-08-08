package com.xworkz.boot;
import com.xworkz.app.*;


public class MethodRunner {

	public static void main(String[] args) {
		
		
		IronBox box=new IronBox();
		box.iron();
		System.out.println("\n");
		box.iron("Usha",1450);

		

		Hotel star=new Hotel();
		star.fivestar();
		System.out.println("\n");
		star.fivestar("Mayura",true);
		
		
		
		
		Stapler store=new Stapler();
		store.pin();
		System.out.println("\n");
		store.pin("Hyderon",759);
		
		
		
		Umbrella drop=new Umbrella();
		drop.rain();
		System.out.println("\n");
		drop.rain("Black",250);

		
		
		Gadget product=new Gadget();
		product.item();
		System.out.println("\n");
		product.item("Fridge",10000);
		
		
		
		Piler kit=new Piler();
		kit.tool();
		System.out.println("\n");
		kit.tool("Knipex",'M');
		
		
		
		Mouse key=new Mouse();
		key.point();
		System.out.println("\n");
		key.point("Hp",1150);
		
		Elevator run=new Elevator();
		run.lift();
		System.out.println("\n");
		run.lift("Kaleai",542);
		
		
		
		
	}

}
