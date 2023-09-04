package com.xworkz.Grocery.app;

public class PatientRepositoryImpl implements PatientRepository {

	String[] data = new String[TOTAL_NUMBER];

	public int position;

	@Override
	public void admission(String name) {
		System.out.println("invoking admission in PatientRepository");
		
		if(this.position<TOTAL_NUMBER) {
			
			this.data[position]=name;
			System.out.println("name added  "+name+" at the position"+position);
			this.position++;
			
			
			
		}
		else
			System.out.println("memory is full");

	}

}
