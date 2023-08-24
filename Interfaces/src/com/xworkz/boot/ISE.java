package com.xworkz.boot;
import com.xworkz.app.*;
public class ISE implements Engineer{
	
	@Override
	public float exams() {
System.out.println("invoking exams in ISE");
		return 0;
	}
	
	@Override
	public int fees() {
		System.out.println("invoking fees in ISE");

		return 0;
	}
	
	@Override
	public void internals() {
		System.out.println("invoking internals in ISE");

		
	}

}
