package com.xworkz.developer.app.repository;
import com.xworkz.developer.app.dto.*;

public interface DeveloperRepsoitory {
	
	public int TOTAL_NUMBER=6;
	
	public void save(DeveloperDTO dto);
	
	default boolean isExist(DeveloperDTO dto) {
		return false;
	}
	
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
