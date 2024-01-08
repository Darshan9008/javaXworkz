package com.xworkz.enumm;

import com.xworkz.enumm.constants.BasePrice;
import com.xworkz.enumm.dto.TrainDTO;

public class TrainRunner {

	public static void main(String[] args) {


		TrainDTO dto=new TrainDTO(BasePrice.FOUR_HUNDRED);
		dto.setName("darshan");
		dto.setNoOfTickets(3);
		System.out.println(dto);
		
}

}
