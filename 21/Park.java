class Park{
	
	int noOfTrees;
	int noOfBench;
	int length;
	String shape;
	String name;
	String location;
	String area;
	char size;
	boolean gate;
	
	Park(){
		System.out.println("invoking no arguement constructor");
		
	}
	Park(int noOfTrees){
		this.noOfTrees=noOfTrees;
	}
	Park(int noOfTrees,int noOfBench){
		this(noOfTrees);
		this.noOfBench=noOfBench;
		
	}
	
	Park(int noOfTrees,int noOfBench,int length){
		this(noOfTrees,noOfBench);
		this.length=length;
		
	}
	Park(int noOfTrees,int noOfBench,int length,String shape){
		this(noOfTrees,noOfBench,length);
		this.shape=shape;
		
	}
	Park(int noOfTrees,int noOfBench,int length,String shape,String name){
		this(noOfTrees,noOfBench,length,shape);
		this.name=name;
		
	}
	
	Park(int noOfTrees,int noOfBench,int length,String shape,String name,String location){
		this(noOfTrees,noOfBench,length,shape,name);
         this.location=location;		
	}
    Park(int noOfTrees,int noOfBench,int length,String shape,String name,String location,String area)
	{
		this(noOfTrees,noOfBench,length,shape,name,location);
		this.area=area;
		
	}

    Park(int noOfTrees,int noOfBench,int length,String shape,String name,String location,String area,char size){
		this(noOfTrees,noOfBench,length,shape,name,location,area);
		this.size=size;
	}

     Park(int noOfTrees,int noOfBench,int length,String shape,String name,String location,String area,char size,boolean gate){
		 this(noOfTrees,noOfBench,length,shape,name,location,area,size);
		 this.gate=gate;
	 }	
	
	
	
}