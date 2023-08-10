package com.xworkz.app;

public class Canteen extends Hotel {
	@Override
	public void items() {
		System.out.println("invoking no arg method in canteen");
	}
	@Override

	
	public void items(int noOfItems) {
		System.out.println("no of items:"+noOfItems);
	}
	@Override


	public void items(String name) {
		System.out.println("name:"+name);
	}
	@Override

	
	public void items(float rating) {
		System.out.println("Rating:"+rating);
	}
	@Override

	
	public void items(boolean famous) {
		System.out.println("famous"+famous);
	}
	@Override

	public void items(String itemName,int no) {
		System.out.println("item name"+itemName);
		System.out.println("no:"+no);
	}

}
