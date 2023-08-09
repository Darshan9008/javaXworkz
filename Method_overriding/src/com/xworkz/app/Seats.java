package com.xworkz.app;

public class Seats extends Theater{
	@Override
	public void watch() {
		System.out.println("invoking method watch in seats");
		super.watch();
	}

}
