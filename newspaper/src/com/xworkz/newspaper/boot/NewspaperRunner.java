package com.xworkz.newspaper.boot;

import com.xworkz.newspaper.app.repository.*;
import com.xworkz.newspaper.app.service.*;
import com.xworkz.newspaper.app.dto.*;

public class NewspaperRunner {

	public static void main(String[] args) {

		
		NewspaperRepository newspaperRepository=new NewspaperRepositoryImpl();
		
		NewspaperService newspaperService=new NewspaperServiceImpl(newspaperRepository);
		
		NewspaperDTO newspaperDTO=new NewspaperDTO("prajavani", "kannada", 20, 5);
		newspaperService.finByPublisher("prajavani");
		
		
		
		
		
		
		
		
		
	}

}
