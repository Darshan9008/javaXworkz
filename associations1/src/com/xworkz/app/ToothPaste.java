package com.xworkz.app;

public class ToothPaste {

	public String name;
	public String brand;
	public Company company=new Company("Patanjali","Baba Ramdev","India");
	public Ingredients[] ingredients;
	public ToothPaste(String name,String brand,Ingredients[] ingredients)
	{
		System.out.println("Invoking no-arg constructor in ToothPaste");
		this.name=name;
		this.brand=brand;
		this.ingredients=ingredients;
	}
	
	public void printInfo()
	{
		System.out.println("invoking printInfo in ToothPaste");
		System.out.println("Name of the ToothPaste is "+this.name);
		System.out.println("Brand of the ToothPaste "+this.brand);
		for(int i=0;i<this.ingredients.length;i++)
		{
			Ingredients ref=this.ingredients[i];
			ref.printInfo();; 
			
		}
		System.out.println("--------------------------------------------------------------------------------------");
		company.printInfo();
	

}
	
}
