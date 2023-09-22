package com.xworkz.Grocery.app.service;

import com.xworkz.Grocery.app.PincodeRepository;

public class PincodeServiceImpl implements PincodeService {

	private PincodeRepository pincodeRepository;

	private PincodeServiceImpl(PincodeRepository pincodeRepository) {
		this.pincodeRepository = pincodeRepository;
	}

	@Override
	public void validateAndSave(int pincode) {
		System.out.println("invoking validate and save in pincode service impl");

		if (pincode > 500000 && pincode < 599999) {

			System.out.println("pincode is valid");
			if (!this.pincodeRepository.isExist(pincode)) {
				this.pincodeRepository.store(pincode);
                    
			} else {
				System.err.println("pincode exist already,,, select another");
			}
		}

		else {
			System.err.println("pincode is invalid");
		}

	}

}
