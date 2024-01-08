package learning_programs.pattern;

public class PyramidTry {

	public static void main(String[] args) {
		
		int i, j, row = 6;
		//Outer loop work for rows  
		for (i=0; i<row; i++)   
		{  
		//inner loop work for space      
		for (j=row-i; j>=2; j--)   
		{  
		//prints space between two stars  
		System.out.print("#");     // # is equal to (" ")
		}   
		//inner loop for columns  
		for (j=0; j<=i; j++ )   
		{   
		//prints star      
		System.out.print("* ");   
		}   
		System.out.println();
		}
		
	}

}
