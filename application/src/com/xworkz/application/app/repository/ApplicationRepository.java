package com.xworkz.application.app.repository;

import com.xworkz.application.app.dto.ApplicationDTO;

public interface ApplicationRepository {

	public int TOTAL_NUMBER = 7;

	public void save(ApplicationDTO dto);

	default boolean isExist(ApplicationDTO dto) {
		return false;
	}

	default ApplicationDTO findByName(String name) {
		return null;
	}

	default ApplicationDTO findbyNameAndDevelopedby(String Name, String findbyDevelopedby) {
		return null;
	}

}
