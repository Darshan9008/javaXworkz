package com.xworkz.classs;

public class Test extends Example1 {
	public void method() {
		System.out.println(name);
		run();
	}

	public static void main(String[] info) {
		Test T = new Test();
		T.method();
		Test.run();
		Example1.run();

	}

}
