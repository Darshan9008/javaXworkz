package com.presentation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayEx {

	public static void main(String[] args) {


		ArrayList<Integer> array=new ArrayList<Integer>();
		array.add(65);
		array.add(87);

		array.add(12);

		array.add(45);

		array.add(05);

		Object[] array1=array.toArray();
		Arrays.sort(array1);
		for(int i=array1.length-1;i>=0;i--) {
			System.out.println(array1[i]);
		}
		
		
		System.out.println("******************");
		
		
		Comparator<Integer> cmp=Collections.reverseOrder();
		Collections.sort(array,cmp);
		array.forEach(p->System.out.println(p));
		
		
		Double num=20.56;
		System.out.println(Math.round(num));
		
		Double num1=67.6;
		Double num2=65.03;
		BigDecimal big1=new BigDecimal(num1);
		BigDecimal big2=new BigDecimal(num2);
		
		System.out.println(big1.subtract(big2));
		
		

		ArrayList<Integer> array11=new ArrayList<Integer>();
		array11.add(65);
		array11.add(87);

		array11.add(12);

		array11.add(45);

		array11.add(05);
		
		Collections.sort(array11);

		System.out.println(array11);
		
		
		
		
		
		
		
		
		
		
		
	}

}
