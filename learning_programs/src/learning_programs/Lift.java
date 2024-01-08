package learning_programs;

import java.util.Scanner;

public class Lift {
	static int n=4;
	
	public static void goUp(int choice) {
		
		
		System.out.println("enter the floor which user want to go");
		if(choice==n) {
			System.out.println("you are at the top floor");
		}
		else {
		for(int i=1;i<choice;i++) {
			if(choice<n) {
			}}
			System.out.println("you arrived at the floor  "+choice);
		}
		
		
			
		
	}
	
	public static void main(String[] args) {
		 
		
		goUp(3);
	}
	

}
