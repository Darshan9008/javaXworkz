package com.xworkz.app;

public class Browser {
	
	Internet internet;
	
	public void browsing(Internet internet) {
		this.internet=internet;
		this.internet.connect();
	}

}
