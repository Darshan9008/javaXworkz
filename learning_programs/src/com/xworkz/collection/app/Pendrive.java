package com.xworkz.collection.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

import com.xworkz.collection.dto.PendriveDTO;

public class Pendrive {

	public static void main(String[] args) {

		PendriveDTO pendriveDTO=new PendriveDTO("128gb", "hp", false, 256);
		PendriveDTO pendriveDTO1=new PendriveDTO("512gb", "samsung", true, 188);

		PendriveDTO pendriveDTO2=new PendriveDTO("256gb", "sandisk", false, 222);

		PendriveDTO pendriveDTO3=new PendriveDTO("1tb", "dell", true, 210);
		
		Collection<PendriveDTO> ref=new ArrayList<PendriveDTO>();
		ref.add(pendriveDTO);
		ref.add(pendriveDTO1);

		ref.add(pendriveDTO2);

		ref.add(pendriveDTO3);
		
		
		
		
		ref.stream().sorted().forEach(p->System.out.println(p));
		
		
		

		

		
	}

}
