package com.xworkz.app;

public class User {
	
	public Network network;
	
	
	public void using() {
		System.out.println("invoking using in user");
	}
	
	public void assNetwork(Network network) {
		this.network=network;
		this.network.connect();
	}
	

}
