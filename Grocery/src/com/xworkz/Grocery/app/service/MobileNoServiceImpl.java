package com.xworkz.Grocery.app.service;

import com.xworkz.Grocery.app.MobileNoRepository;

public class MobileNoServiceImpl implements MobileNoService {
	
	private MobileNoRepository mobileNoRepository;
	
	public MobileNoServiceImpl(MobileNoRepository mobileNoRepository) {
		this.mobileNoRepository=mobileNoRepository;
	}
	
	
	@Override
	public boolean validAndSave(long mobileNo) {
     
		if(mobileNo>6000000000l && mobileNo<9999999999l) {
			
			System.out.println("valid MobileNo");
			
			if(!this.mobileNoRepository.isExist(mobileNo)) {
				
			
			this.mobileNoRepository.store(mobileNo);
			return true;
			}
			else 
			{
				return false;
			}
			
		}
		else {
			System.out.println("invalid mobile no");
		}
		return false;
		
	}
	
	
	

}
