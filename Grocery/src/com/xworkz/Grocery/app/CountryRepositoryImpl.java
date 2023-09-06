package com.xworkz.Grocery.app;

public class CountryRepositoryImpl implements CountryRepository {
	
	public String[] countries=new String[TOTAL_NUMBER];
	public int position=0;
	
	
	@Override
	public boolean isExist(String country) {
		 for(int index=0;index<=position;index++) {
			 
			String temp=this.countries[index];
			if(temp!=null && temp.equals(country)) {
				
				System.out.println("country is valid to store");
				return true;

			}
			
		 }
			return false;
			 
		 }
	@Override
	public void store(String country) {
		System.out.println("invoking store() in CountryRepositoryImpl");
		if(position<TOTAL_NUMBER) {
			this.countries[position]=country;
			System.out.println("country stored "+country+"at the position"+position);			
		}
		else
		{
			System.out.println("data is full");
		}
      
		
		
	}

}
