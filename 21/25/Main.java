class Main{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in Main");
		
		Helmet h1=new Helmet("Black",800);
		h1.printStatic();
		h1.printInstance();
		
		Candle c1=new Candle(12,60);
		c1.printInstance();
		c1.printStatic();
		
		Brick b1=new Brick(21,"red");
		b1.printInstance();
		b1.printStatic();
		
		
		Soil s1=new Soil(31,76);
		s1.printInstance();
		s1.printStatic();
		
		
		Butterfly b2=new Butterfly(44,55);
		b2.printInstance();
		b2.printStatic();
		
		Power p1=new Power("BRP","shivamogga");
		p1.printInstance();
		p1.printStatic();
		
		
		
		
		
		
		
		
		}
}		
		