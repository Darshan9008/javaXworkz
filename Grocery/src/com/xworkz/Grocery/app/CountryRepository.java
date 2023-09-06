package com.xworkz.Grocery.app;

public interface CountryRepository {
	
	public int TOTAL_NUMBER=7;
	
	public void store(String country);
	
	default boolean isExist(String country) {
		return false;
		
	}

}
