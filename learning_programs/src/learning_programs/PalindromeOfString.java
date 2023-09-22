package learning_programs;

import java.util.*;

public class PalindromeOfString {

	public static void main(String args[]) {
		String original = "";
		String reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		original = sc.nextLine();
		for (int i = original.length() - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		if (original.equals(reverse)) 
			System.out.println("it is a palindrome");
		 else 
			System.out.println("it is not a paindrome");
		

	}

}
