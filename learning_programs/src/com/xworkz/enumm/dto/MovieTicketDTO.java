package com.xworkz.enumm.dto;

import com.xworkz.enumm.constants.Discount;
import com.xworkz.enumm.constants.Gst;
import com.xworkz.enumm.constants.Price;

public class MovieTicketDTO {

	
	
	private Price price;
	private Gst gst;
	private Discount discount;
	public MovieTicketDTO(Price price, Gst gst, Discount discount) {
		super();
		this.price = price;
		this.gst = gst;
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "MovieTicketDTO [price=" + price + ", gst=" + gst + ", discount=" + discount + "]";
	}
	
	
	
	
	
}
