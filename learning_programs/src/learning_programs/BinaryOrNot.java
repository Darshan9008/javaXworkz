package learning_programs;

import java.util.Collections;

public class BinaryOrNot {
	
	
	public static void binary(int number ) {
		boolean isBinary=true;
		int number1=number;

		while(number1!=0) {
			int temp=number1%10;

		if(temp>1) {
			isBinary=false;
			break;
		}
		else {
			number1=number1/10;
		}
		}
		if(isBinary) {
		System.out.println(number+" :is binary");
		}
		else {
			System.out.println(number+": not a binary no");
		}
		
	}

	public static void main(String[] args) {
		
		BinaryOrNot.binary(101010);
		BinaryOrNot.binary(4567890);

		


		
		
		
	}

}
