package com.xworkz.college.app.repository;

import com.xworkz.college.app.dto.CollegeDTO;

public class CollegeRepositoryImpl implements CollegeRepository {
	
	private int position;
	CollegeDTO[] dtos= new CollegeDTO[TOTAL_NUMBER];
	
	@Override
	public void save(CollegeDTO dto) {

		System.out.println("invoking save() in CollegeRepositoryImpl");
		if(position<TOTAL_NUMBER) {
			
			this.dtos[position]=dto;
			System.out.println("dto is stored "+dto+" at the position"+position);
			this.position++;
		}
		else {
			System.out.println("storage is full");
		}
		
	}
	

}
