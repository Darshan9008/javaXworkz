package com.xworkz.Grocery.app;

public interface LocationRepository {

	public int TOTAL_NUMBER=8;
	
	public void store(String location);
	
    default boolean isEmpty(String location) {
		
		return false;
		
	}
	
	
}
