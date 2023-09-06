package com.xworkz.Grocery.app.service;

import com.xworkz.Grocery.app.LocationRepository;

public class LocationServiceImpl implements LocationService{
	
	private LocationRepository locationRepository;

	public LocationServiceImpl(LocationRepository locationRepository) {
		this.locationRepository=locationRepository;
	}
	
	
	@Override
	public boolean validateAndSave(String location) {
      
		
		if(location!=null && !location.isEmpty() && location.length()>2 && location.length()<12) {
			
			System.out.println("location is valid");
			
	     	if(!this.locationRepository.isEmpty(location)) {
              this.locationRepository.store(location);
				return true;
		}
	     	else {
	     		System.err.println("location is already exist,, select another");
	     	}
		}
		else 
		{
			System.out.println("location is invalid");
		}
		
		
		return false;
	}

}
