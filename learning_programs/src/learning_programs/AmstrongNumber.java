package learning_programs;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {

		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		int sum=0;
		int org_num=num;
		while(num!=0) {
			sum=sum+(num%10)*(num%10)*(num%10);
			num=num/10;
		}
		if(org_num==sum) {
			System.out.println("it is a amstrong number");
		}
		else {
			System.out.println("it is not a amstrong number");

		}
	}

}
