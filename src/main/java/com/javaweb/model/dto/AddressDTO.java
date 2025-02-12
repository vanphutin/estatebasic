package com.javaweb.model.dto;

public class AddressDTO {
	 private String street;
	 private Integer districtId;
	 private String ward;
	 
	public AddressDTO() {
		super();
	}
	public AddressDTO(String street, Integer districtId, String ward) {
		super();
		this.street = street;
		this.districtId = districtId;
		this.ward = ward;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Integer getDistrictId() {
		return districtId;
	}
	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}
	public String getWard() {
		return ward;
	}
	public void setWard(String ward) {
		this.ward = ward;
	}
	
	
	
	
}
