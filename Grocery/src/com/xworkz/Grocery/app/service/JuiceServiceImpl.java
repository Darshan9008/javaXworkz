package com.xworkz.Grocery.app.service;

import com.xworkz.Grocery.app.JuiceRepository;

public class JuiceServiceImpl implements JuiceService {
	
	private JuiceRepository juiceRepository;
	
	
	public JuiceServiceImpl(JuiceRepository juiceRepository) {
		this.juiceRepository=juiceRepository;
	}
	
	
	
	
	@Override
	public boolean validateAndSave(String juice) {
        System.out.println("invoking validate and save in juiceServiceImpl");	
        
        if(juice!=null && !juice.isEmpty() && juice.length()>=3 && juice.length()<10) {
        	
        	System.out.println("juice is valid");
        	
        	
        	if(!this.juiceRepository.isExist(juice)) {
        	
        	this.juiceRepository.store(juice);
        	return true;
        	}
        	else {
        		
        	
        		System.err.println("juice is already exist,, select another");
        	}
        }
        
         else
        {
        	System.out.println("juice is invalid");
        }
        return false;
	}

}
