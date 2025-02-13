package com.javaweb.service;

import java.util.List;

import com.javaweb.model.dto.BuildingDTO;

public interface BuildingService {
	List<BuildingDTO> findAll(String street, Integer districtId, String ward, String name,
			Integer numberOfBasement, Integer floorArea, Long rentPrice, Long staffid, String level);
}
