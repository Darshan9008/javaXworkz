package learning_programs;

public class CollegeImpl implements College {

	@Override
	public void run(String name) {

		System.out.println("invoking run in collegeImpl");

	}

	@Override
	public void running() {
		System.out.println("invoking running in college impl");
		College.super.running();
	}

}
