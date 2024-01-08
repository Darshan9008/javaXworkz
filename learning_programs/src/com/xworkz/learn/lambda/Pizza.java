package com.xworkz.learn.lambda;

@FunctionalInterface
public interface Pizza {

	int run(String name);

	default void check() {

	}

}
