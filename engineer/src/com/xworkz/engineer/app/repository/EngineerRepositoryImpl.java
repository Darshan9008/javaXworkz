package com.xworkz.engineer.app.repository;

import com.xworkz.engineer.app.dto.EngineerDTO;

public class EngineerRepositoryImpl implements EngineerRepository {

	EngineerDTO[] dtos = new EngineerDTO[TOTAL_NUMBER];
	public int position;

	@Override
	public boolean isExist(EngineerDTO dto) {

		System.out.println("invoking isExist in EngineerRepositoryImpl ");
		for (int index = 0; index < position; index++) {
			EngineerDTO ref = this.dtos[index];
			if (ref != null && ref.equals(dto)) {
				System.out.println("dto is already exist");
				return true;
			}

		}

		return EngineerRepository.super.isExist(dto);
	}

	@Override
	public void save(EngineerDTO dto) {
		System.out.println("invoking save() in EngineerRepositoryImpl ");
		if (this.position < TOTAL_NUMBER) {
			this.dtos[position] = dto;
			System.out.println("dto is stored " + dto + "at the position " + position);
			this.position++;
		} else {
			System.out.println("storage is full");
		}

	}
	
	@Override
	public EngineerDTO findByName(String name) {
           
		for(int index=0;index<position;index++) {
			
		EngineerDTO dto=this.dtos[index];
		if(dto.getName().equals(name)) {
			System.out.println("name is found in dto");
			return dto;
		
		}
		else
		{
			System.out.println("name is not found");
			
		}
		}
		return null;
		
	}

}
