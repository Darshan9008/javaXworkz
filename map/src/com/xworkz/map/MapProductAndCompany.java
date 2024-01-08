package com.xworkz.map;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.xworkz.map.dto.CompanyDTO;
import com.xworkz.map.dto.ProductDTO;

public class MapProductAndCompany {
	
	
	public static void main(String[] args) {
		
		
		ProductDTO dto1=new ProductDTO("Rice", 120, 101, 2, LocalDate.of(2023, 06, 03));
		ProductDTO dto2=new ProductDTO("Dress", 4000, 102, 5, LocalDate.of(2023, 07, 04));
		ProductDTO dto3=new ProductDTO("Watches", 10000, 103, 10, LocalDate.of(2023, 03, 05));
		
		
		CompanyDTO dtoo1=new CompanyDTO("IBM", "Bengaluru", 120);
		CompanyDTO dtoo2=new CompanyDTO("Accenture", "Chennai", 220);
		CompanyDTO dtoo3=new CompanyDTO("Cognizant", "Shivamogga", 320);
		
		Map<ProductDTO, CompanyDTO> map1=new HashMap<ProductDTO, CompanyDTO>();
		map1.put(dto1, dtoo1);
		map1.put(dto2,dtoo2);
		map1.put(dto3, dtoo3);
		
		Set<ProductDTO> set1=
		
		
		


		


		
		
		
	}

}
