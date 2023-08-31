package com.xworkz.app;

public class Custom {

	Verification verification;
	
	public void passVerify(Verification verification) {
		
		this.verification= verification;
		this.verification.verify();
	}
	
}
