package com.xworkz.boot;
import com.xworkz.app.*;
public class GroundRunner {

	public static void main(String[] args) {
	
		System.out.println("invoking main method in runner");
		
		Ground ground=new Ground();
		System.out.println("size"+ground.size);
		System.out.println("area"+ground.area);
		System.out.println("type"+ground.type);
		System.out.println("isgood "+ground.isGood);
		
		
		System.out.println("####################################");
		
		MiniGround miniground=new MiniGround();
		System.out.println("size"+miniground.size);
		System.out.println("area"+miniground.area);
		System.out.println("type"+miniground.type);
		System.out.println("isgood "+miniground.isGood);
		
		
		

	}

}
