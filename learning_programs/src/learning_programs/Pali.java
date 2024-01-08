package learning_programs;

import java.util.Scanner;

public class Pali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int original=1234;
		int reverse=0;
	    int org_num=original;
	    while(original!=0) {
	    	reverse=(reverse*10)+(original%10);
	    	original=original/10;
	    	
	    }
	    System.out.println(reverse);
	    if(org_num==reverse) {
	    	System.out.println("palindrome");
	    }
	    else {
	    	System.out.println("not a palindrome");
	    }
		
		
		
		
	}

}
