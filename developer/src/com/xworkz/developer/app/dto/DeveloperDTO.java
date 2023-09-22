package com.xworkz.developer.app.dto;

import java.io.Serializable;
import java.util.Objects;

public class DeveloperDTO implements Serializable{
	
	private String name;
	private int experience;
	private int salary;
	private String workingFor;
	private String designation;
	private boolean difficult;
	
	
	public DeveloperDTO(String name,int experience,int salary,String workingFor,String designation,boolean difficult) {
		this.name=name;
		this.experience=experience;
		this.salary=salary;
		this.workingFor=workingFor;
		this.designation=designation;
		this.difficult=difficult;
		}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getWorkingFor() {
		return workingFor;
	}
	public void setWorkingFor(String workingFor) {
		this.workingFor = workingFor;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public boolean isDifficult() {
		return difficult;
	}
	public void setDifficult(boolean difficult) {
		this.difficult = difficult;
	}



	@Override
	public String toString() {
		return "developerDTO [name=" + name + ", experience=" + experience + ", salary=" + salary + ", workingFor="
				+ workingFor + ", designation=" + designation + ", difficult=" + difficult + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(designation, difficult, experience, name, salary, workingFor);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeveloperDTO other = (DeveloperDTO) obj;
		return Objects.equals(designation, other.designation) && difficult == other.difficult
				&& experience == other.experience && Objects.equals(name, other.name) && salary == other.salary
				&& Objects.equals(workingFor, other.workingFor);
	}
	
	
	
	

}
