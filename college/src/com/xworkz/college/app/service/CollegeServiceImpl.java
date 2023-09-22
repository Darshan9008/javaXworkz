package com.xworkz.college.app.service;

import com.xworkz.college.app.dto.CollegeDTO;
import com.xworkz.college.app.repository.CollegeRepository;

public class CollegeServiceImpl implements CollegeService{
	
	
	private CollegeRepository collegeRepository;
	
	
	public CollegeServiceImpl(CollegeRepository collegeRepository) {
		this.collegeRepository=collegeRepository;
	}
	
	@Override
	public boolean validateAndSave(CollegeDTO dto) {

		
		if(dto!=null) {
			
			System.out.println("dto is valid to save");
			
			int collegeStrength=dto.getCollegeStrength();
			String collegeName=dto.getCollegeName();
			 int collegeID=dto.getCollegeID();
			 String district=dto.getDistrict();
			 String location=dto.getLocation();
			 String address=dto.getAddress();
			 boolean library=dto.isLibrary();
			 int noOfGround=dto.getNoOfGround();
			 int noOfBoys=dto.getNoOfBoys();
			 int noOfGirls=dto.getNoOfGirls();
			 
			 if(collegeStrength>100 && collegeStrength<3000) {
				 System.out.println("collegeStrength is valid to save");
			 }
			 else {
				 System.out.println("collegeStrength is invalid");
				 return false;
				 
			 }
			 if(collegeName!=null && !collegeName.isEmpty() && collegeName.length()>3 && collegeName.length()<20) {
				 System.out.println("collegename is valid");
			 }else
			 {
				 System.out.println("collegename is invalid ");
				 return false;
				 
			 }
			 if(collegeID>1000 && collegeID<2000) {
				 System.out.println("id is valid ");
			 }else {
				 System.out.println("id is invalid ");
				 return false;
			 }
			 if(district!=null && !district.isEmpty() && district.length()>3 && district.length()<20) {
				 System.out.println("district is valid");
			 }
			 else {
				 System.out.println("district is invalid");
				 return false;
			 }
			 
			 if(location!=null && !location.isEmpty() && location.length()>3 && location.length()<20) {
				 System.out.println("location is valid");
			 }else {
				 System.out.println("location is invalid");
				 return false;
			 }
			 
			 if(address!=null && !address.isEmpty() && address.length()>3 && address.length()<20) {
				 System.out.println("address is valid");
			 }
			 else {
				 System.out.println("addresss is invalid");
				 return false;
			 }
			 if(library==true) {
				 System.out.println("library is valid");
			 }else {
				 System.out.println("library is invalid");
				 return false;
			 }
			 if(noOfGround>0) {
				 System.out.println("no of ground is valid");
			 }
			 else {
				 System.out.println("no of ground is invalid");
				 return false;
			 }
			 if(noOfBoys>0 && noOfBoys<2000) {
				 System.out.println("no of boys is valid");
			 }else {
				 System.out.println("no of boys is invalid");
				 return false;
			 }
			 if(noOfGirls>0 && noOfGirls<2000) {
				 System.out.println("no of girls is valid");
			 }
			 else {
				 System.out.println("no of girls is invalid");
				 return false;
			 }
			 System.out.println("data is valid");
			 this.collegeRepository.save(dto);
			 return true;
		}
			 else {
				 System.out.println("data is invalid");
			 }
		
		return false;
		
		
		
	}
	
	
	
	

}
