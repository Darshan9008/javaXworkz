package com.xworkz.app;

public class Laptop {

	private String name;
	private Trainer trainer;
	
	
	public Laptop(String name) {
		this.name=name;
		
	}
	
	public void setTrainer(Trainer trainer) {
		this.trainer=trainer;
		this.trainer.talent();
		
		
	}
	
}
