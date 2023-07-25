class Butterfly{
	
	static String colour;
	static String type;
	int length;
	int flyingHeight;
	
	Butterfly(int length,int flyingHeight){
		System.out.println("invoking in the constructor");
		this.length=length;
		this.flyingHeight=flyingHeight;
		
	}
	
	static {
		colour="black";
		type="small";
		
		
	}
	static void printStatic(){
		System.out.println("invoking in the printStatic");
		System.out.println("colour of the Butterfly"+colour);
		System.out.println("type of the Butterfly"+type);
		
	}
	void printInstance(){
		System.out.println("invoking in the printInstance");
		System.out.println("length of the butterfly"+this.length);
		System.out.println("flyingHeight of the Butterfly"+this.flyingHeight);
		
		
		
	}
	
	
	
	
}