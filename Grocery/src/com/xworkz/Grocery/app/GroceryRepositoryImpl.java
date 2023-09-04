package com.xworkz.Grocery.app;

public class GroceryRepositoryImpl implements GroceryRepository {
	
	String[] groceries=new String[TOTAL_ITEMS];
	private int position;
	
	
	@Override
	public void save(String grocery) {
		System.out.println("invoking save() in groceryrepositoryimpl");
		
		if(this.position<TOTAL_ITEMS) {
			
			this.groceries[position]=grocery;
			System.out.println("elements added "+grocery+"  at the position  "+position);
			this.position++;
			
		}
		else 
		{
			System.out.println("data is more than given position");
		}
		
		

	
	
	}

}
