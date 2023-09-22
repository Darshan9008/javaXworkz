package com.xworkz.newspaper.app.dto;

import java.io.Serializable;
import java.util.Objects;

public class NewspaperDTO implements Serializable{

	private String publisher;
	private String language;
	private int noOfPages;
	private int size;
	
	
	public NewspaperDTO(String publisher,String language,int noOfPages,int size) {
		
       this.publisher=publisher;
       this.language=language;
       this.noOfPages=noOfPages;
       this.size=size;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	@Override
	public String toString() {
		return "NewspaperDTO [publisher=" + publisher + ", language=" + language + ", noOfPages=" + noOfPages
				+ ", size=" + size + "]";
	}


	public int getNoOfPages() {
		return noOfPages;
	}


	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	@Override
	public int hashCode() {
		return Objects.hash(language, noOfPages, publisher, size);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NewspaperDTO other = (NewspaperDTO) obj;
		return Objects.equals(language, other.language) && noOfPages == other.noOfPages
				&& Objects.equals(publisher, other.publisher) && size == other.size;
	}
	
	
	
	
	
	
}
