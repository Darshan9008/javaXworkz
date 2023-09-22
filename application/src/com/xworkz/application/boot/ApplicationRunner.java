package com.xworkz.application.boot;
import com.xworkz.application.app.repository.*;
import com.xworkz.application.app.service.*;
import com.xworkz.application.app.dto.*;
public class ApplicationRunner {

	public static void main(String[] args) {

		
		ApplicationRepository applicationRepository=new ApplicationRepositoryImpl();
		ApplicationService applicationService=new ApplicationServiceImpl(applicationRepository);
		ApplicationDTO applicationDTO=new ApplicationDTO(12, "darshan", "engineer", "12-08-2023", "1.8");
		applicationService.validateAndSave(applicationDTO);
		
		ApplicationDTO applicationDTO1=new ApplicationDTO(13, "darshan", "engineer", "12-08-2023", "1.8");
		applicationService.validateAndSave(applicationDTO1);
		applicationService.findByName("darshan");
		
	}

}
