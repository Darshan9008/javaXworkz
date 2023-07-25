class Brick{
	
	static String brand;
	static String type;
	int price;
    String colour;
	
	Brick(int price,String colour){
		System.out.println("invoking the constructor");
		this.price=price;
		this.colour=colour;		
	}
	
	static{
		brand="red brick";
		type="mud brick";
		
	}
	
	static void printStatic(){
		System.out.println("brand of the brick"+brand);
		System.out.println("type of the brick"+type);
		
		
	}
	void printInstance(){
		System.out.println("price of the brick"+this.price);
		System.out.println("colour of the brick"+this.colour);
		
		
	}
	
	
	
	
	
	
}