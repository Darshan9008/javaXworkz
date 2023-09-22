package com.xworkz.Grocery.app;

public class MobileNoRepositoryImpl implements MobileNoRepository{
	
	
	public long[] mobileNumbers=new long[TOTAL_NO];
	
	public int position;
	
	
	
	@Override
	public boolean isExist(long mobileNo) {
		
		for(int index=0;index<=position;index++) {
			
			long temp=this.mobileNumbers[index];
			if(temp==mobileNo) {
				System.out.println("mobile no exist already,,, select another");
			}
			else {
				System.out.println("mobile no is valid to store");
			}
			
			
		}
		return false;
	}
	
	
    @Override
	public void store(long mobileNo) {
            
	System.out.println("invoking store() in MobileNoRepositoryImpl");
	if(position<TOTAL_NO) {
		
		this.mobileNumbers[position]=mobileNo;
		System.out.println("mobileno stored "+mobileNo+"at the position  "+position);
	}
	else {
		System.out.println("data is full");
	}
	
	}

}
