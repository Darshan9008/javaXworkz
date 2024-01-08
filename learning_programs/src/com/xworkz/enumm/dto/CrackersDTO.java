package com.xworkz.enumm.dto;

public class CrackersDTO {

	private String name;
	private Integer price;
	private CrackersType type;
	private Color color;
	
	public CrackersDTO(CrackersType type,Color color) {

    this.type=type;
    this.color=color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CrackersDTO [name=" + name + ", price=" + price + ", type=" + type + ", color=" + color + "]";
	}
	
	
	
	
}
