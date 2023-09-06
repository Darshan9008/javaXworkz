package com.xworkz.Grocery.boot;

import com.xworkz.Grocery.app.JuiceRepository;
import com.xworkz.Grocery.app.JuiceRepositoryImpl;
import com.xworkz.Grocery.app.service.*;

public class JuiceRunner {

	public static void main(String[] args) {

		JuiceRepository juiceRepository=new JuiceRepositoryImpl();
		
		JuiceService juiceService=new JuiceServiceImpl(juiceRepository);
		juiceService.validateAndSave("fizz");
		juiceService.validateAndSave("appi");
		
		juiceService.validateAndSave("appi");
		juiceService.validateAndSave("mango");

		


		
		
		
	}

}
