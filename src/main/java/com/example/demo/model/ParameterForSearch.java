package com.example.demo.model;

import java.math.BigDecimal;

public class ParameterForSearch {

	public String name;
	public String jobId;
	public BigDecimal departmentId;
	public BigDecimal managerId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public BigDecimal getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(BigDecimal departmentId) {
		this.departmentId = departmentId;
	}
	public BigDecimal getManagerId() {
		return managerId;
	}
	public void setManagerId(BigDecimal managerId) {
		this.managerId = managerId;
	}
	
}
