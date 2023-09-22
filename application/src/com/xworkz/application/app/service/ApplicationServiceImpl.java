package com.xworkz.application.app.service;

import com.xworkz.application.app.dto.ApplicationDTO;
import com.xworkz.application.app.repository.ApplicationRepository;

public class ApplicationServiceImpl implements ApplicationService {

	private ApplicationRepository applicationRepository;

	public ApplicationServiceImpl(ApplicationRepository applicationRepository) {
		this.applicationRepository = applicationRepository;
	}

	@Override
	public boolean validateAndSave(ApplicationDTO dto) {

		if (dto != null) {

			System.out.println("dto is valid");

			int id = dto.getId();
			String name = dto.getName();
			String developedBy = dto.getDevelopedBy();
			String developedAt = dto.getDevelopedAt();
			String version = dto.getVersion();

			if (id > 0) {
				System.out.println("id is valid");
			} else {
				System.out.println("id is invalid to store");
				return false;
			}

			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 20) {
				System.out.println("name is valid");
			} else {
				System.out.println("name is not valid");
				return false;
			}
			if (developedBy != null && !developedBy.isEmpty() && developedBy.length() > 3
					&& developedBy.length() < 20) {
				System.out.println("developedBy is valid ");

			} else {
				System.out.println("developedBy is invalid");
				return false;
			}
			if (developedAt != null && !developedAt.isEmpty() && developedAt.length() > 3
					&& developedAt.length() < 20) {
				System.out.println("developedAt is valid");
			} else {
				System.out.println("developedAt is invalid");
				return false;
			}
			if (version != null && !version.isEmpty() && version.length() > 3 && version.length() < 7) {
				System.out.println("version is valid");

			} else {
				System.out.println("version is invalid");
			}

			if (!this.applicationRepository.isExist(dto)) {
				this.applicationRepository.save(dto);
				return true;
			}

		} else {
			System.out.println("dto is invalid");
		}

		return false;
	}
	
	
	@Override
	public ApplicationDTO findByName(String name) {
         System.out.println("invoking findByName in serviceImpl");
         if(name!=null && !name.isEmpty() && name.length()>3 && name.length()<20) {
        	 System.out.println("name is valid");
        	 ApplicationDTO dto=this.applicationRepository.findByName(name);
        	 return dto;
         }
         else {
        	 System.out.println("name is invalid");
         }
		return ApplicationService.super.findByName(name);
	}
	
	
	@Override
	public ApplicationDTO findbyNameAndDevelopedby(String name, String developedby) {
		
		System.out.println("invoking findbyNameAndDevelopedby in"+this.getClass().getSimpleName());
		if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20) {
		if(developedby!=null && !developedby.isEmpty() && developedby.length()>=3 && developedby.length()<=20){
			ApplicationDTO dto = this.findByName(name);
			ApplicationDTO dto1 = this.findbyNameAndDevelopedby(name, developedby);
			System.out.println("dto is found");
			return dto;
		}
		else
		{
			System.err.println("dto is not found");
	
		}
		}
		
		return ApplicationService.super.findbyNameAndDevelopedby(name, developedby);
	}
	

}
