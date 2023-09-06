package com.xworkz.Grocery.boot;

import com.xworkz.Grocery.app.PincodeRepository;
import com.xworkz.Grocery.app.PincodeRepositoryImpl;
import com.xworkz.Grocery.app.service.*;

public class PincodeRunner {

	public static void main(String[] args) {

		PincodeRepository pincodeRepository=new PincodeRepositoryImpl();
		
		PincodeService pincodeService=new PincodeServiceImpl(pincodeRepository);
		pincodeService.validateAndSave(234567);
		pincodeService.validateAndSave(234567);
		pincodeService.validateAndSave(123456);

		
		
		
		
	}

}
