package com.xworkz.collection.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.ProductDTO;

public class Product {

	public static void main(String[] args) {

		ProductDTO product1 = new ProductDTO(1, 1, 12345, 98765, "Smartphone", "TechCo", "High-performance smartphone",
				"TechCo Packaging", "Charger Earphones", "Electronics", "B01ABCDEF", "USA", "Yes", 4.5f, 80, 40, 20, 10,
				5, 5, 599.99d, 10d, 0.5d, 1.5d, false, true, LocalDate.of(2022, 10, 15), LocalDate.of(2024, 10, 15),
				LocalDate.of(2022, 10, 1), LocalDate.of(2022, 10, 5), LocalDate.of(2022, 11, 1));

		ProductDTO product2 = new ProductDTO(2, 5, 56789, 87654, "Laptop", "TechGadgets",
				"Powerful laptop for work and gaming", "TechGadgets Packaging", "Laptop, Charger", "Electronics",
				"B02ABCDEF", "China", "Yes", 4.8f, 25, 120, 20, 5, 10, 1299.99f, 15, 1.5d, 1.8d, 2.0d, false, true,
				LocalDate.of(2022, 8, 20), LocalDate.of(2024, 8, 20), LocalDate.of(2022, 8, 1),
				LocalDate.of(2022, 8, 5), LocalDate.of(2022, 9, 1));

		ProductDTO product3 = new ProductDTO(3, 7, 98765, 54321, "Tablet", "TechTabs", "Compact tablet for on-the-go",
				"TechTabs Packaging", "Tablet, Charger", "Electronics", "B03ABCDEF", "Japan", "No", 4.2f, 100, 40, 30,
				20, 10, 5, 299.99f, 5, 0.8d, 1.0d, false, true, LocalDate.of(2022, 12, 10), LocalDate.of(2024, 12, 10),
				LocalDate.of(2022, 12, 1), LocalDate.of(2022, 12, 5), LocalDate.of(2023, 1, 1));

		ProductDTO product4 = new ProductDTO(4, 3, 98765, 12345, "Smartwatch", "TechWear",
				"Fitness and health tracking smartwatch", "TechWear Packaging", "Smartwatch, Charging Cable",
				"Wearables", "B04ABCDEF", "Germany", "Yes", 4.0f, 80, 30, 20, 10, 10, 10, 149.99, 5, 0.2, 0.8, false,
				true, LocalDate.of(2022, 5, 25), LocalDate.of(2024, 5, 25), LocalDate.of(2022, 5, 1),
				LocalDate.of(2022, 5, 5), LocalDate.of(2022, 6, 1));

		ProductDTO product5 = new ProductDTO(5, 2, 76543, 23456, "Bluetooth Speaker", "TechAudio",
				"Portable wireless speaker with rich sound", "TechAudio Packaging", "Speaker, USB Cable", "Audio",
				"B05ABCDEF", "South Korea", "No", 4.5f, 50, 20, 10, 10, 10, 10, 79.99, 10, 0.5, 1.0, false, true,
				LocalDate.of(2022, 9, 18), LocalDate.of(2024, 9, 18), LocalDate.of(2022, 9, 1),
				LocalDate.of(2022, 9, 5), LocalDate.of(2022, 10, 1));

		ProductDTO product6 = new ProductDTO(6, 4, 54321, 34567, "Coffee Maker", "TechBrew",
				"Automatic drip coffee maker for home use", "TechBrew Packaging", "Coffee Maker, Carafe", "Appliances",
				"B06ABCDEF", "Italy", "Yes", 4.6f, 60, 30, 20, 10, 5, 2, 129.99, 10, 2.0, 1.5, false, true,
				LocalDate.of(2023, 3, 5), LocalDate.of(2025, 3, 5), LocalDate.of(2023, 3, 1), LocalDate.of(2023, 3, 5),
				LocalDate.of(2023, 4, 1));

		ProductDTO product7 = new ProductDTO(7, 2, 87654, 65432, "Wireless Headphones", "TechAudio",
				"Over-ear wireless headphones for immersive sound", "TechAudio Packaging", "Headphones, Charging Cable",
				"Audio", "B07ABCDEF", "USA", "No", 4.6f, 30, 10, 10, 5, 5, 10, 129.99, 5, 0.3, 1.0, false, true,
				LocalDate.of(2023, 2, 5), LocalDate.of(2025, 2, 5), LocalDate.of(2023, 2, 1), LocalDate.of(2023, 2, 5),
				LocalDate.of(2023, 3, 1));

		ProductDTO product8 = new ProductDTO(8, 6, 23456, 45678, "Digital Camera", "TechCapture",
				"High-resolution digital camera for photography enthusiasts", "TechCapture Packaging",
				"Camera, Lens, Memory Card", "Electronics", "B08ABCDEF", "Japan", "Yes", 4.8f, 80, 50, 20, 5, 5, 10,
				599.99, 15, 0.7, 2.0, false, true, LocalDate.of(2022, 7, 15), LocalDate.of(2024, 7, 15),
				LocalDate.of(2022, 7, 1), LocalDate.of(2022, 7, 5), LocalDate.of(2022, 8, 1));

		ProductDTO product9 = new ProductDTO(9, 150, 34567, 56789, "Smart LED TV", "TechVision",
				"Ultra HD smart LED TV for cinematic experience", "TechVision Packaging", "TV, Remote, Stand",
				"Electronics", "B09ABCDEF", "South Korea", "Yes", 4.7f, 120, 80, 30, 10, 8, 9, 899.99, 20, 15.0, 2.0,
				false, true, LocalDate.of(2022, 3, 28), LocalDate.of(2024, 3, 28), LocalDate.of(2022, 3, 1),
				LocalDate.of(2022, 3, 5), LocalDate.of(2022, 4, 1));

		ProductDTO product10 = new ProductDTO(10, 200, 45678, 78901, "Smart Refrigerator", "TechCool",
				"Smart refrigerator with advanced cooling technology", "TechCool Packaging",
				"Refrigerator, User Manual", "Appliances", "B10ABCDEF", "Germany", "Yes", 4.5f, 180, 100, 50, 20, 10,
				10, 1499.99, 25, 100.0, 3.0, false, true, LocalDate.of(2022, 1, 10), LocalDate.of(2024, 1, 10),
				LocalDate.of(2022, 1, 1), LocalDate.of(2022, 1, 5), LocalDate.of(2022, 2, 1));

		Collection<ProductDTO> ref = new ArrayList<ProductDTO>();

		ref.add(product1);
		ref.add(product2);
		ref.add(product3);
		ref.add(product4);
		ref.add(product5);
		ref.add(product6);
		ref.add(product7);
		ref.add(product8);
		ref.add(product9);
		ref.add(product10);

		/*
		 * public ProductDTO(int id, int quantity, int modelNo, int serialNo, String
		 * name, String company, String discription, String packer, String included,
		 * String genericName, String asin, String countryOfOrigin, String
		 * primeDelivery, float rating, float peopleRated, float peopleRatedFive, float
		 * peopleRatedFour, float peopleRatedThree, float peopleRatedTwo, float
		 * peopleRatedOne, double price, double discount, double itemWeight, double
		 * warranty, boolean damaged, boolean returnable, LocalDate manfDate, LocalDate
		 * expiryDate, LocalDate dateFirstAvailable, LocalDate deliveryExpectedDate,
		 * LocalDate returnBy)
		 */
		ref.stream().sorted().forEach(s -> System.out.println(s));

		System.out.println("------------------------------------------------");

		Comparator<ProductDTO> com1 = (o1, o2) -> Integer.valueOf(o1.getQuantity()).compareTo(o2.getQuantity());
		ref.stream().sorted(com1).forEach(s -> System.out.println(s));
		System.out.println("------------------------------------------------");

		Comparator<ProductDTO> com2 = (o1, o2) -> Integer.valueOf(o2.getQuantity()).compareTo(o1.getQuantity());
		ref.stream().sorted(com2).forEach(s -> System.out.println(s));

		System.out.println("------------------------------------------------");

		Comparator<ProductDTO> com4 = (o1, o2) -> Integer.valueOf(o1.getModelNo()).compareTo(o2.getModelNo());
		ref.stream().sorted(com4).forEach(s -> System.out.println(s));

		System.out.println("------------------------------------------------");

		Comparator<ProductDTO> com3 = (o1, o2) -> Integer.valueOf(o2.getModelNo()).compareTo(o1.getModelNo());
		ref.stream().sorted(com3).forEach(s -> System.out.println(s));

		System.out.println("------------------------------------------------");

		Comparator<ProductDTO> com5 = (o1, o2) -> Integer.valueOf(o1.getSerialNo()).compareTo(o2.getSerialNo());
		ref.stream().sorted(com5).forEach(s -> System.out.println(s));

		System.out.println("------------------------------------------------");

		Comparator<ProductDTO> com6 = (o1, o2) -> Integer.valueOf(o2.getSerialNo()).compareTo(o1.getSerialNo());
		ref.stream().sorted(com6).forEach(s -> System.out.println(s));

		System.out.println("------------------------------------------------");
		Comparator<ProductDTO> com7 = (o1, o2) -> o1.getName().compareTo(o2.getName());
		ref.stream().sorted(com7).forEach(s -> System.out.println(s));

		System.out.println("------------------------------------------------");
		Comparator<ProductDTO> com8 = (o1, o2) -> o2.getName().compareTo(o1.getName());
		ref.stream().sorted(com8).forEach(s -> System.out.println(s));

		System.out.println("------------------------------------------------");
		Comparator<ProductDTO> com9 = (o1, o2) -> o1.getCompany().compareTo(o2.getCompany());
		ref.stream().sorted(com9).forEach(s -> System.out.println(s));
		System.out.println("------------------------------------------------");
		Comparator<ProductDTO> com10 = (o1, o2) -> o2.getCompany().compareTo(o1.getCompany());
		ref.stream().sorted(com10).forEach(s -> System.out.println(s));

		System.out.println("************************************");
		Comparator<ProductDTO> com11 = (o1, o2) -> o1.getDiscription().compareTo(o2.getDiscription());
		ref.stream().sorted(com11).forEach(s -> System.out.println(s));

		System.out.println("************************************");
		Comparator<ProductDTO> com12 = (o1, o2) -> o2.getDiscription().compareTo(o1.getDiscription());
		ref.stream().sorted(com12).forEach(s -> System.out.println(s));

		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		Comparator<ProductDTO> com13 = (o1, o2) -> o1.getPacker().compareTo(o2.getPacker());
		ref.stream().sorted(com13).forEach(s -> System.out.println(s));
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		Comparator<ProductDTO> com14 = (o1, o2) -> o2.getPacker().compareTo(o1.getPacker());
		ref.stream().sorted(com14).forEach(s -> System.out.println(s));

		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		Comparator<ProductDTO> com15 = (o1, o2) -> o1.getIncluded().compareTo(o2.getIncluded());
		ref.stream().sorted(com15).forEach(s -> System.out.println(s));

		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		Comparator<ProductDTO> com16 = (o1, o2) -> o2.getIncluded().compareTo(o1.getIncluded());
		ref.stream().sorted(com16).forEach(s -> System.out.println(s));

		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		Comparator<ProductDTO> com17 = (o1, o2) -> o1.getGenericName().compareTo(o2.getGenericName());
		ref.stream().sorted(com17).forEach(s -> System.out.println(s));

		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		Comparator<ProductDTO> com18 = (o1, o2) -> o2.getGenericName().compareTo(o1.getGenericName());
		ref.stream().sorted(com18).forEach(s -> System.out.println(s));

		System.out.println("*********************************************");
		Comparator<ProductDTO> com19 = (o1, o2) -> o1.getCountryOfOrigin().compareTo(o2.getCountryOfOrigin());
		ref.stream().sorted(com19).forEach(x -> System.out.println(x));

		System.out.println("*********************************************");
		Comparator<ProductDTO> com20 = (o1, o2) -> o2.getCountryOfOrigin().compareTo(o1.getCountryOfOrigin());
		ref.stream().sorted(com20).forEach(x -> System.out.println(x));

		System.out.println("*********************************************");
		Comparator<ProductDTO> com21 = (o1, o2) -> o1.getPrimeDelivery().compareTo(o2.getPrimeDelivery());
		ref.stream().sorted(com21).forEach(x -> System.out.println(x));

		System.out.println("*********************************************");
		Comparator<ProductDTO> com22 = (o1, o2) -> o2.getPrimeDelivery().compareTo(o1.getPrimeDelivery());
		ref.stream().sorted(com22).forEach(x -> System.out.println(x));

		System.out.println("*********************************************");

		Comparator<ProductDTO> com23 = (o1, o2) -> Float.valueOf(o1.getRating()).compareTo(o2.getRating());
		ref.stream().sorted(com23).forEach(s -> System.out.println(s));

		System.out.println("*********************************************");

		Comparator<ProductDTO> com24 = (o1, o2) -> Float.valueOf(o2.getRating()).compareTo(o1.getRating());
		ref.stream().sorted(com24).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");

		Comparator<ProductDTO> com25 = (o1, o2) -> Float.valueOf(o1.getPeopleRated()).compareTo(o2.getPeopleRated());
		ref.stream().sorted(com25).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");

		Comparator<ProductDTO> com26 = (o1, o2) -> Float.valueOf(o2.getPeopleRated()).compareTo(o1.getPeopleRated());
		ref.stream().sorted(com26).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");

		Comparator<ProductDTO> com27= (o1, o2) -> Float.valueOf(o1.getPeopleRatedFive()).compareTo(o2.getPeopleRatedFive());
		ref.stream().sorted(com27).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");

		Comparator<ProductDTO> com28= (o1, o2) -> Float.valueOf(o2.getPeopleRatedFive()).compareTo(o1.getPeopleRatedFive());
		ref.stream().sorted(com28).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");

		Comparator<ProductDTO> com29= (o1, o2) -> Float.valueOf(o1.getPeopleRatedFour()).compareTo(o2.getPeopleRatedFour());
		ref.stream().sorted(com29).forEach(s -> System.out.println(s));
		

		System.out.println("*********************************************");

		Comparator<ProductDTO> com30= (o1, o2) -> Float.valueOf(o2.getPeopleRatedFour()).compareTo(o1.getPeopleRatedFour());
		ref.stream().sorted(com30).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");

		Comparator<ProductDTO> com31= (o1, o2) -> Float.valueOf(o1.getPeopleRatedThree()).compareTo(o2.getPeopleRatedThree());
		ref.stream().sorted(com31).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");

		Comparator<ProductDTO> com32= (o1, o2) -> Float.valueOf(o2.getPeopleRatedThree()).compareTo(o1.getPeopleRatedThree());
		ref.stream().sorted(com32).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");

		Comparator<ProductDTO> com33= (o1, o2) -> Double.valueOf(o1.getDiscount()).compareTo(o2.getDiscount());
		ref.stream().sorted(com33).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");

		Comparator<ProductDTO> com34= (o1, o2) -> Double.valueOf(o2.getDiscount()).compareTo(o1.getDiscount());
		ref.stream().sorted(com34).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");

		Comparator<ProductDTO> com35= (o1, o2) -> Double.valueOf(o1.getPrice()).compareTo(o2.getPrice());
		ref.stream().sorted(com35).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");

		Comparator<ProductDTO> com36= (o1, o2) -> Double.valueOf(o2.getPrice()).compareTo(o1.getPrice());
		ref.stream().sorted(com36).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");

		Comparator<ProductDTO> com37= (o1, o2) -> Double.valueOf(o1.getDiscount()).compareTo(o2.getDiscount());
		ref.stream().sorted(com37).forEach(s -> System.out.println(s));
		
		//double discount, double itemWeight, double warranty, boolean damaged,
		
		System.out.println("*********************************************");

		Comparator<ProductDTO> com39= (o1, o2) -> Double.valueOf(o1.getDiscount()).compareTo(o1.getDiscount());
		ref.stream().sorted(com39).forEach(s -> System.out.println(s));
		

		System.out.println("*********************************************");

		Comparator<ProductDTO> com38= (o1, o2) -> Double.valueOf(o2.getDiscount()).compareTo(o1.getDiscount());
		ref.stream().sorted(com38).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");

		Comparator<ProductDTO> com40= (o1, o2) -> Double.valueOf(o1.getItemWeight()).compareTo(o2.getItemWeight());
		ref.stream().sorted(com40).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");

		Comparator<ProductDTO> com41= (o1, o2) -> Double.valueOf(o2.getItemWeight()).compareTo(o1.getItemWeight());
		ref.stream().sorted(com41).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");

		Comparator<ProductDTO> com42= (o1, o2) -> Double.valueOf(o1.getWarranty()).compareTo(o2.getWarranty());
		ref.stream().sorted(com42).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");

		Comparator<ProductDTO> com43= (o1, o2) -> Double.valueOf(o2.getWarranty()).compareTo(o1.getWarranty());
		ref.stream().sorted(com43).forEach(s -> System.out.println(s));
		
		//double discount, double itemWeight, double warranty, boolean damaged,

		System.out.println("*********************************************");

		Comparator<ProductDTO> com44= (o1, o2) ->o1.getManfDate().compareTo(o2.getManfDate());
		ref.stream().sorted(com44).forEach(s -> System.out.println(s));
		

		System.out.println("*********************************************");

		Comparator<ProductDTO> com45= (o1, o2) ->o2.getManfDate().compareTo(o1.getManfDate());
		ref.stream().sorted(com45).forEach(s -> System.out.println(s));
		
		// LocalDate dateFirstAvailable, LocalDate deliveryExpectedDate,
		
		System.out.println("*********************************************");

		Comparator<ProductDTO> com46= (o1, o2) ->o1.getDateFirstAvailable().compareTo(o2.getDateFirstAvailable());
		ref.stream().sorted(com46).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");

		Comparator<ProductDTO> com47= (o1, o2) ->o2.getDateFirstAvailable().compareTo(o1.getDateFirstAvailable());
		ref.stream().sorted(com47).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");

		Comparator<ProductDTO> com48= (o1, o2) ->o1.getDeliveryExpectedDate().compareTo(o2.getDeliveryExpectedDate());
		ref.stream().sorted(com48).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");

		Comparator<ProductDTO> com49= (o1, o2) ->o2.getDeliveryExpectedDate().compareTo(o1.getDeliveryExpectedDate());
		ref.stream().sorted(com49).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");
		ref.stream().sorted(com1.thenComparing(com3)).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");
		ref.stream().sorted(com3.thenComparing(com5)).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");
		ref.stream().sorted(com5.thenComparing(com7)).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");
		ref.stream().sorted(com7.thenComparing(com9)).forEach(s -> System.out.println(s));
		System.out.println("*********************************************");
		ref.stream().sorted(com9.thenComparing(com11)).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");
		ref.stream().sorted(com11.thenComparing(com13)).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");
		ref.stream().sorted(com13.thenComparing(com15)).forEach(s -> System.out.println(s));

		System.out.println("*********************************************");
		ref.stream().sorted(com15.thenComparing(com17)).forEach(s -> System.out.println(s));
		

		System.out.println("*********************************************");
		ref.stream().sorted(com17.thenComparing(com19)).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");
		ref.stream().sorted(com19.thenComparing(com21)).forEach(s -> System.out.println(s));
		
		
		//three comparing
		
		System.out.println("*********************************************");
		ref.stream().sorted(com1.thenComparing(com3).thenComparing(com5)).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");
		ref.stream().sorted(com3.thenComparing(com5).thenComparing(com7)).forEach(s -> System.out.println(s));
		
		
		System.out.println("*********************************************");
		ref.stream().sorted(com9.thenComparing(com11).thenComparing(com13)).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");
		ref.stream().sorted(com11.thenComparing(com13).thenComparing(com15)).forEach(s -> System.out.println(s));
		

		System.out.println("*********************************************");
		ref.stream().sorted(com15.thenComparing(com17).thenComparing(com19)).forEach(s -> System.out.println(s));
		
		

		System.out.println("*********************************************");
		ref.stream().sorted(com19.thenComparing(com21).thenComparing(com23)).forEach(s -> System.out.println(s));
		
		System.out.println("*********************************************");
		ref.stream().sorted(com25.thenComparing(com27).thenComparing(com29)).forEach(s -> System.out.println(s));
		

		System.out.println("*********************************************");
		ref.stream().sorted(com27.thenComparing(com29).thenComparing(com31)).forEach(s -> System.out.println(s));
		
		
		List<Integer> ids=ref.stream().map(p->p.getId()).collect(Collectors.toList());
		ids.forEach(s->System.out.println(s));
		
		
		
		
		
		
		
		

		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
