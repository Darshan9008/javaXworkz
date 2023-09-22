package com.xworkz.application.app.dto;

import java.util.Objects;

public class ApplicationDTO {
	
	private int id;
	private String name;
	private String developedBy;
	private String developedAt;
	private String version;
	
	public ApplicationDTO()
	{
		
	}
	public ApplicationDTO(int id,String name,String developedBy,String developedAt,String version) {
		
		this.id=id;
		this.name=name;
		this.developedBy=developedBy;
		this.developedAt=developedAt;
		this.version=version;
		
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
	public String getDevelopedBy() {
		return developedBy;
	}
	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}
	public String getDevelopedAt() {
		return developedAt;
	}
	public void setDevelopedAt(String developedAt) {
		this.developedAt = developedAt;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "ApplicationDTO [id=" + id + ", name=" + name + ", developedBy=" + developedBy + ", developedAt="
				+ developedAt + ", version=" + version + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(developedAt, developedBy, id, name, version);
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
		return Objects.equals(developedAt, other.developedAt) && Objects.equals(developedBy, other.developedBy)
				&& id == other.id && Objects.equals(name, other.name) && Objects.equals(version, other.version);
	}
	
	
	

}
