package com.xworkz.boot;

import com.xworkz.app.*;

public class MenPg implements PG {

	@Override
	public float fees() {
		System.out.println("invoking fees in Menpg");
		return 0;
	}

	@Override
	public int noOfPg() {
		System.out.println("invoking noofpg in menpg");
		return 0;
	}

	@Override
	public void rules() {
		System.out.println("invoking rules in menpg");

	}

}
