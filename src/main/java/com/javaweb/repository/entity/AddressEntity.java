package com.javaweb.repository.entity;

public class AddressEntity {
	 private String street;
	 private Integer districtId;
	 private String ward;
	 
	 
	 
	public AddressEntity() {
		super();
	}
	public AddressEntity(String street, Integer districtId, String ward) {
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
