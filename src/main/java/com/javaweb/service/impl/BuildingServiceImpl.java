package com.javaweb.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javaweb.model.dto.AddressDTO;
import com.javaweb.model.dto.BuildingDTO;
import com.javaweb.service.BuildingService;

@Service
public class BuildingServiceImpl implements BuildingService{

	@Override
	public List<BuildingDTO> findAll(String street, Integer districtId, String ward, String name,
			Integer numberOfBasement, Integer floorArea, Long rentPrice, Long staffId, String level) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
