package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.xworkz.map.dto.CountryDTO;
import com.xworkz.map.dto.PresidentDTO;

public class CountryAndPresident {

	public static void main(String[] args) {


		CountryDTO cdto1=new CountryDTO(101, "India");
		CountryDTO cdto2=new CountryDTO(102, "Srilanka");
		CountryDTO cdto3=new CountryDTO(103, "Nepal");
		CountryDTO cdto4=new CountryDTO(104, "Australia");
		CountryDTO cdto5=new CountryDTO(105, "England");
		
		PresidentDTO pdto1=new PresidentDTO(201, "Modi");
		PresidentDTO pdto2=new PresidentDTO(202, "Dravid");
		PresidentDTO pdto3=new PresidentDTO(203, "Sachin");
		PresidentDTO pdto4=new PresidentDTO(204, "Virat");
		PresidentDTO pdto5=new PresidentDTO(205, "Rishi");

		
		
		
		Map<CountryDTO,PresidentDTO> hmap=new HashMap<CountryDTO, PresidentDTO>();
		
		hmap.put(cdto1, pdto1);
		hmap.put(cdto2, pdto2);

		hmap.put(cdto3, pdto3);

		hmap.put(cdto4, pdto4);

		hmap.put(cdto5, pdto5);
		
		Set<CountryDTO> countryDTO=hmap.keySet();
		countryDTO.forEach(p->System.out.println(p));
		
		
		System.out.println("*******************************");

		Collection<PresidentDTO> presidentDTO=hmap.values();
		presidentDTO.forEach(q->System.out.println(q));
		
		
		Set<Entry<CountryDTO, PresidentDTO>> set=hmap.entrySet();
		set.forEach(p->System.out.println(p));
		
	  



		
		
		




		
	}

}
