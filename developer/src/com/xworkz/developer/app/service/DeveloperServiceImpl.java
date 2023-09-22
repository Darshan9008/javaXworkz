package com.xworkz.developer.app.service;

import com.xworkz.developer.app.dto.DeveloperDTO;
import com.xworkz.developer.app.repository.DeveloperRepsoitory;

public class DeveloperServiceImpl implements DeveloperService {

	private DeveloperRepsoitory developerRepsoitory;

	public DeveloperServiceImpl(DeveloperRepsoitory developerRepsoitory) {
		this.developerRepsoitory = developerRepsoitory;
	}

	@Override
	public boolean validateAndSave(DeveloperDTO dto) {

		if (dto != null) {

			System.out.println("dto is valid");

			String name = dto.getName();
			int experience = dto.getExperience();
			int salary = dto.getSalary();
			String workingFor = dto.getWorkingFor();
			String designation = dto.getDesignation();
			boolean difficult = dto.isDifficult();

			if (designation != null && !designation.isEmpty() && designation.length() > 3
					&& designation.length() <= 20) {
				System.out.println("designation is valid");
			} else {
				System.err.println("designation is invalid");
				return false;
			}

			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() <= 20) {
				System.out.println("name is valid");
			} else {
				System.err.println("name is invalid");
				return false;
			}

			if (salary != 0 && salary >= 0) {
				System.out.println("salary is valid");
			} else {
				System.err.println("salary is invalid");
				return false;
			}
			if (experience != 0 && experience >= 0) {
				System.out.println("experience is valid");
			} else {
				System.err.println("experience is invalid");
				return false;
			}

			if (workingFor != null && !workingFor.isEmpty() && workingFor.length() > 3 && workingFor.length() <= 20) {
				System.out.println("working is valid");
			} else {
				System.err.println("working is invalid");
				return false;
			}

			if (difficult == true && !difficult == false) {
				System.out.println("Difficult is valid");
			} else {
				System.err.println("Difficult is invalid");
				return false;
			}

			System.out.println("Data is valid");
			if (!this.developerRepsoitory.isExist(dto)) {
				this.developerRepsoitory.save(dto);
				return true;
			}
		} else {
			System.err.println("Data invalid");
		}

		return false;
	}

	@Override
	public DeveloperDTO findByDestination(String name) {
		System.out.println("Invoking findByDestination " + name);
		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 20) {
			System.out.println("Designation is valid");
			DeveloperDTO dto = this.developerRepsoitory.findByDestination(name);
			return dto;
		} else {
			System.err.println("Designation is invalid");
		}
		return DeveloperService.super.findByDestination(name);
	}

	@Override
	public DeveloperDTO findByName(String name) {
		System.out.println("Invoking findByName " + name);
		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 20) {
			System.out.println("Name is valid");
			DeveloperDTO dto = this.developerRepsoitory.findByName(name);
			return dto;
		} else {
			System.err.println("Name is invalid");
		}
		return DeveloperService.super.findByName(name);
	}

	@Override
	public DeveloperDTO findByNameAndSalaryAndDesignation(String name, int salary, String designation) {
		System.out.println("Invoking findByNameAndSalaryAndDesignation" + name);
		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 20) {
			System.out.println("Name,Salary and designation are valid");
			DeveloperDTO dto = this.developerRepsoitory.findByNameAndSalaryAndDesignation(name, salary, designation);
			return dto;
		} else {
			System.err.println("Name,Salary and designation are invalid");
		}
		return DeveloperService.super.findByNameAndSalaryAndDesignation(name, salary, designation);
	}

	@Override
	public DeveloperDTO findByNameAndWorkingFor(String name, String workingFor) {
		System.out.println("Invoking findByNameAndWorkingFor" + name);
		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 20) {
			System.out.println("Name,WorkingFor are valid");
			DeveloperDTO dto = this.developerRepsoitory.findByNameAndWorkingFor(name, workingFor);
			return dto;
		} else {
			System.err.println("Name,WorkingFor are invalid");
		}
		return DeveloperService.super.findByNameAndWorkingFor(name, workingFor);
	}

	@Override
	public DeveloperDTO findByWorkingFor(String name) {
		System.out.println("Invoking findByWorkingFor" + name);
		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 20) {
			System.out.println("WorkingFor is valid");
			DeveloperDTO dto = this.developerRepsoitory.findByWorkingFor(name);
			return dto;
		} else {
			System.err.println("WorkingFor is invalid");
		}
		return DeveloperService.super.findByWorkingFor(name);
	}

}
