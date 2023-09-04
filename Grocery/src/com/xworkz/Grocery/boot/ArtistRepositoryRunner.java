package com.xworkz.Grocery.boot;

import com.xworkz.Grocery.app.*;

public class ArtistRepositoryRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in ArtistRepositoryRunner ");

		ArtistRepository artistRepo = new ArtistRepositoryImpl();
		artistRepo.drawing("river");
		artistRepo.drawing("dam");
		artistRepo.drawing("home");
		artistRepo.drawing("temple");
		artistRepo.drawing("person");
		artistRepo.drawing("mountain");
		artistRepo.drawing("face");
		artistRepo.drawing("scenary");
		artistRepo.drawing("bike");

	}

}
