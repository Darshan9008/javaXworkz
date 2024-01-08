package learning_programs;
import java.util.*;


public class AnotherExPalindromOfString {

	public static void main(String[] args) {

		String original="dad";
		String reverse="";
		for(int i=original.length()-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
		}
		if(original.equals(reverse))
			System.out.println(original+"  : it is a palindrome");
		else
		System.err.println(original+" :  it is not a palindrome");
		
		
	}

}
