package com.javaweb.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;

@Repository
public class BuildingRepositoryImpl implements BuildingRepository{

	@Override
	public List<BuildingEntity> findAll(String street, Integer districtId, String ward, String name,
			Integer numberOfBasement, Integer floorArea, Long rentPrice, Long staffId, String level) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
