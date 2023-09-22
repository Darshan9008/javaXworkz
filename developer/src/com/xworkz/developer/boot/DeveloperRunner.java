package com.xworkz.developer.boot;
import com.xworkz.developer.app.repository.*;
import com.xworkz.developer.app.*;
import com.xworkz.developer.app.service.*;
import com.xworkz.developer.app.dto.*;

public class DeveloperRunner {

	public static void main(String[] args) {

		
		System.out.println("invoking main in runner");
		DeveloperRepsoitory developerRepository=new DeveloperRepsoitoryImpl();
		DeveloperService developerService=new DeveloperServiceImpl(developerRepository);
		DeveloperDTO dto = new DeveloperDTO("darshan", 2, 50000, "IT Comapany", "Developer", true);
		boolean saved = developerService.validateAndSave(dto);
		System.out.println("Persisted " + dto);
		
		DeveloperDTO dto1 = new DeveloperDTO("vinay", 3, 60000, "Infosys", "Software Engineer", true);
		boolean saved1 = developerService.validateAndSave(dto1);
		System.out.println("Persisted " + saved1);
		DeveloperDTO dto2 = new DeveloperDTO("Chandu", 4, 65000, "Infy", "Engineer", true);
		boolean saved2 = developerService.validateAndSave(dto2);
		System.out.println("Persisted " + saved2);
		DeveloperDTO dto3 = new DeveloperDTO("palu", 5, 45000, "Accenture", "Associate Engineer", true);
		boolean saved3 = developerService.validateAndSave(dto3);
		System.out.println("Persisted " + saved3);

		
		DeveloperDTO dto5 = developerService.findByNameAndWorkingFor("Chandu", "darshan");
		DeveloperDTO dto6 = developerService.findByName("palu");
		System.out.println("Found " + dto5);

		
		
		
	}

}
