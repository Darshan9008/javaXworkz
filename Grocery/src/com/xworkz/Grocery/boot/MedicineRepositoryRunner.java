package com.xworkz.Grocery.boot;
import com.xworkz.Grocery.app.*;

public class MedicineRepositoryRunner {

	public static void main(String[] args) {
System.out.println("invoking MedicineRepositoryRunner in main");

      MedicineRepository medcineRepo=new MedicineRepositoryImpl();
      medcineRepo.function("cipla");
      medcineRepo.function("crocin");

      medcineRepo.function("paracetomal");
      medcineRepo.function("vicks");
      medcineRepo.function("dolo");
      medcineRepo.function("coldin");
      medcineRepo.function("covaccin");
      medcineRepo.function("citrcin");

      medcineRepo.function("clobetol");






	}

}
