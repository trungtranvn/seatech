package com.example.demo.model.dto;


import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class EmployeeDTO {

	public BigDecimal employeesId;
	public String firstName;
	public String lastName;
	public String email;
	public String numberPhone;
	public Date hireDate;
	public String jobId;
	public BigDecimal salary;
	public BigDecimal commissionPct;
	public BigDecimal managerId;
	public BigDecimal departmentId;
	
	public String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getEmployeesId() {
		return employeesId;
	}
	public void setEmployeesId(BigDecimal employeesId) {
		this.employeesId = employeesId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumberPhone() {
		return numberPhone;
	}
	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public BigDecimal getCommissionPct() {
		return commissionPct;
	}
	public void setCommissionPct(BigDecimal commissionPct) {
		this.commissionPct = commissionPct;
	}
	public BigDecimal getManagerId() {
		return managerId;
	}
	public void setManagerId(BigDecimal managerId) {
		this.managerId = managerId;
	}
	public BigDecimal getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(BigDecimal departmentId) {
		this.departmentId = departmentId;
	}
}