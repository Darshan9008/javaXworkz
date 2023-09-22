package learning_programs;
import java.util.*;


public class AnotherExPalindromOfString {

	public static void main(String[] args) {

		String original="darshan";
		String reverse="";
		for(int i=original.length()-1;i>=0;i--)
			reverse=reverse+original.charAt(i);
		if(original.equals(reverse))
			System.out.println("it is a palindrome");
		else
		System.err.println("it is not a palindrome");
		
		
	}

}
