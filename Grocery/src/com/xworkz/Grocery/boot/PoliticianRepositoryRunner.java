package com.xworkz.Grocery.boot;
import com.xworkz.Grocery.app.*;

public class PoliticianRepositoryRunner {

	public static void main(String[] args) {

		
		System.out.println("invoking runner in main");
		
		PoliticianRepository politics=new PoliticianRepositoryImpl();
		politics.rule("bengaluru");
		politics.rule("rajajinagar");
		politics.rule("hebbal");

		politics.rule("magadi");

		politics.rule("sriramppura");

		politics.rule("nagavara");

		politics.rule("navrang");

		politics.rule("malleshwaram");


	}

}
