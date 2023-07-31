package com.xworkz.app;

public class Hospital {

	Doctor doctor=new Doctor();
	Nurse nurse=new Nurse();
	Patient patient=new Patient();
	
	public void noOfStaffs()
	{
		System.out.println("invoking noOfStaffs in Hospital ");
		if(this.doctor!=null && this.nurse!=null && this.patient!=null)
		{
			this.doctor.specialisation();
			this.doctor.exp();
			this.nurse.education();
			this.nurse.uniformColor();
			this.patient.disease();
			this.patient.dateAdmitted();
		}
		else
		{
			System.out.println("Either one of the doctor or patient or nurse is referring to null pointer");
		}
	}
}
