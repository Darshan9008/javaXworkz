package com.xworkz.learn.lambda;
@FunctionalInterface
public interface Dominos {
	
	public String walk();
	
	default void jog() {
		
	}

}
