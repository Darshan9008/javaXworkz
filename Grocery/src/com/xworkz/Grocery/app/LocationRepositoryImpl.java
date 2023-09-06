package com.xworkz.Grocery.app;

public class LocationRepositoryImpl implements LocationRepository {

	public int position = 0;
	String[] locations = new String[TOTAL_NUMBER];

	@Override
	public boolean isEmpty(String location) {
		for(int index=0;index<position;index++) {		
	 String temp=this.locations[index];
	 if(temp!=null && temp.equals(location)) {
		 System.out.println("location is valid to store");
		 return true;
	 }
	 else {
		 System.out.println("location is not valid ... select another");
	 }
		}
		return false;
	}

	@Override
	public void store(String location) {
		System.out.println("invoking store() in LocationRepositoryImpl ");
		if (position < TOTAL_NUMBER) {
			this.locations[position] = location;
			System.out.println("location store " + location + "  at the location  " + position);
			this.position++;
		} else {
			System.out.println("data store is full");
		}
	}

}
