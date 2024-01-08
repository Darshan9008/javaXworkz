package com.xworkz.collection.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class ProductDTO implements Serializable,Comparable<ProductDTO> {
	
	private int id, quantity, modelNo, serialNo;
	private String name, company, discription, packer, included, genericName, asin, countryOfOrigin, primeDelivery;
	private float rating, peopleRated, peopleRatedFive, peopleRatedFour, peopleRatedThree, peopleRatedTwo,
			peopleRatedOne;
	private double price, discount, itemWeight, warranty;
	private boolean damaged, returnable;
	private LocalDate manfDate, expiryDate, dateFirstAvailable, deliveryExpectedDate,returnBy;
	
	
	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getModelNo() {
		return modelNo;
	}


	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}


	public int getSerialNo() {
		return serialNo;
	}


	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getDiscription() {
		return discription;
	}


	public void setDiscription(String discription) {
		this.discription = discription;
	}


	public String getPacker() {
		return packer;
	}


	public void setPacker(String packer) {
		this.packer = packer;
	}


	public String getIncluded() {
		return included;
	}


	public void setIncluded(String included) {
		this.included = included;
	}


	public String getGenericName() {
		return genericName;
	}


	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}


	public String getAsin() {
		return asin;
	}


	public void setAsin(String asin) {
		this.asin = asin;
	}


	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}


	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}


	public String getPrimeDelivery() {
		return primeDelivery;
	}


	public void setPrimeDelivery(String primeDelivery) {
		this.primeDelivery = primeDelivery;
	}


	public float getRating() {
		return rating;
	}


	public void setRating(float rating) {
		this.rating = rating;
	}


	public float getPeopleRated() {
		return peopleRated;
	}


	public void setPeopleRated(float peopleRated) {
		this.peopleRated = peopleRated;
	}


	public float getPeopleRatedFive() {
		return peopleRatedFive;
	}


	public void setPeopleRatedFive(float peopleRatedFive) {
		this.peopleRatedFive = peopleRatedFive;
	}


	public float getPeopleRatedFour() {
		return peopleRatedFour;
	}


	public void setPeopleRatedFour(float peopleRatedFour) {
		this.peopleRatedFour = peopleRatedFour;
	}


	public float getPeopleRatedThree() {
		return peopleRatedThree;
	}


	public void setPeopleRatedThree(float peopleRatedThree) {
		this.peopleRatedThree = peopleRatedThree;
	}


	public float getPeopleRatedTwo() {
		return peopleRatedTwo;
	}


	public void setPeopleRatedTwo(float peopleRatedTwo) {
		this.peopleRatedTwo = peopleRatedTwo;
	}


	public float getPeopleRatedOne() {
		return peopleRatedOne;
	}


	public void setPeopleRatedOne(float peopleRatedOne) {
		this.peopleRatedOne = peopleRatedOne;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public double getItemWeight() {
		return itemWeight;
	}


	public void setItemWeight(double itemWeight) {
		this.itemWeight = itemWeight;
	}


	public double getWarranty() {
		return warranty;
	}


	public void setWarranty(double warranty) {
		this.warranty = warranty;
	}


	public boolean isDamaged() {
		return damaged;
	}


	public void setDamaged(boolean damaged) {
		this.damaged = damaged;
	}


	public boolean isReturnable() {
		return returnable;
	}


	public void setReturnable(boolean returnable) {
		this.returnable = returnable;
	}


	public LocalDate getManfDate() {
		return manfDate;
	}


	public void setManfDate(LocalDate manfDate) {
		this.manfDate = manfDate;
	}


	public LocalDate getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}


	public LocalDate getDateFirstAvailable() {
		return dateFirstAvailable;
	}


	public void setDateFirstAvailable(LocalDate dateFirstAvailable) {
		this.dateFirstAvailable = dateFirstAvailable;
	}


	public LocalDate getDeliveryExpectedDate() {
		return deliveryExpectedDate;
	}


	public void setDeliveryExpectedDate(LocalDate deliveryExpectedDate) {
		this.deliveryExpectedDate = deliveryExpectedDate;
	}


	public LocalDate getReturnBy() {
		return returnBy;
	}


	public void setReturnBy(LocalDate returnBy) {
		this.returnBy = returnBy;
	}


	@Override
	public int hashCode() {
		return Objects.hash(asin, company, countryOfOrigin, damaged, dateFirstAvailable, deliveryExpectedDate, discount,
				discription, expiryDate, genericName, id, included, itemWeight, manfDate, modelNo, name, packer,
				peopleRated, peopleRatedFive, peopleRatedFour, peopleRatedOne, peopleRatedThree, peopleRatedTwo, price,
				primeDelivery, quantity, rating, returnBy, returnable, serialNo, warranty);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDTO other = (ProductDTO) obj;
		return Objects.equals(asin, other.asin) && Objects.equals(company, other.company)
				&& Objects.equals(countryOfOrigin, other.countryOfOrigin) && damaged == other.damaged
				&& Objects.equals(dateFirstAvailable, other.dateFirstAvailable)
				&& Objects.equals(deliveryExpectedDate, other.deliveryExpectedDate)
				&& Double.doubleToLongBits(discount) == Double.doubleToLongBits(other.discount)
				&& Objects.equals(discription, other.discription) && Objects.equals(expiryDate, other.expiryDate)
				&& Objects.equals(genericName, other.genericName) && id == other.id
				&& Objects.equals(included, other.included)
				&& Double.doubleToLongBits(itemWeight) == Double.doubleToLongBits(other.itemWeight)
				&& Objects.equals(manfDate, other.manfDate) && modelNo == other.modelNo
				&& Objects.equals(name, other.name) && Objects.equals(packer, other.packer)
				&& Float.floatToIntBits(peopleRated) == Float.floatToIntBits(other.peopleRated)
				&& Float.floatToIntBits(peopleRatedFive) == Float.floatToIntBits(other.peopleRatedFive)
				&& Float.floatToIntBits(peopleRatedFour) == Float.floatToIntBits(other.peopleRatedFour)
				&& Float.floatToIntBits(peopleRatedOne) == Float.floatToIntBits(other.peopleRatedOne)
				&& Float.floatToIntBits(peopleRatedThree) == Float.floatToIntBits(other.peopleRatedThree)
				&& Float.floatToIntBits(peopleRatedTwo) == Float.floatToIntBits(other.peopleRatedTwo)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(primeDelivery, other.primeDelivery) && quantity == other.quantity
				&& Float.floatToIntBits(rating) == Float.floatToIntBits(other.rating)
				&& Objects.equals(returnBy, other.returnBy) && returnable == other.returnable
				&& serialNo == other.serialNo
				&& Double.doubleToLongBits(warranty) == Double.doubleToLongBits(other.warranty);
	}


	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", quantity=" + quantity + ", modelNo=" + modelNo + ", serialNo=" + serialNo
				+ ", name=" + name + ", company=" + company + ", discription=" + discription + ", packer=" + packer
				+ ", included=" + included + ", genericName=" + genericName + ", asin=" + asin + ", countryOfOrigin="
				+ countryOfOrigin + ", primeDelivery=" + primeDelivery + ", rating=" + rating + ", peopleRated="
				+ peopleRated + ", peopleRatedFive=" + peopleRatedFive + ", peopleRatedFour=" + peopleRatedFour
				+ ", peopleRatedThree=" + peopleRatedThree + ", peopleRatedTwo=" + peopleRatedTwo + ", peopleRatedOne="
				+ peopleRatedOne + ", price=" + price + ", discount=" + discount + ", itemWeight=" + itemWeight
				+ ", warranty=" + warranty + ", damaged=" + damaged + ", returnable=" + returnable + ", manfDate="
				+ manfDate + ", expiryDate=" + expiryDate + ", dateFirstAvailable=" + dateFirstAvailable
				+ ", deliveryExpectedDate=" + deliveryExpectedDate + ", returnBy=" + returnBy + "]";
	}


	public ProductDTO(int id, int quantity, int modelNo, int serialNo, String name, String company, String discription,
			String packer, String included, String genericName, String asin, String countryOfOrigin,
			String primeDelivery, float rating, float peopleRated, float peopleRatedFive, float peopleRatedFour,
			float peopleRatedThree, float peopleRatedTwo, float peopleRatedOne, double price, double discount,
			double itemWeight, double warranty, boolean damaged, boolean returnable, LocalDate manfDate,
			LocalDate expiryDate, LocalDate dateFirstAvailable, LocalDate deliveryExpectedDate, LocalDate returnBy) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.modelNo = modelNo;
		this.serialNo = serialNo;
		this.name = name;
		this.company = company;
		this.discription = discription;
		this.packer = packer;
		this.included = included;
		this.genericName = genericName;
		this.asin = asin;
		this.countryOfOrigin = countryOfOrigin;
		this.primeDelivery = primeDelivery;
		this.rating = rating;
		this.peopleRated = peopleRated;
		this.peopleRatedFive = peopleRatedFive;
		this.peopleRatedFour = peopleRatedFour;
		this.peopleRatedThree = peopleRatedThree;
		this.peopleRatedTwo = peopleRatedTwo;
		this.peopleRatedOne = peopleRatedOne;
		this.price = price;
		this.discount = discount;
		this.itemWeight = itemWeight;
		this.warranty = warranty;
		this.damaged = damaged;
		this.returnable = returnable;
		this.manfDate = manfDate;
		this.expiryDate = expiryDate;
		this.dateFirstAvailable = dateFirstAvailable;
		this.deliveryExpectedDate = deliveryExpectedDate;
		this.returnBy = returnBy;
	}


	@Override
	public int compareTo(ProductDTO arguement) {

		
		return Integer.valueOf(arguement.id).compareTo(this.id);
	}
	
	

}
