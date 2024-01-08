package learning_programs;

public class RemovingVowels {

	public static void main(String[] args) {

		String input=new String("good morning");
		
		String newString=input.replaceAll("[AEIOUaeiou]", "");
		
		System.out.println("before containing vowels:"+input);
		
		System.out.println("after removing vowels :"+newString);
		
		
		
	}

}
