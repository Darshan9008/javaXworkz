package com.xworkz.Grocery.boot;
import com.xworkz.Grocery.app.*;

public class PilotRepositoryRunner {
	
	public static void main(String[] args) {
		
		PilotRepository pilotIns=new PilotRepositoryImpl();
		pilotIns.fly("yelahanka");
		pilotIns.fly("rajajinagar");
		pilotIns.fly("majestic");
		pilotIns.fly("magadi");
		pilotIns.fly("navarang");
		pilotIns.fly("hebbal");
		pilotIns.fly("nagavara");
		
		
	}

}
