class Power{
	static int watt;
	static int generatedPower;
	String generatedStation;
	String location;
	
	Power(String generatedStation,String location){
		System.out.println("invoking the constructor");
		this.generatedStation=generatedStation;
		this.location=location;		
	}
	
	static{
		watt=30;
		generatedPower=89;
		
		
	}
	static void printStatic(){
		System.out.println("invoking in the printStatic");
		System.out.println("watt in the power"+watt);
		System.out.println("generatedPower in the power"+generatedPower);
		
	}
	
	void printInstance(){
		System.out.println("invoking in the printInstance");
		System.out.println("generatedStation for the power"+this.generatedStation);
		System.out.println("location where power generated"+this.location);
		
	}
	
	
}