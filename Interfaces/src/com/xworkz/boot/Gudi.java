package com.xworkz.boot;

import com.xworkz.app.*;

public class Gudi implements Temple {

	@Override
	public boolean believeInGod() {

		System.out.println("invoking believe in god method in gudi");
		return false;
	}

	@Override
	public int blessing() {
		System.out.println("invoking blessing method in gudi");
		return 0;
	}

	@Override
	public float pray() {
		System.out.println("invoking method pray in gudi");
		return 0;
	}

}
