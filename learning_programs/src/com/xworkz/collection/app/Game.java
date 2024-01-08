package com.xworkz.collection.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Stream;

import com.xworkz.collection.dto.GameDTO;

public class Game {

	public static void main(String[] args) {

		GameDTO dto1 = new GameDTO(101, "cricket", 11, 25, LocalDate.of(2023, 8, 15), false);
		GameDTO dto2 = new GameDTO(102, "football", 10, 40, LocalDate.of(2023, 7, 16), true);
		GameDTO dto3 = new GameDTO(103, "basketball", 06, 60, LocalDate.of(2023, 6, 18), false);
		GameDTO dto4 = new GameDTO(104, "rugby", 12, 60, LocalDate.of(2023, 5, 20), false);
		GameDTO dto5 = new GameDTO(105, "swimming", 15, 100, LocalDate.of(2023, 8, 12), true);
		GameDTO dto6 = new GameDTO(106, "tennis", 2, 10, LocalDate.of(2023, 1, 10), false);
		GameDTO dto7 = new GameDTO(107, "volleyball", 6, 45, LocalDate.of(2023, 2, 03), true);
		GameDTO dto8 = new GameDTO(108, "koh-kho", 9, 25, LocalDate.of(2023, 2, 20), false);
		GameDTO dto9 = new GameDTO(109, "kabbadi", 7, 90, LocalDate.of(2023, 3, 11), true);
		GameDTO dto10 = new GameDTO(110, "badminton", 5, 110, LocalDate.of(2023, 5, 16), false);

		Collection<GameDTO> ref = new ArrayList<GameDTO>();

		ref.add(dto1);
		ref.add(dto2);
		ref.add(dto3);

		ref.add(dto4);

		ref.add(dto5);

		ref.add(dto6);

		ref.add(dto7);

		ref.add(dto8);

		ref.add(dto9);

		ref.add(dto10);

		
		
		
		Stream.of(dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted()
				.forEach(p -> System.out.println(p));

		System.out.println("--------------------------------------------");

		Comparator<GameDTO> com = (t1, t2) -> t2.getName().compareTo(t1.getName());
		Stream.of(dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(com)
				.forEach(s -> System.out.println(s));

		System.out.println("--------------------------------------");

		Comparator<GameDTO> com1 = (s1, s2) -> s1.getPoints().compareTo(s2.getPoints());

		Stream.of(dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(com1)
				.forEach(s -> System.out.println(s));

		System.out.println("*********************************************");

		Comparator<GameDTO> com2 = (s1, s2) -> s2.getPoints().compareTo(s1.getPoints());

		Stream.of(dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(com2)
				.forEach(s -> System.out.println(s));

		System.out.println("*********************************************");
		Comparator<GameDTO> com3 = (s1, s2) -> s1.getEventDate().compareTo(s2.getEventDate());

		Stream.of(dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(com3)
				.forEach(s -> System.out.println(s));

		System.out.println("*********************************************");
		Comparator<GameDTO> com4 = (s1, s2) -> s2.getEventDate().compareTo(s1.getEventDate());

		Stream.of(dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(com4)
				.forEach(s -> System.out.println(s));

		System.out.println("*********************************************");

		Comparator<GameDTO> com5 = (t1, t2) -> t1.getName().compareTo(t2.getName());
		Comparator<GameDTO> com6 = (t1, t2) -> t2.getPoints().compareTo(t1.getPoints());
		Stream.of(dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(com5.thenComparing(com6))
				.forEach(s -> System.out.println(s));

		System.out.println("*********************************************");
		
		Stream.of(dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10)
				.sorted(com5.thenComparing(com6).thenComparing(com3)).forEach(s -> System.out.println(s));

		System.out.println("*************************************************");

	}

}
