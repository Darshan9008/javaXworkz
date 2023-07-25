class Helmet{
	
	static String brand;
	static String type;
	String color;
	double price;
	
	Helmet(String color,double price)
	{
		System.out.println("Invoking String price constructor in Helmet");
		this.color=color;
		this.price=price;
	}
	
	static{
		brand="Rapido";
		type="Full";
		
	}
	
	static void printStatic()
	{
		System.out.println("Invoking printStatic in Helmet");
		System.out.println("The brand of helmet is "+brand);
		System.out.println("Type of helmet is "+type);
	}
	
	void printInstance()
	{
		System.out.println("Invoking printInstance in Helmet ");
		System.out.println("Color of Helmet is "+this.color);
		System.out.println("Price of Helmet is "+this.price);
	}
}