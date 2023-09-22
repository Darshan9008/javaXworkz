package com.xworkz.engineer.app.service;

import com.xworkz.engineer.app.dto.EngineerDTO;

public interface EngineerService {
	
	
		public boolean validateAndSave(EngineerDTO dto);
		
		
		
		EngineerDTO findByName(String name);

}
