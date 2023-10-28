package com.xworkz.app.dto;

import java.time.LocalDate;
import java.util.Objects;

public class ApplicationDTO {
	
	
	private String name;
	private String version;
	private String companyName;
	private LocalDate createDate;
	private double rating;
	
	
	
	public ApplicationDTO() {
		// TODO Auto-generated constructor stub
	}



	public ApplicationDTO(String name, String version, String companyName, LocalDate createDate, double rating) {
		super();
		this.name = name;
		this.version = version;
		this.companyName = companyName;
		this.createDate = createDate;
		this.rating = rating;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getVersion() {
		return version;
	}



	public void setVersion(String version) {
		this.version = version;
	}



	public String getCompanyName() {
		return companyName;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public LocalDate getCreateDate() {
		return createDate;
	}



	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}



	public double getRating() {
		return rating;
	}



	public void setRating(double rating) {
		this.rating = rating;
	}



	@Override
	public int hashCode() {
		return Objects.hash(companyName, createDate, name, rating, version);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicationDTO other = (ApplicationDTO) obj;
		return Objects.equals(companyName, other.companyName) && Objects.equals(createDate, other.createDate)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(rating) == Double.doubleToLongBits(other.rating)
				&& Objects.equals(version, other.version);
	}
	
	
	
	
	
	
	

}
