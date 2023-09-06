package com.xworkz.Grocery.boot;

import com.xworkz.Grocery.app.LocationRepository;
import com.xworkz.Grocery.app.LocationRepositoryImpl;
import com.xworkz.Grocery.app.service.LocationService;
import com.xworkz.Grocery.app.service.LocationServiceImpl;

public class LocationRunner {
	public static void main(String[] args) {
		
		LocationRepository locationRepository=new LocationRepositoryImpl();
		
		LocationService locationService=new LocationServiceImpl(locationRepository);
		
		locationService.validateAndSave("goa");
		locationService.validateAndSave("goa");
		locationService.validateAndSave("shimoga");
		locationService.validateAndSave("bhadravathi");
		locationService.validateAndSave("shimoga");





	}

}
