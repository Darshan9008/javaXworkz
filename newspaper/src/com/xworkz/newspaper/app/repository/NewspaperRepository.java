package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.NewspaperDTO;

public interface NewspaperRepository {
	
	
	public int TOTAL_NUMBER=6;
	
	public void save(NewspaperDTO dto);
	
	default boolean isExist(NewspaperDTO dto) {
		return false;
		
	}
	
     NewspaperDTO findByPublisher(String name);
		
	
	
	
	
	

}
