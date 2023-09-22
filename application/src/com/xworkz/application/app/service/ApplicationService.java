package com.xworkz.application.app.service;

import com.xworkz.application.app.dto.ApplicationDTO;

public interface ApplicationService {
	
	public boolean validateAndSave(ApplicationDTO dto);
	
	default ApplicationDTO findByName(String name) {
		return null;
	}
	
	default ApplicationDTO findbyNameAndDevelopedby(String name,String developedby) {
		return null;
	}

}
