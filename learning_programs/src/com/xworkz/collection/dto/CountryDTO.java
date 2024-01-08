package com.xworkz.collection.dto;

import java.util.Objects;

public class CountryDTO {
	
	
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountryDTO other = (CountryDTO) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "CountryDTO [id=" + id + ", name=" + name + "]";
	}
	public CountryDTO(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	

}
