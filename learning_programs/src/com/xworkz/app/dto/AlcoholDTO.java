package com.xworkz.app.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class AlcoholDTO implements Serializable {
	
	private int id;
	private String alcoholName;
	private double cost;
	private float quantity;
	private boolean goodQuality;
	private long gstNumber;
	private float gstRate;
	private boolean toxic;
	private LocalDate manufactureDate;
	private LocalDateTime expiryDate;
	
	
	
	public AlcoholDTO() {
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getAlcoholName() {
		return alcoholName;
	}



	public void setAlcoholName(String alcoholName) {
		this.alcoholName = alcoholName;
	}



	public double getCost() {
		return cost;
	}



	public void setCost(double cost) {
		this.cost = cost;
	}



	public float getQuantity() {
		return quantity;
	}



	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}



	public boolean isGoodQuality() {
		return goodQuality;
	}



	public void setGoodQuality(boolean goodQuality) {
		this.goodQuality = goodQuality;
	}



	public long getGstNumber() {
		return gstNumber;
	}



	public void setGstNumber(long gstNumber) {
		this.gstNumber = gstNumber;
	}



	public float getGstRate() {
		return gstRate;
	}



	public void setGstRate(float gstRate) {
		this.gstRate = gstRate;
	}



	public boolean isToxic() {
		return toxic;
	}



	public void setToxic(boolean toxic) {
		this.toxic = toxic;
	}



	public LocalDate getManufactureDate() {
		return manufactureDate;
	}



	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}



	public LocalDateTime getExpiryDate() {
		return expiryDate;
	}



	public void setExpiryDate(LocalDateTime expiryDate) {
		this.expiryDate = expiryDate;
	}



	@Override
	public int hashCode() {
		return Objects.hash(alcoholName, cost, expiryDate, goodQuality, gstNumber, gstRate, id, manufactureDate,
				quantity, toxic);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlcoholDTO other = (AlcoholDTO) obj;
		return Objects.equals(alcoholName, other.alcoholName)
				&& Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost)
				&& Objects.equals(expiryDate, other.expiryDate) && goodQuality == other.goodQuality
				&& gstNumber == other.gstNumber && Float.floatToIntBits(gstRate) == Float.floatToIntBits(other.gstRate)
				&& id == other.id && Objects.equals(manufactureDate, other.manufactureDate)
				&& Float.floatToIntBits(quantity) == Float.floatToIntBits(other.quantity) && toxic == other.toxic;
	}



	@Override
	public String toString() {
		return "AlcoholDTO [id=" + id + ", alcoholName=" + alcoholName + ", cost=" + cost + ", quantity=" + quantity
				+ ", goodQuality=" + goodQuality + ", gstNumber=" + gstNumber + ", gstRate=" + gstRate + ", toxic="
				+ toxic + ", manufactureDate=" + manufactureDate + ", expiryDate=" + expiryDate + "]";
	}



	public AlcoholDTO(int id, String alcoholName, double cost, float quantity, boolean goodQuality, long gstNumber,
			float gstRate, boolean toxic, LocalDate manufactureDate, LocalDateTime expiryDate) {
		super();
		this.id = id;
		this.alcoholName = alcoholName;
		this.cost = cost;
		this.quantity = quantity;
		this.goodQuality = goodQuality;
		this.gstNumber = gstNumber;
		this.gstRate = gstRate;
		this.toxic = toxic;
		this.manufactureDate = manufactureDate;
		this.expiryDate = expiryDate;
	}
	
	
	
	
	
	

	
	
	
	

}
