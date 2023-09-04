package learning_programs;

public class SumOfDigit {
	
	public static void sumOfAllDigit(int inputNumber) {
		//input is copying 
		int copy=inputNumber;
		int sum=0;
		
		
		while(copy!=0) {
			
			//checking the condition
			int lastDigit=copy%10;
			//lastdigit function
			sum=sum+lastDigit;
			
			//after the last digit copying the number by dividing by 10
			copy=copy/10;
			
		}
		
		System.out.println("sum of digit"+inputNumber+"is="+sum);
		
	}

	public static void main(String[] args) {
		
       SumOfDigit ref=new SumOfDigit();
        sumOfAllDigit(2345);
	}

}
