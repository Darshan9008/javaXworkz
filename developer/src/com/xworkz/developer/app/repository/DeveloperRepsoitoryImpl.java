package com.xworkz.developer.app.repository;

import com.xworkz.developer.app.dto.DeveloperDTO;

public class DeveloperRepsoitoryImpl implements DeveloperRepsoitory{
	
	public DeveloperDTO[] dtos=new DeveloperDTO[TOTAL_NUMBER];
	public int position;
	private int salary;
	
	@Override
	public void save(DeveloperDTO dto) {
      System.out.println("invoking save in DeveloperRepsoitoryImpl ");	
      if(this.position<TOTAL_NUMBER) {
    	  this.dtos[position]=dto;
    	  System.out.println("dto stored"+dto+" at the position "+position);
    	  this.position++;
      }
      else
      {
    	  System.out.println("storage is full");
      }
	}
	
	
	public boolean isExist(DeveloperDTO dto) {
		System.out.println("Running isExist in " + this.getClass().getSimpleName());
		for (int index = 0; index < this.position; index++) {
			DeveloperDTO ref = this.dtos[index];
			if (ref != null && ref.equals(dto)) {
				System.out.println("Data already exist");
				return true;
			}
		}
		return DeveloperRepsoitory.super.isExist(dto);
	}

	@Override
	public DeveloperDTO findByDestination(String name) {
		System.out.println("Invoking findByDesignation " + name);
		System.out.println("Current position " + this.position);
		for (int index = 0; index < this.position; index++) {
			DeveloperDTO dto = this.dtos[index];
			if (dto.getName().equals(name)) {
				System.out.println("Dto found with designation");
				return dto;
			}
		}
		System.out.println("No data matched");

		return DeveloperRepsoitory.super.findByDestination(name);
	}

	@Override
	public DeveloperDTO findByName(String name) {

		System.out.println("Invoking findByName " + name);
		System.out.println("Current position " + this.position);
		for (int index = 0; index < this.position; index++) {
			DeveloperDTO dto = this.dtos[index];
			if (dto.getName().equals(name)) {
				System.out.println("Dto found with name");
				return dto;
			}
		}
		System.out.println("No data matched");
		return DeveloperRepsoitory.super.findByName(name);
	}

	@Override
	public DeveloperDTO findByNameAndSalaryAndDesignation(String name, int salary, String designation) {

		System.out.println("Invoking findByNameAndSalaryAndDesignation " + name);
		System.out.println("Current position " + this.position);
		for (int index = 0; index < this.position; index++) {
			DeveloperDTO dto = this.dtos[index];
			if (dto.getName().equals(name) && dto.getSalary() == this.salary && dto.getDesignation().equals(designation)) {
				System.out.println("Dto found with name,salary and designation");
				return dto;
			}
		}
		System.out.println("No data matched");
		return DeveloperRepsoitory.super.findByNameAndSalaryAndDesignation(name, salary, designation);
	}

	@Override
	public DeveloperDTO findByNameAndWorkingFor(String name, String workingFor) {
		System.out.println("Invoking findByNameAndWorkingFor  " + name);
		System.out.println("Current position " + this.position);
		for (int index = 0; index < this.position; index++) {
			DeveloperDTO dto = this.dtos[index];
			if (dto.getName().equals(name) && dto.getWorkingFor().equals(workingFor)) {
				System.out.println("Dto found with name and workingFor");
				return dto;
			}
		}
		System.out.println("No data matched");
		return DeveloperRepsoitory.super.findByNameAndWorkingFor(name, workingFor);
	}

	@Override
	public DeveloperDTO findByWorkingFor(String name) {

		System.out.println("Invoking findByWorkingFor " + name);
		System.out.println("Current position " + this.position);
		for (int index = 0; index < this.position; index++) {
			DeveloperDTO dto = this.dtos[index];
			if (dto.getName().equals(name)) {
				System.out.println("Dto found with workingFor");
				return dto;
			}
		}
		System.out.println("No data matched");
		return DeveloperRepsoitory.super.findByWorkingFor(name);
	}
	
	

}
