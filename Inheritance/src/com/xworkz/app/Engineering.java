package com.xworkz.app;

public class Engineering extends College{
  public int branch;
  
  public Engineering(String collegeName,int branch)
  {
	  super(collegeName);
	  this.branch=branch;
	  
  }
  
  public void Studies() {
	  System.out.println("invoking the studies method");
  }
}
