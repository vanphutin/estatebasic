package com.javaweb.repository;

import java.util.List;

import com.javaweb.repository.entity.AddressEntity;
import com.javaweb.repository.entity.BuildingEntity;

public interface BuildingRepository {

	List<BuildingEntity> findAll(String street, Integer districtId, String ward, String name, 
			Integer numberOfBasement, Integer floorArea, Long rentPrice, Long staffid, String level);
}
