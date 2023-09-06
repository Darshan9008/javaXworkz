package com.xworkz.Grocery.app.service;

import com.xworkz.Grocery.app.CountryRepository;

public class CountryServiceImpl implements CountryService{
	
	private CountryRepository countryrepository;
	
	
	public CountryServiceImpl(CountryRepository countryrepository) {
		this.countryrepository=countryrepository;
	}
	
	
	@Override
	public boolean validateAndSave(String country) {
		
		if(country!=null && !country.isEmpty() && country.length()>3 && country.length()<12) {
			
			System.out.println("country is valid");
			if(!this.countryrepository.isExist(country)) {
			
			this.countryrepository.store(country);
			return true;
			}
			else {
				System.err.println("Country name is already added add another country");
			}
		
			
		}
		else {
			System.out.println("Country name is invalid");
		}
		return false;
	}

}
