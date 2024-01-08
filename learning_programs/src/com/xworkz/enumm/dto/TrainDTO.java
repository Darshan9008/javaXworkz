package com.xworkz.enumm.dto;

import com.xworkz.enumm.constants.BasePrice;

public class TrainDTO {
	
	private String name;
	private BasePrice price;
	private int noOfTickets;
	
	public TrainDTO(BasePrice price) {
		this.price=price;
        

	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}


	@Override
	public String toString() {
		return "TrainDTO [name=" + name + ", price=" + price + ", noOfTickets=" + noOfTickets + "]";
	}
	
	
	
	
	
	

}
