package learning_programs;

public class PrimeOrNot {

	public static void main(String[] args) {

		int num=4;
		int count =0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;               //it is used to count the no of divisor and 1 and itself if it is 
				                        //more than 2 then it is not a prime number
			}
		}
		if(count==2) {
			System.out.println("it is a prime ");
		}
		else {
			System.out.println("it not a prime number");
		}
		
		
	}

}
