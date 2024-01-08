package com.xworkz.collection.app;
package com.xworkz.collection.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.collection.dto.PizzaDTO;
public class PizzaRunner {

	public static void main(String[] args) {
		
		
				PizzaDTO pizza = new PizzaDTO("onion Pizza", 250.8d, "medium");
				PizzaDTO pizza1 = new PizzaDTO("Tomoto Pizza", 220.9d, "Large");
				PizzaDTO pizza2 = new PizzaDTO("Non-veg", 550.4d, "Small");
				PizzaDTO pizza3 = new PizzaDTO("Non-veg", 550.4d, "Small");
				Collection<PizzaDTO> collection=new HashSet<PizzaDTO>();
				collection.add(pizza);
				collection.add(pizza3);
				collection.add(pizza2);
				collection.add(pizza1);
				System.out.println(collection.size());
				
			}
		
		
	}


