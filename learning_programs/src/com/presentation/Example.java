package com.presentation;

public class Example {

	//public static void count(String name) {
		
		//String name1=name.toLowerCase();
		//String name2="abcdefghijklmnopqrstuvwxyz";
		
		//for(int i=0;i<name1.length();i++) {
		//System.out.println(name2.indexOf(name1.charAt(i)));
		
		
	
	
	
	
	public static void count1(String str) {
		
		
		
		
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			for(int j=1;j<str.length()-1;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
				System.out.println(str.charAt(i)+""+count);        //a=2;b=2;c=2
				
			}
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Example.count1("abcabc");
	}
	
	
	
	
}
