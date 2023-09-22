package boot;

import java.util.Optional;

public class OptinalUtil {

	public static Optional<String> getName(String fname, String lname) {
		if (fname != null && lname != null) {
			System.out.println("fname and lname are not empty");
			return Optional.of(fname + " " + lname);
		} else {
			System.out.println("fname and lname are null");
			return Optional.empty();
		}

	}

}
