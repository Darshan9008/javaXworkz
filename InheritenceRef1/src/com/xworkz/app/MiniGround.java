package com.xworkz.app;

public class MiniGround extends Ground {
	
	
	public MiniGround()
	{
		
		System.out.println("invoking play in ");
	}
	
	public MiniGround(int size,float area,String type,boolean isGood) {
		
		super(size,area,type,isGood);
		
	}
}
