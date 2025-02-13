package com.javaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.model.dto.AddressDTO;
import com.javaweb.model.dto.BuildingDTO;
import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;
import com.javaweb.service.BuildingService;

@Service
public class BuildingServiceImpl implements BuildingService{

	@Autowired
	private BuildingRepository buildingRepository;
	
	@Override
	public List<BuildingDTO> findAll(String street, Integer districtId, String ward, String name,
			Integer numberOfBasement, Integer floorArea, Long rentPrice, Long staffid, String level) {
		
		List<BuildingEntity> buildingEntities = buildingRepository.
				findAll(street, districtId, ward, name, numberOfBasement, floorArea, rentPrice, staffid, level);
		List<BuildingDTO> result = new ArrayList<BuildingDTO>();
		
		for(BuildingEntity item : buildingEntities) {
			BuildingDTO buildingDTO = new BuildingDTO();
			AddressDTO addressDTO = new AddressDTO();
			
			 // Gán dữ liệu vào BuildingDTO
			buildingDTO.setFloorArea(item.getFloorArea());
			buildingDTO.setLevel(item.getLevel());
			buildingDTO.setName(item.getName());
			buildingDTO.setNumberOfBasement(item.getNumberOfBasement());
			buildingDTO.setRentPrice(item.getRentPrice());
			buildingDTO.setStaffid(item.getStaffid());
			buildingDTO.setStaffManager(item.getStaffManager());
			
			 // Gán địa chỉ vào AddressDTO
            if (item.getAddress() != null) {
                addressDTO.setStreet(item.getAddress().getStreet());
                addressDTO.setWard(item.getAddress().getWard());
                addressDTO.setDistrict(item.getAddress().getDistrict());
            }
            
            // Gán AddressDTO vào BuildingDTO
            buildingDTO.setAddress(addressDTO);
            
            
            // Thêm vào danh sách kết quả
            result.add(buildingDTO);
			
			
		}
		
		return result;
	}

	

}
