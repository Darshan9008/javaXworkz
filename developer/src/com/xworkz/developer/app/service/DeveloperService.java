package com.xworkz.developer.app.service;

import com.xworkz.developer.app.dto.DeveloperDTO;

public interface DeveloperService {
	
	public boolean validateAndSave(DeveloperDTO dto);
	
	default DeveloperDTO findByName(String name) {
		return null;
	}
	
	default DeveloperDTO findByWorkingFor(String name) {
		return null;
	}

	default DeveloperDTO findByDestination(String name) {
		return null;
	}

	default DeveloperDTO findByNameAndWorkingFor(String name, String workingFor) {
		return null;
	}

	default DeveloperDTO findByNameAndSalaryAndDesignation(String name, int salary, String designation) {
		return null;
	}
	
	
	
	

}
