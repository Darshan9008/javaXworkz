package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.NewspaperDTO;
import com.xworkz.newspaper.app.repository.NewspaperRepository;
import com.xworkz.newspaper.app.*;

public class NewspaperServiceImpl implements NewspaperService {

	private NewspaperRepository newspaperRepository;

	public NewspaperServiceImpl(NewspaperRepository newspaperRepository) {

		this.newspaperRepository = newspaperRepository;
	}

	@Override
	public boolean validateAndSave(NewspaperDTO dto) {

		if(dto!=null) {
			System.out.println("dto is valid ");
			
			String language=dto.getLanguage();
			String publisher=dto.getPublisher();
			int noOfPages=dto.getNoOfPages();
			int size=dto.getSize();
			
			if(language!=null && language.length()>3 && language.length()<20 && !language.isEmpty()) {
				System.out.println("language is valid");
			
			}
			else {
				System.err.println("language is invalid");
				return false;
			}
			if(publisher!=null && !publisher.isEmpty() && publisher.length()>3 && publisher.length()<20)
			{
				System.out.println("publisher is valid to store");
			}
			else {
				System.err.println("publisher is invalid to store");
				return false;
			}
			if( noOfPages>0 && size>0 ) {
				System.out.println("no of page and size is valid to store");
				
			}
			else {
				System.err.println("no of page and size is invalid to store");
			}
		
			
			this.newspaperRepository.save(dto);
			return true;
			
		}
		else
		{
			System.err.println("dto is invalid to store");
		}
		
		return false;
	}
	
	@Override
	public NewspaperDTO finByPublisher(String name) {
	    System.out.println("running findByPublisher");
	    if(name!=null && !name.isEmpty() && name.length()>3 && name.length()<20) {
	    	System.out.println("publisher is valid, will find");
	    	NewspaperDTO dto=this.newspaperRepository.findByPublisher(name);
	    	return dto; 	
	    }	
	    else
	    {
	    	System.err.println("publisher is invalid....");
	    }
		return NewspaperService.super.finByPublisher(name);
	
	}
	
	
	
	
	
	
	
	
	
	

}
