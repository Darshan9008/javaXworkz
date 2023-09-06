package com.xworkz.Grocery.boot;

import com.xworkz.Grocery.app.CountryRepository;
import com.xworkz.Grocery.app.CountryRepositoryImpl;
import com.xworkz.Grocery.app.service.*;

public class CountryRunner {

	public static void main(String[] args) {

		CountryRepository countryRepository=new CountryRepositoryImpl();
		
		CountryService countryService=new CountryServiceImpl(countryRepository);
		
		countryService.validateAndSave("Bharat");
		countryService.validateAndSave("fi");
		countryService.validateAndSave("Bharat");

		
		
			
			
		
		
		
	}

}
