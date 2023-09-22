package com.xworkz.Grocery.app;

public class PincodeRepositoryImpl implements PincodeRepository {

	int[] pincodes = new int[TOTAL_NUMBER];
	public int position = 0;

	@Override
	public boolean isExist(int pincode) {

		for (int index = 0; index <= position; index++) {

			int temp = this.pincodes[index];
			if (temp == pincode) {

				System.out.println("valid pincode ");
				return true;

			} else {
				System.out.println("invalid pincode");
			}

		}

		return false;
	}

	@Override
	public void store(int pincode) {
		System.out.println("invoking store() in PincodeRepositoryImpl");

		if (position < TOTAL_NUMBER) {

			this.pincodes[position] = pincode;
			System.out.println("pincode store in" + pincode + "at the position" + position);
			this.position++;

		}

	}

}
