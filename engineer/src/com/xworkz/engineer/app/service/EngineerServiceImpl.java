package com.xworkz.engineer.app.service;

import com.xworkz.engineer.app.dto.EngineerDTO;
import com.xworkz.engineer.app.repository.EngineerRepository;

public class EngineerServiceImpl implements EngineerService {

	private EngineerRepository engineerRepository;

	public EngineerServiceImpl(EngineerRepository engineerRepository) {
		this.engineerRepository = engineerRepository;
	}

	@Override
	public boolean validateAndSave(EngineerDTO dto) {

		if (dto != null) {
			System.out.println("dto is valid");
			int id = dto.getId();
			String name = dto.getName();
			String collegeName = dto.getCollegeName();

			if (id > 0 && id < 1000)

			{
				System.out.println("id is valid to store");
			} else {
				System.out.println("id is invalid to store");
				return false;
			}

			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 20) {
				System.out.println("name is valid to store");
			} else {
				System.out.println("name is invalid to store");
				return false;
			}
			if (collegeName != null && !collegeName.isEmpty() && collegeName.length() > 3
					&& collegeName.length() < 20) {
				System.out.println("college name is valid to store");
			} else {
				System.out.println("college name is invalidd to store");
			}
			if (!this.engineerRepository.isExist(dto)) {
				this.engineerRepository.save(dto);
				return true;
			} else {
				System.out.println("dto is invalid to store");
			}
		}
		return false;
	}

	@Override
	public EngineerDTO findByName(String name) {
		System.out.println("invoking find by name in serviveImpl"+this.getClass().getSimpleName());
		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 20) {
			EngineerDTO dto=this.engineerRepository.findByName(name);
			System.out.println("dto is found");
			return dto;

		}
		else {
			System.out.println("dto is not found");
		}

		return null;
	}

}
