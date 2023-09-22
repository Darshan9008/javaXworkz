package com.xworkz.college.boot;
import com.xworkz.college.app.dto.CollegeDTO;
import com.xworkz.college.app.repository.*;
import com.xworkz.college.app.service.*;
public class CollegeRunner {

	public static void main(String[] args) {

		System.out.println("invoking the collegeRunner");
		
		CollegeRepository collegeRepository=new CollegeRepositoryImpl();
		CollegeService collegeService=new CollegeServiceImpl(collegeRepository);
		CollegeDTO dto=new CollegeDTO(1001,"PESITM",1001,"shimoga","shrirampura","PESITM COLLEGE",true,2,100,200);
		collegeService.validateAndSave(dto);
		
		
		
	}

}
