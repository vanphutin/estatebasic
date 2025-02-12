package com.javaweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.model.dto.BuildingDTO;
import com.javaweb.service.BuildingService;

@RestController
@RequestMapping(value = "/api")
public class BuildingController {

	@Autowired
	private BuildingService buildingService;

	@GetMapping(value = "/building/")
	public List<BuildingDTO> getBuilding(@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "numberOfBasement", required = false) Integer numberOfBasement,
			@RequestParam(value = "floorArea", required = false) Integer floorArea,
			@RequestParam(value = "rentPrice", required = false) Long rentPrice,
			@RequestParam(value = "staffId", required = false) Long staffId,
			@RequestParam(value = "level", required = false) String level,
			@RequestParam(value = "street", required = false) String street,
			@RequestParam(value = "districtId", required = false) Integer districtId,
			@RequestParam(value = "ward", required = false) String ward) {
		return buildingService.findAll(street, districtId, ward, name, numberOfBasement, floorArea, rentPrice, staffId,
				level);
	}
}
