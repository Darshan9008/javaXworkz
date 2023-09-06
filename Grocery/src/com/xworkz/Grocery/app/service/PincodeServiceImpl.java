package com.xworkz.Grocery.app.service;

import com.xworkz.Grocery.app.PincodeRepository;

public class PincodeServiceImpl implements PincodeService {
	
	private PincodeRepository pincodeRepository;
	
	public PincodeServiceImpl(PincodeRepository pincodeRepository) {
		this.pincodeRepository=pincodeRepository;
	}
	
	
	
	@Override
	public void validateAndSave(int pincode) {
       System.out.println("invoking validate and save in pincode service impl");
       String pincodeStr=Integer.toString(pincode);
       if(pincodeStr!=null && !pincodeStr.isEmpty() && pincodeStr.length()==6) {
    	   
    	   System.out.println("pincode is valid");
    	   if(this.pincodeRepository.isEmpty(pincode)) {   	   
    	   this.pincodeRepository.store(pincode);
    	  
       }
    	   else
    	   {
    		   System.out.println("pincode exist already,,, select another");
    	   }
       }
       
       else 
       {
    	   System.out.println("pincode is invalid");
       }
       
       
		
		
	}
	
	
	

}
