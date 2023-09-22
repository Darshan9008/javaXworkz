package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.NewspaperDTO;

public class NewspaperRepositoryImpl implements NewspaperRepository {

	private NewspaperDTO[] dtos = new NewspaperDTO[TOTAL_NUMBER];
	public int position;

	@Override
	public void save(NewspaperDTO dto) {

		System.out.println("invoking save() in NewspaperRepositoryImpl");
		if (this.position < TOTAL_NUMBER) {

			this.dtos[position] = dto;
			System.out.println(dto + "stored at the position" + position);
			this.position++;

		} else {
			System.err.println("storage is full");
		}
	}
	
	
	@Override
	public boolean isExist(NewspaperDTO dto) {
		System.out.println("running isExist in "+this.getClass().getSimpleName());
		for(int index=0;index<=this.position;index++)
		{
			NewspaperDTO ref=this.dtos[index];
			if(ref!=null && ref.equals(dto)) {
				System.out.println("dto is already exist");
				return true;
			}
		}
		
		
		
		return NewspaperRepository.super.isExist(dto);
	}
	
	@Override
	public NewspaperDTO findByPublisher(String name) {
		System.out.println("running findBypublisher,, arg passed "+name);
		System.out.println("CURRENT POSITION"+this.position);
		for(int index=0;index<this.position;index++) {
			NewspaperDTO dto=this.dtos[index];
			if(dto.getPublisher().equals(name)) {
				System.out.println("dto is found with publisher");
				return dto;
			}
			
		}		
		
		
		System.out.println("no dto is matched");
		return null;
	}
	
	
	
	


}
