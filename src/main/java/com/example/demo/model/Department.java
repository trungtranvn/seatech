package com.example.demo.model;

import java.math.BigDecimal;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Department {
private BigDecimal departmentId;
private String departmentName;
private BigDecimal managerId;
private BigDecimal locationId;

public Department() {}

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
