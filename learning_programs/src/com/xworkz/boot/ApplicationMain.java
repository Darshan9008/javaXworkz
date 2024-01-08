package com.xworkz.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.app.dto.ApplicationDTO;

public class ApplicationMain {

	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2018, 05, 03);

		LocalDate date2 = LocalDate.of(2015, 03, 07);

		ApplicationDTO dto = new ApplicationDTO("chandan", "1.8", "xworkz", date, 4.2d);

		ApplicationDTO dto1 = new ApplicationDTO("darshan", "2.8", "accenture", date2, 3.9d);

		ApplicationDTO dto2 = new ApplicationDTO("venu", "3.8", "IBM", date2, 4.9d);

		ApplicationDTO dto3 = new ApplicationDTO("jeevan", "4.8", "kyndrll", date, 3.7d);

		ApplicationDTO dto4 = new ApplicationDTO("yellu", "3.9", "hp", date, 2.7d);

		
		Collection<ApplicationDTO> one=new ArrayList<ApplicationDTO>();
		
		one.add(dto);
		one.add(dto1);
		one.add(dto2);
		one.add(dto3);
		one.add(dto4);
		
		Iterator<ApplicationDTO> itr=one.iterator();
		while(itr.hasNext()) {
			
			ApplicationDTO applicationDTO=itr.next();
			System.out.println(applicationDTO.getName());
		}
		
		
		
		
		
		
	}

}
