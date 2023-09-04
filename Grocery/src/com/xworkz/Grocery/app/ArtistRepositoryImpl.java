package com.xworkz.Grocery.app;

public class ArtistRepositoryImpl implements ArtistRepository {

	String[] data = new String[TOTAL_NUMBER];
	public int position;

	@Override
	public void drawing(String type) {
		System.out.println("invoking drawing() in ArtistRepositoryImpl");
		if (this.position < TOTAL_NUMBER) {

			this.data[position] = type;
			System.out.println("type added " + type + " at the position  " + position);
			this.position++;

		} else
			System.out.println("memory is full");
	}

}
