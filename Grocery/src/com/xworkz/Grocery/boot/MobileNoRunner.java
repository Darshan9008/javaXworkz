package com.xworkz.Grocery.boot;

import com.xworkz.Grocery.app.service.*;
import com.xworkz.Grocery.app.*;
public class MobileNoRunner {

	public static void main(String[] args) {

		
		
		System.out.println("invoking main in runner");
		
		MobileNoRepository mobileNoRepository=new MobileNoRepositoryImpl();
		
		MobileNoService mobileNoService=new MobileNoServiceImpl(mobileNoRepository);
		mobileNoService.validAndSave(9482799467l);
		mobileNoService.validAndSave(1234567891l);
		mobileNoService.validAndSave(9008106466l);


	}

}
