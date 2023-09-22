package com.xworkz.Grocery.app;

public class JuiceRepositoryImpl implements JuiceRepository {

	String[] juices = new String[TOTAL_ITEMS];
	public int position = 0;

	@Override
	public boolean isExist(String juice) {

		for (int index = 0; index <= position; index++) {

			String temp = this.juices[index];
			if (temp != null && temp.equals(juice))

			{
				System.out.println("juice is valid to store");

				return true;
			} else {
				System.out.println("juice is already exist ");
			}

		}

		return false;
	}

	@Override
	public void store(String juice) {
		System.out.println("invoking store() in JuiceRepositoryImpl");

		if (position < TOTAL_ITEMS) {

			this.juices[position] = juice;
			System.out.println("juice is stored" + juice + "at the position" + position);
			this.position++;

		} else {
			System.out.println("data stored is full");
		}
	}

}
