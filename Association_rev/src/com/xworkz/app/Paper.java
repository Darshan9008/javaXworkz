package com.xworkz.app;

public class Paper {
	
	
	private String woodName;
	private Wood wood;
	
	public Paper(Wood wood) {
		this.wood=wood;
		this.wood.process();
	}

}
