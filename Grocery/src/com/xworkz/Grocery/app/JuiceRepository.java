package com.xworkz.Grocery.app;

public interface JuiceRepository {
	
	public int TOTAL_ITEMS=6;
	
	public void store(String juice);
	
	default boolean isExist(String juice) {
		return false;
	}
	

}
