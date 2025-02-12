package com.javaweb.model.dto;


public class BuildingDTO {
	    private String name;
	    private AddressDTO address;
	    private Integer numberOfBasement;
	    private Integer floorArea;
	    private Long rentPrice;
	    private Long staffId;
	    private String level;
	    
	    
		public BuildingDTO() {
			super();
		}

		public BuildingDTO(String name, AddressDTO address, Integer numberOfBasement, Integer floorArea, Long rentPrice,
				Long staffId, String level) {
			super();
			this.name = name;
			this.address = address;
			this.numberOfBasement = numberOfBasement;
			this.floorArea = floorArea;
			this.rentPrice = rentPrice;
			this.staffId = staffId;
			this.level = level;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public AddressDTO getAddress() {
			return address;
		}

		public void setAddress(AddressDTO address) {
			this.address = address;
		}

		public Integer getNumberOfBasement() {
			return numberOfBasement;
		}

		public void setNumberOfBasement(Integer numberOfBasement) {
			this.numberOfBasement = numberOfBasement;
		}

		public Integer getFloorArea() {
			return floorArea;
		}

		public void setFloorArea(Integer floorArea) {
			this.floorArea = floorArea;
		}

		public Long getRentPrice() {
			return rentPrice;
		}

		public void setRentPrice(Long rentPrice) {
			this.rentPrice = rentPrice;
		}

		public Long getStaffId() {
			return staffId;
		}

		public void setStaffId(Long staffId) {
			this.staffId = staffId;
		}

		public String getLevel() {
			return level;
		}

		public void setLevel(String level) {
			this.level = level;
		}
	    

}
