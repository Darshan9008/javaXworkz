package com.xworkz.college.app.repository;

import com.xworkz.college.app.dto.CollegeDTO;

public interface CollegeRepository {
	
	public int TOTAL_NUMBER=5;
	
	public void save(CollegeDTO dto);
	

}
