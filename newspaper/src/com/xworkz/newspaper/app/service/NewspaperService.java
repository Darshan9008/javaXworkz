package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.NewspaperDTO;

public interface NewspaperService {
	
	
	public boolean validateAndSave(NewspaperDTO dto);
	
	default NewspaperDTO finByPublisher(String name) {
		return null;
	}

}
