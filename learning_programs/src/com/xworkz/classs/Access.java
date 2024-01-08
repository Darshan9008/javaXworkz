package com.xworkz.classs;

public class Access {

	public int num=10;
	private String num1="darshan";
	protected float num2=10.25f;
	
	static int num4=12;
	
	
	public void run() {
		System.out.println("invoking run() in Access");
	}
	
	private void walk() {
		System.out.println("invoking walk in Access");
	}
	
	protected void play(float num2) {
		this.num2=num2;
		System.out.println("invoking play() in Access");
	}
	
	
	
	public static void main(String[] args) {
		
		Access access=new Access();
        System.out.println(access.num);
		System.out.println(access.num1);
		System.out.println(access.num2);
      
		
		System.out.println(Access.num4);

		
		
		
	}

}
