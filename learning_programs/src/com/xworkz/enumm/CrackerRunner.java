package com.xworkz.enumm;

import com.xworkz.enumm.dto.Color;
import com.xworkz.enumm.dto.CrackersDTO;
import com.xworkz.enumm.dto.CrackersType;

public class CrackerRunner {

	public static void main(String[] args) {


		CrackersDTO dto=new CrackersDTO(CrackersType.DOUBLE_SHOTS,Color.GREY);
		dto.setName("fire");
		dto.setPrice(2000);
		System.out.println(dto.toString());
	}
	

}
