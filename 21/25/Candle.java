class Candle{
	static String brand;
	static String colour;
	int price;
	int noOfCandle;
	
	Candle(int price,int noOfCandle){
		System.out.println("invoking in the constructor");
		this.price=price;
		this.noOfCandle=noOfCandle;
		
	}
	
	static{
		brand="colour";
		colour="blue";
	}
	
	static void printStatic()
	{
		System.out.println("Invoking printStatic in candle");
		System.out.println("The brand of helmet is "+brand);
		System.out.println("colour of helmet is "+colour);
	}
	
	void printInstance()
	{
		System.out.println("Invoking printInstance in candle ");
		System.out.println("colour of Helmet is "+this.price);
		System.out.println("noOfCandle of Helmet is "+this.noOfCandle);
	}
	
	
	
	
	
	
	
	
	
	
	
}