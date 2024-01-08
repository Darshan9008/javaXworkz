package com.xworkz.collection.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

import com.xworkz.collection.dto.IceCreamDTO;

public class IceCream {

	public static void main(String[] args) {


		IceCreamDTO dto=new IceCreamDTO("vanilla", 150, LocalDate.of(2023, 05, 06), "cone");
		IceCreamDTO dto1=new IceCreamDTO("strawberry", 250, LocalDate.of(2023, 07, 15), "cup");
		IceCreamDTO dto2=new IceCreamDTO("mango", 100, LocalDate.of(2023, 10, 17), "candy");
		IceCreamDTO dto3=new IceCreamDTO("butterscotch", 350, LocalDate.of(2023, 8, 16), "cone");
		IceCreamDTO dto4=new IceCreamDTO("pista", 270, LocalDate.of(2023, 9, 20), "family-pack");
		
		Stream.of(dto,dto1,dto2,dto3,dto4).sorted().forEach(p->System.out.println(p));

		System.out.println("---------------------------------------");

		
		Comparator<IceCreamDTO> com=(t1, t2) -> Integer.valueOf(t1.getPrice()).compareTo(t2.getPrice());
		
		
		
		Stream.of(dto,dto1,dto2,dto3,dto4).sorted(com).forEach(s->System.out.println(s));
		
		System.out.println("---------------------------------------");

		Comparator<IceCreamDTO> com4 = (t1, t2) -> Integer.valueOf(t1.getPrice()).compareTo(t2.getPrice());


		
		
		
		Comparator<IceCreamDTO> com1=(s1, s2) ->s1.getManfDate().compareTo(s2.getManfDate());
		
		Comparator<IceCreamDTO> com2=com1.thenComparing(com4);
		Stream.of(dto,dto1,dto2,dto3,dto4).sorted(com2).forEach(t->System.out.println(t));
		
		
		
		ArrayList<String> ref=new ArrayList<String>();
		ref.add("darshan");
		ref.add("venu");
		ref.add("chandan");
		ref.add("veeresh");
		ref.add("yellu");
		
		Collections.sort(ref);
		System.out.println(ref.);
		System.out.println("***********************");

		
		
		ArrayList<Integer> ref1=new ArrayList<Integer>();
		ref1.add(76);
		ref1.add(12);
		ref1.add(99);
		ref1.add(05);
		ref1.add(54);
		
		Object[] ref2=ref1.toArray();
		Arrays.sort(ref2);
		for(int i=ref2.length-1;i>=0;i--) {
			System.out.println(ref2[i]);
		}
		
		
		
		
		
		System.out.println(ref1);
		
		
		
		
		
		
		 


			
			
		
		
		



		
	}

}
