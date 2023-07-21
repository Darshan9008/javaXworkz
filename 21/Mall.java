class Mall{
	
	int price;
	int floor;
	int noOfBuilding;
	String location;
	String direction;
	char size;
	boolean parking;
	
	Mall(){
		System.out.println("invoking no arguement constructor");
	}
	
	Mall(int price){
		
	this.price=price;
	
	}
	Mall(int price,int floor){
		this(price);
		this.floor=floor;
	}
	Mall(int price,int floor,int noOfBuilding){
		
		this(price,floor);
		this.noOfBuilding=noOfBuilding;
	}
	Mall(int price,int floor,int noOfBuilding,String location){
		this(price,floor,noOfBuilding);
		this.location=location;
	}
	Mall(int price,int floor,int noOfBuilding,String location,String direction){
		this(price,floor,noOfBuilding,location);
		this.direction=direction;	
		
	}
	Mall(int price,int floor,int noOfBuilding,String location,String direction,char size){
		this(price,floor,noOfBuilding,location,direction);
		this.size=size;
	}
	
	
	Mall(int price,int floor,int noOfBuilding,String location,String direction,char size,boolean parking){
		this(price,floor,noOfBuilding,location,direction,size);
		this.parking=parking;
		
	}	
	
	
}