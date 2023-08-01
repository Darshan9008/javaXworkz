package com.xworkz.boot;
import com.xworkz.app.Ingredients;
import com.xworkz.app.ToothPaste;


public class ToothPasteKiller {

	public static void main(String[] args) {
		
		
		
System.out.println("Invoking main in ToothPasteKiller");
		
		Ingredients ingredients=new Ingredients("clove",250,25.9);
		Ingredients ingredients1=new Ingredients("salt",50,35);
		Ingredients ingredients2=new Ingredients("mint",25,20);
		Ingredients ingredients3=new Ingredients("charcoal",35,40);
		Ingredients ingredients4=new Ingredients("Tulsi",45,90);
		
		System.out.println("--------------------------------------------------------------------------------------");
		Ingredients[] ingredientsRef={ingredients,ingredients1,ingredients2,ingredients3,ingredients4};
		
		
		//System.out.println("--------------------------------------------------------------------------------------");
		ToothPaste toothpaste=new ToothPaste("Patanjali","Dantkanti",ingredientsRef);

		System.out.println("--------------------------------------------------------------------------------------");
		toothpaste.printInfo();
		System.out.println("--------------------------------------------------------------------------------------");
	
		

	}

}
