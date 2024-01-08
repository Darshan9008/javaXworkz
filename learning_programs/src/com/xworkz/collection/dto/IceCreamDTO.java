package com.xworkz.collection.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class IceCreamDTO implements Serializable,Comparable<IceCreamDTO> {
	
	private String flavour;
	private int price;
	private LocalDate manfDate;
	private String type;
	
	
	public IceCreamDTO() {
		// TODO Auto-generated constructor stub
	}


	public String getFlavour() {
		return flavour;
	}


	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public LocalDate getManfDate() {
		return manfDate;
	}


	public void setManfDate(LocalDate manfDate) {
		this.manfDate = manfDate;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public int hashCode() {
		return Objects.hash(flavour, manfDate, price, type);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IceCreamDTO other = (IceCreamDTO) obj;
		return Objects.equals(flavour, other.flavour) && Objects.equals(manfDate, other.manfDate)
				&& Objects.equals(price, other.price) && Objects.equals(type, other.type);
	}


	@Override
	public String toString() {
		return "IceCreamDTO [flavour=" + flavour + ", price=" + price + ", manfDate=" + manfDate + ", type=" + type
				+ "]";
	}


	public IceCreamDTO(String flavour, int price, LocalDate manfDate, String type) {
		super();
		this.flavour = flavour;
		this.price = price;
		this.manfDate = manfDate;
		this.type = type;
	}


	@Override
	public int compareTo(IceCreamDTO arguement) {
		return this.flavour.compareTo(arguement.flavour);
	}
	
	
	
	
	

}
