package learning_programs;
import java.util.*;

public class AlphabetCounting {

	public static void main(String[] args) {

		
		String input = "abc".toLowerCase();
	    final String alphabet = "abcdefghijklmnopqrstuvwxyz";
		for(int i=0; i < input.length(); i++){
		    System.out.print(alphabet.indexOf(input.charAt(i)+1));
		}
        	
		
	   }

     }
