class Soil{
	static String type;
	static String quality;
	int density;
	int temprature;
	
	Soil(int density,int temprature){
		System.out.println("invoking in the constructor");
		this.density=density;
		this.temprature=temprature;
	}
	static{
		type="red soil";
		quality="good";
			
	}
	static void printStatic(){
		System.out.println("invoking in the printStatic");
		System.out.println("type of the soil:"+type);
		System.out.println("quality of the soil:"+quality);
		
	}
	void printInstance(){
		System.out.println("invoking in the printInstance");
		System.out.println("density of the soil:"+this.density);
		System.out.println("temprature of the soil:"+this.temprature);
	}
	
	
	
	
}