package learning_programs;

public class PrimeOrNot {

	public static void main(String[] args) {

		System.out.println("running main method");
		int n=12;
		boolean prime=true;
		
		
		for(int i=2;i<n;i++) {// i should start from 2 because index 0 and 1 does not match for the prime numbers
			if(n%i==0) {   // n should divide completely and reminder should be zero
				prime=false;
				break;
			}
		}
		System.out.println("n is a prime number  "+prime);
	}

}
