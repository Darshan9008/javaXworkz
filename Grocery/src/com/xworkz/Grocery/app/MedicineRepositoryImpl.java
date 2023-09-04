package com.xworkz.Grocery.app;

public class MedicineRepositoryImpl implements MedicineRepository {
	
	
	String[] medicineName=new String[TOTAL_NUMBER];
	public int position;
	
	@Override
	public void function(String name) {

	 System.out.println("invoking function() in MedicineRepositoryImpl");
	 if(this.position<TOTAL_NUMBER) {
		 
		 this.medicineName[position]=name;
		 System.out.println("name added  "+name+"  at the position"+position);
		 this.position++;
		 
	 }
	 else
		 System.out.println("memory is full");
	}
	
	
	

}
