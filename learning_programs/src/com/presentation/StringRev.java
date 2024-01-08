package com.presentation;

public class StringRev {

	public static void main(String[] args) {

		String str="dsdfghad";
		String rev="";
		String org=str;
		for(int i=str.length()-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);

		if(org.equals(rev)) {
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}

		
	}

}
