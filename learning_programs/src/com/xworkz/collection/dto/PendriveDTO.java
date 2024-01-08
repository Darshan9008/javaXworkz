package com.xworkz.collection.dto;

import java.util.Objects;

public class PendriveDTO implements Comparable<PendriveDTO> {
	
	private String capacity;
	private String brand;
	private boolean secure;
	private int speed;
	
	public PendriveDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isSecure() {
		return secure;
	}

	public void setSecure(boolean secure) {
		this.secure = secure;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, capacity, secure, speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PendriveDTO other = (PendriveDTO) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(capacity, other.capacity) && secure == other.secure
				&& speed == other.speed;
	}

	public PendriveDTO(String capacity, String brand, boolean secure, int speed) {
		super();
		this.capacity = capacity;
		this.brand = brand;
		this.secure = secure;
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "PendriveDTO [capacity=" + capacity + ", brand=" + brand + ", secure=" + secure + ", speed=" + speed
				+ "]";
	}

	@Override
	public int compareTo(PendriveDTO arguement) {
		PendriveDTO current=this;
		if(current.speed == arguement.speed) {
			return 0;
		}
		if(current.speed > arguement.speed) {
			return 77;
		}
		if(current.speed < arguement.speed) {
			return -1;
		}

            
		return 0;
	}

	
	}
	
	
	
	
	


