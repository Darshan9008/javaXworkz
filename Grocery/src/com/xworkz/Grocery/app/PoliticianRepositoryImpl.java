package com.xworkz.Grocery.app;

public class PoliticianRepositoryImpl implements PoliticianRepository {
	
	String[] peopleVotes=new String[TOTAL_VOTES];
	public int position;
	
	
	@Override
	public void rule(String booth) {
       System.out.println("invoking rule() in PoliticianRepositoryImpl");
       
       if(this.position<TOTAL_VOTES) {
    	   
    	   this.peopleVotes[position]=booth;
    	   System.out.println("votes added"+booth+"at the position"+position);
    	   this.position++;
       }
       
       else
       {
    	   System.out.println("memory is full");
       }
       
       
       
       
       
	}
	
	

}
