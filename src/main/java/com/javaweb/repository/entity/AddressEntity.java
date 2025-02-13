package com.javaweb.repository.entity;

public class AddressEntity {
	private String street;
	private Integer districtId;
	private String district;
	private String ward;
	

	public AddressEntity() {
		super();
	}

	public AddressEntity(String street, Integer districtId, String district, String ward) {
		super();
		this.street = street;
		this.districtId = districtId;
		this.district = district;
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

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

}
