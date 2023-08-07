package com.xworkz.boot;
import com.xworkz.app.*;

public class DiamondRunner {
	
	public static void main(String[] args) {
		
		Diamond diamond = new Diamond();
		System.out.println("price"+diamond.price);
		System.out.println("color"+diamond.color);
		System.out.println("type"+diamond.type);
		System.out.println("is original"+diamond.isOriginal);
		
		
		System.out.println("!!!!!!!!!!!!!!!!!!!");
		
		Stone stone=new Stone();
		System.out.println("price"+stone.price);
		System.out.println("color"+stone.color);
		System.out.println("type"+stone.type);
		System.out.println("is original"+stone.isOriginal);
		
	}

}
