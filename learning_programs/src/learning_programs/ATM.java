package learning_programs;

import java.util.Scanner;

public class ATM {
	
	public static void main(String[] args) {
		int balance=10000,withdraw,deposit;
		
		
		System.out.println("invoking main method in ATM");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("select 1 for withdraw");
		System.out.println("select 2 for balance check");
		System.out.println("select 3 for deposit");
		
		System.out.println("enter choice");
		int choice=sc.nextInt();
		switch(choice) {
		
		
		case 1: 
			 System.out.println("enter the withdraw amount");

			 withdraw=sc.nextInt();
			 if(withdraw<balance) {
				 balance=balance-withdraw;
				 System.out.println("balance"+balance);
			 }
			 else 
			 {
				 System.out.println("invalid balance");
			 }
			 break;
			 
		case 2:
			System.out.println("balance="+balance);
			break;
			
		case 3:
			System.out.println("enter the deposit amount");
			deposit=sc.nextInt();
			deposit=deposit+balance;
			System.out.println("total balance="+deposit);
			break;
		
		
		}
		
		
		
		
		
	}

}
