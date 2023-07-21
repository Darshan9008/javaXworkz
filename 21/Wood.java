class Wood{
	
	int length;
	int price;
	String type;
	String purpose;
	String colour;
	
	Wood(){
		System.out.println("invoking the no arguement constructor");
		
	}
	
	Wood(int length){
		this.length=length;
	}
	
	Wood(int length,int price){
		this(length);
		this.price=price;
		
	}
	Wood(int length,int price,String type){
		
		this(length,price);
		this.type=type;
		
	}
	Wood(int length,int price,String type,String purpose){
		this(length,price,type);
		this.purpose=purpose;
	}
	Wood(int length,int price,String type,String purpose,String colour){
		this(length,price,type,purpose);
		this.colour=colour;
		
	}
	
	
	
}