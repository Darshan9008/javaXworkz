package com.xworkz.Grocery.boot;
import com.xworkz.Grocery.app.*;

public class PatientRepositoryRunner {

	public static void main(String[] args) {
System.out.println("invoking PatientRepositoryrunner in main");
PatientRepository patientRepo=new PatientRepositoryImpl();
patientRepo.admission("janavi");
patientRepo.admission("chandan");
patientRepo.admission("paal");
patientRepo.admission("vinay");
patientRepo.admission("jeevan");
patientRepo.admission("athlete");
patientRepo.admission("state");



	}

}
