package com.xworkz.enumm.dto;

import com.xworkz.enumm.constants.Size;
import com.xworkz.enumm.constants.Type;

public class ShoeDTO {
	
	private String brand;
	private Integer price;
	private Size size;
	private Type type;
	
	public ShoeDTO(Size size,Type type) {

      this.size=size;
      this.type=type;
	
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ShoeDTO [brand=" + brand + ", price=" + price + ", size=" + size + ", type=" + type + "]";
	}
	
	
	
	

}
