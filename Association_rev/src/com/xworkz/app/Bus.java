package com.xworkz.app;

public class Bus {

	private String name;
	private Passenger passenger;
	
	
	public Bus(String name) {
		this.name=name;
	}
	
	public void setPassenger(Passenger passenger) {
		this.passenger=passenger;
		this.passenger.travel();
	}
	
}
