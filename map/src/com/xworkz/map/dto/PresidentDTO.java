package com.xworkz.map.dto;

import java.util.Objects;

public class PresidentDTO {
	
	private Integer id1;
	private String name;
	public Integer getId1() {
		return id1;
	}
	public void setId1(Integer id1) {
		this.id1 = id1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id1, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PresidentDTO other = (PresidentDTO) obj;
		return Objects.equals(id1, other.id1) && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "PresidentDTO [id1=" + id1 + ", name=" + name + "]";
	}
	public PresidentDTO(Integer id1, String name) {
		super();
		this.id1 = id1;
		this.name = name;
	}
	
	

}
