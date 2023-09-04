package com.xworkz.Grocery.app;

public class PilotRepositoryImpl implements PilotRepository {

	String[] database = new String[TOTAL_TIME];
	public int position;

	@Override
	public void fly(String center) {
		System.out.println("invoking fly() in PilotRepositoryimpl");
		
		if(this.position<TOTAL_TIME) {
			
			
			this.database[position]=center;
			System.out.println("data added  "+center+"  at the position   "+position);
			this.position++;
		}
		else
		{
			System.out.println("memory is full");
		}
		
	}

}
