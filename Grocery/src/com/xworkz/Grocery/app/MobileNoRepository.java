package com.xworkz.Grocery.app;

public interface MobileNoRepository {
	
	public int TOTAL_NO=6;
	
	public void store(long mobileNo);
	
	default boolean isExist(long mobileNo) {
		return false;
		
	}
	

}
