package com.presentation;

public class SchoolRunner {

	public static void main(String[] args) {


		School school=new School();
		try {
			school.run();
		} catch (ArrayException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
