package learning_programs;

public class PalindromeOfNumber {

	public static void main(String[] args) {

		System.out.println("running main method");
		int num=313;
		int rev=0;
		int org_num=num;
		while(num!=0) {
			rev=(rev*10)+num%10;
			num=num/10;	
			
		}
		if(org_num==rev) {
			System.out.println(org_num+" is a palindrome");
		}
		else {
			System.out.println(org_num+" is  not a palindrome");

		}
		
			
	}

}
