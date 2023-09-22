package com.xworkz.engineer.boot;
import com.xworkz.engineer.app.*;
import com.xworkz.engineer.app.repository.*;
import com.xworkz.engineer.app.dto.*;
import com.xworkz.engineer.app.service.*;




public class EngineerRunner {

	public static void main(String[] args) {
		System.out.println("running in main method");
		EngineerRepository engineerRepository=new EngineerRepositoryImpl();
		EngineerService engineerService=new EngineerServiceImpl(engineerRepository);
		
        EngineerDTO engineerDTO=new EngineerDTO(101,"darshan","pesitm");
        engineerService.validateAndSave(engineerDTO);
        
        EngineerDTO engineerDTO1=new EngineerDTO(101,"darshan","pesitm");
        engineerService.validateAndSave(engineerDTO1);
        
        
	}

}
