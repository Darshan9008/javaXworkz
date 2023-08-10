package com.xworkz.app;

public class Market {
	
	
	
	public void items() {
		System.out.println("invoking no arg method in hotel");
	}
	
	public void items(int noOfItems) {
		System.out.println("no of items:"+noOfItems);
	}

	public void items(String name) {
		System.out.println("name:"+name);
	}
	
	public void items(float rating) {
		System.out.println("Rating:"+rating);
	}
	public void items(boolean famous) {
		System.out.println("famous"+famous);
	}
	
	public void items(String itemName,int no) {
		System.out.println("item name"+itemName);
		System.out.println("no:"+no);
	}

}
