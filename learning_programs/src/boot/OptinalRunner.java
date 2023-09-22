package boot;

import java.util.Optional;

public class OptinalRunner {

	public static void main(String[] args) {

		
		Optional<String> optinal=OptinalUtil.getName("virat","kohli");
		if(optinal.isPresent()) {
			String ref=optinal.get();
			System.out.println(ref);
		}
		else {
			System.out.println("optinal is empty");
		}
	}

}
