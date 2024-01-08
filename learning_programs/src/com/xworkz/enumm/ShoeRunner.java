package com.xworkz.enumm;

import com.xworkz.enumm.constants.Size;
import com.xworkz.enumm.constants.Type;
import com.xworkz.enumm.dto.ShoeDTO;

public class ShoeRunner {

	public static void main(String[] args) {

		
		ShoeDTO dto=new ShoeDTO(Size.SEVEN,Type.PARTY_WEAR);
		dto.setBrand("Asics");
		dto.setPrice(3000);
		System.out.println(dto);
		



	}

}
