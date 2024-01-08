package learning_programs;
import java.util.HashMap;

public class FrequencyOfStringUsingHashmapOwn {
	
	
	public static void Frequency(String inputString) {
		
		HashMap<Character, Integer> characterCountMap=new HashMap<Character, Integer>();
		
		String newInputString=inputString.toLowerCase();
		
		char string[]=newInputString.toCharArray();
		
		for(char c:string) {
			
			if(characterCountMap.containsKey(c)) {
				
				characterCountMap.put(c, characterCountMap.get(c)+1 );
				
			}
			
			else
			{
				characterCountMap.put(c, 1);
			}
		}
		
		System.out.println(newInputString+" = "+characterCountMap);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frequency("good morning Good Night");

	}

}
