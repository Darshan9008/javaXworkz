package com.xworkz.boot;
import com.xworkz.app.*;

public class NetworkRunner {
	
	public static void main(String[] args) {
		
		Network network=new AirtelNetwork();
		network.connect();
		
		Network network1=new jioNetwork();
		network1.connect();
		
		User user=new User();
		user.assNetwork(network1);
		
		
		
		Verification verification=new Brightness();
		verification.verify();
		
		
		Verification verification2=new Sound();
		verification2.verify();
		
		
		
		
		
			
			
        
		
		
		
		
		
		
	}

}
