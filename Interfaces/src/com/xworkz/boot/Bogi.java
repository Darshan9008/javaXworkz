package com.xworkz.boot;

import com.xworkz.app.*;

public class Bogi implements Metro{
	
	@Override
	public float distance() {
System.out.println("invoking distance in bogi");		
      return 0;
	}

	
	@Override
	public void run() {
System.out.println("invoking run in bogi");		
	}
	
	
	@Override
	public int speed() {
System.out.println("invoking speed in bogi");		
    return 0;
	}
}
