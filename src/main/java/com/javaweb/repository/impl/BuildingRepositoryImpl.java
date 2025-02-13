package com.javaweb.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.AddressEntity;
import com.javaweb.repository.entity.BuildingEntity;

@Repository
public class BuildingRepositoryImpl implements BuildingRepository {

	// Kết nối DB
	static final String DB_URL = "jdbc:mysql://localhost:3306/estatebasic";
	static final String USER = "root";
	static final String PASS = "12345";

	@Override
	public List<BuildingEntity> findAll(String street, Integer districtId, String ward, String name,
			Integer numberOfBasement, Integer floorArea, Long rentPrice, Long staffid, String level) {
		StringBuilder query = new StringBuilder(
				"SELECT  b.name , b.floorarea, b.level, b.numberofbasement, b.rentprice, b.street,"
				+ " b.ward, d.name, a.staffid, u.fullname "
				+ "FROM building b "
				+ "JOIN district d ON d.id = b.districtid "
				+ "JOIN assignmentbuilding a ON a.buildingid = b.id "
				+ "JOIN user u ON u.id = a.staffid "
				+ "WHERE 1=1 ");

		// Thêm điều kiện nếu tham số không null
		if (street != null && !street.isEmpty()) {
			query.append("AND b.street LIKE '%").append(street).append("%' ");
		}
		if (districtId != null) {
			query.append("AND b.districtId = ").append(districtId).append(" ");
		}
		if (ward != null && !ward.isEmpty()) {
			query.append("AND b.ward LIKE '%").append(ward).append("%' ");
		}
		if (name != null && !name.isEmpty()) {
			query.append("AND b.name LIKE '%").append(name).append("%' ");
		}
		if (numberOfBasement != null) {
			query.append("AND b.numberOfBasement = ").append(numberOfBasement).append(" ");
		}
		if (floorArea != null) {
			query.append("AND b.floorArea = ").append(floorArea).append(" ");
		}
		if (rentPrice != null) {
			query.append("AND b.rentPrice = ").append(rentPrice).append(" ");
		}
		if (staffid != null) {
			query.append("AND staffid = ").append(staffid).append(" ");
		}
		if (level != null && !level.isEmpty()) {
			query.append("AND b.level LIKE '%").append(level).append("%' ");
		}

		List<BuildingEntity> result = new ArrayList<>();

		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query.toString())) {

			while (rs.next()) {
				BuildingEntity building = new BuildingEntity();
				AddressEntity address = new AddressEntity();

				// Lấy dữ liệu từ ResultSet
				building.setFloorArea(rs.getInt("floorArea"));
				building.setLevel(rs.getString("level"));
				building.setName(rs.getString("name"));
				building.setNumberOfBasement(rs.getInt("numberOfBasement"));
				building.setRentPrice(rs.getLong("rentPrice"));
				building.setStaffManager(rs.getString("fullname"));

				address.setStreet(rs.getString("street"));
				address.setWard(rs.getString("ward"));
				address.setDistrict(rs.getString("name"));

				// Gán địa chỉ vào building
				building.setAddress(address);

				result.add(building);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}
}
