package com.xworkz.application.app.repository;

import com.xworkz.application.app.dto.ApplicationDTO;

public class ApplicationRepositoryImpl implements ApplicationRepository {

	ApplicationDTO[] dtos = new ApplicationDTO[TOTAL_NUMBER];
	public int position;

	@Override
	public boolean isExist(ApplicationDTO dto) {
		System.out.println("Running isExist in " + this.getClass().getSimpleName());

		for (int index = 0; index <= position; index++) {

			ApplicationDTO ref = this.dtos[index];
			if (ref != null && ref.equals(dto)) {
				System.out.println("dto is already exist");
				return true;
			}

		}

		return ApplicationRepository.super.isExist(dto);
	}
	
	
	@Override
	public ApplicationDTO findByName(String name) {

		for(int index=0;index<=position;index++) {
			ApplicationDTO dto=this.dtos[index];
			if(dto.getName().equals(name)) {
				System.out.println("dto matched with name");
				return dto;
			}
			
		}
		System.out.println("no data matched");
		return ApplicationRepository.super.findByName(name);
	}
	
	
	@Override
	public ApplicationDTO findbyNameAndDevelopedby(String Name, String findbyDevelopedby) {

		System.out.println("running findbyNameAndDevelopedby"+Name);
		for(int index=0;index<this.position;) 
		{
			ApplicationDTO dto = this.dtos[index];
			if(dto.getName().equals(Name) && dto.getDevelopedBy().equals(findbyDevelopedby)) 
			{
				System.out.println("data is found");
				return dto;
			}
			else {
				System.out.println("data is not found");
			}
		}
			return ApplicationRepository.super.findbyNameAndDevelopedby(Name, findbyDevelopedby);
	}
	

	@Override
	public void save(ApplicationDTO dto) {
		System.out.println("invoking save() in ApplicationRepositoryImpl");
		if (position < TOTAL_NUMBER) {
			this.dtos[position] = dto;
			System.out.println("dto is stored" + dto + "at the position" + position);
			this.position++;
		} else {
			System.out.println("storage is full");
		}
	}

}
