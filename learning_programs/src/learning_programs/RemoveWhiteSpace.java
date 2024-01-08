package learning_programs;

public class RemoveWhiteSpace {

	public static void main(String[] args) {

		String str="one two three four five six";
		
		String ref=str.replaceAll("\\s", "");
		
		System.out.println("removing white spaces  : "+ref);
		
		
	}

}
