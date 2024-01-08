package com.xworkz.enumm;

import com.xworkz.enumm.constants.Discount;
import com.xworkz.enumm.constants.Gst;
import com.xworkz.enumm.constants.Price;
import com.xworkz.enumm.dto.MovieTicketDTO;

public class MovieRunner {

	public static void main(String[] args) {


		MovieTicketDTO dto =new MovieTicketDTO(Price.FIVE_HUNDRED, Gst.SIXTY, Discount.THIRTY);
		System.out.println(dto);
	}

}
