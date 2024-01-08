package com.xworkz.map.dto;

import java.time.LocalDate;
import java.util.Objects;

public class ProductDTO implements Comparable<ProductDTO> {

	private String name;
	private Integer price;
	private Integer id;
	private Integer quantity;
	private LocalDate mfgDate;

	public ProductDTO(String name, Integer price, Integer id, Integer quantity, LocalDate mfgDate) {
		super();
		this.name = name;
		this.price = price;
		this.id = id;
		this.quantity = quantity;
		this.mfgDate = mfgDate;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public LocalDate getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(LocalDate mfgDate) {
		this.mfgDate = mfgDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, mfgDate, name, price, quantity);
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
		return Objects.equals(id, other.id) && Objects.equals(mfgDate, other.mfgDate)
				&& Objects.equals(name, other.name) && Objects.equals(price, other.price)
				&& Objects.equals(quantity, other.quantity);
	}

	@Override
	public String toString() {
		return "ProductDTO [name=" + name + ", price=" + price + ", id=" + id + ", quantity=" + quantity + ", mfgDate="
				+ mfgDate + "]";
	}

	@Override
	public int compareTo(ProductDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
