package com.example.demo.model.dto;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepartmentDTO {
	public BigDecimal departmentId;
	public String departmentName;
	public BigDecimal managerId;
	public BigDecimal locationId;
	public BigDecimal getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(BigDecimal departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public BigDecimal getManagerId() {
		return managerId;
	}
	public void setManagerId(BigDecimal managerId) {
		this.managerId = managerId;
	}
	public BigDecimal getLocationId() {
		return locationId;
	}
	public void setLocationId(BigDecimal locationId) {
		this.locationId = locationId;
	}

}
