package com.xworkz.college.app.dto;

import java.io.Serializable;
import java.util.Objects;

public class CollegeDTO implements Serializable {

	private int collegeStrength;
	private String collegeName;
	private int collegeID;
	private String district;
	private String location;
	private String address;
	private boolean library;
	private int noOfGround;
	private int noOfBoys;
	private int noOfGirls;
	
	
	public CollegeDTO() {
		
	}
	
	public CollegeDTO(int collegeStrength,String collegeName,int collegeID, String district,String location,String address,boolean library,
			int noOfGround,int noOfBoys,int noOfGirls) {
		this.collegeStrength=collegeStrength;
		this.collegeName=collegeName;
		this.collegeID=collegeID;
		this.district=district;
		this.location=location;
		this.address=address;
		this.library=library;
		this.noOfGround=noOfGround;
		this.noOfBoys=noOfBoys;
		this.noOfGirls=noOfGirls;
		
	}
	
	public int getCollegeStrength() {
		return collegeStrength;
	}
	public void setCollegeStrength(int collegeStrength) {
		this.collegeStrength = collegeStrength;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getCollegeID() {
		return collegeID;
	}
	public void setCollegeID(int collegeID) {
		this.collegeID = collegeID;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isLibrary() {
		return library;
	}
	public void setLibrary(boolean library) {
		this.library = library;
	}
	public int getNoOfGround() {
		return noOfGround;
	}
	public void setNoOfGround(int noOfGround) {
		this.noOfGround = noOfGround;
	}
	public int getNoOfBoys() {
		return noOfBoys;
	}
	public void setNoOfBoys(int noOfBoys) {
		this.noOfBoys = noOfBoys;
	}
	public int getNoOfGirls() {
		return noOfGirls;
	}
	public void setNoOfGirls(int noOfGirls) {
		this.noOfGirls = noOfGirls;
	}
	@Override
	public String toString() {
		return "CollegeDTO [collegeStrength=" + collegeStrength + ", collegeName=" + collegeName + ", collegeID="
				+ collegeID + ", district=" + district + ", location=" + location + ", address=" + address
				+ ", library=" + library + ", noOfGround=" + noOfGround + ", noOfBoys=" + noOfBoys + ", noOfGirls="
				+ noOfGirls + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, collegeID, collegeName, collegeStrength, district, library, location, noOfBoys,
				noOfGirls, noOfGround);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CollegeDTO other = (CollegeDTO) obj;
		return Objects.equals(address, other.address) && collegeID == other.collegeID
				&& Objects.equals(collegeName, other.collegeName) && collegeStrength == other.collegeStrength
				&& Objects.equals(district, other.district) && library == other.library
				&& Objects.equals(location, other.location) && noOfBoys == other.noOfBoys
				&& Objects.equals(noOfGirls, other.noOfGirls) && noOfGround == other.noOfGround;
	}
	
	
	
	
	
	
	
	
}
