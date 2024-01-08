package learning_programs;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

public class FrequencyUsingSTreams {

	public static void main(String[] args) {


		String input="good morning good night";
		Map<Integer,String> countMap=Arrays.stream(input.split("")).collect(groupingBy(Function.identity(),counting()));
	}

}
