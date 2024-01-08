package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapAadhar {

	public static void main(String[] args) {

		Map<String, String> aadhar = new HashMap<String, String>();

		System.out.println(aadhar.isEmpty());

		aadhar.put("Darshan", "12345678");
		aadhar.put("venu", "345678");
		aadhar.put("chandan", "567890");
		aadhar.put("rohan", "2345678");
		aadhar.put("virat", "87654");
		aadhar.put("sachin", "9876543");
		aadhar.put("shami", "568545678");
		aadhar.put("ashwin", "345678");
		aadhar.put("dhawan", "4567389");
		aadhar.put("gill", "345678");
		aadhar.put("iyer", "876556789");

		Set<String> names = aadhar.keySet();
		names.forEach(f -> System.out.println(f));

		System.out.println("*********************************");
		Collection<String> numbers = aadhar.values();
		numbers.forEach(d -> System.out.println(d));

	}

}
