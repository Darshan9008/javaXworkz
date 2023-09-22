package com.xworkz.engineer.app.repository;

import com.xworkz.engineer.app.dto.EngineerDTO;

public interface EngineerRepository {
	
	
	public int TOTAL_NUMBER=5;
	
	
	public void save(EngineerDTO dto);
	
	default boolean isExist(EngineerDTO dto) {
		
		
		return false;
	}
	
	
	EngineerDTO findByName(String name);

}
