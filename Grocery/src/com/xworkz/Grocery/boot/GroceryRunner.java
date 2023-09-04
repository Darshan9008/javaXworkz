package com.xworkz.Grocery.boot;
import com.xworkz.Grocery.app.*;

public class GroceryRunner {

	public static void main(String[] args) {

		GroceryRepository groceryRepo=new GroceryRepositoryImpl();
		
		groceryRepo.save("egg");
		groceryRepo.save("chicken");
		groceryRepo.save("vegetables");
		groceryRepo.save("milk");
		groceryRepo.save("masala");
		groceryRepo.save("chips");
		groceryRepo.save("chocolates");
		groceryRepo.save("biscuits");
		groceryRepo.save("cadbuaries");
		groceryRepo.save("ice creams");
		
		groceryRepo.save("vade");


		
		



		




		
		
		
		
	}

}
