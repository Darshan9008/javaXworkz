package com.xworkz.engineer.app.dto;

import java.util.Objects;

public class EngineerDTO {
	
	private int id;
	private String name;
	private String collegeName;
	
	public EngineerDTO() {
		
	}
	
	public EngineerDTO(int id, String name,String collegeName) {
		this.id=id;
		this.name=name;
		this.collegeName=collegeName;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "EngineerDTO [id=" + id + ", name=" + name + ", collegeName=" + collegeName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(collegeName, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EngineerDTO other = (EngineerDTO) obj;
		return Objects.equals(collegeName, other.collegeName) && id == other.id && Objects.equals(name, other.name);
	}

}
