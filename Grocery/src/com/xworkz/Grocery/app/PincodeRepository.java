package com.xworkz.Grocery.app;

public interface PincodeRepository {

	public int TOTAL_NUMBER=8;
	
	
	public void store(int pincode);
	
	
	default boolean isEmpty(int pincode) {
		return false;
	}
	
}
