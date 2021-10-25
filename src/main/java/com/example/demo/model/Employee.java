package com.example.demo.model;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
public class Employee {

	private BigDecimal employeesId;
	private String firstName;
	private String lastName;
	private String email;
	private String numberPhone;
	private Date hireDate;
	private String jobId;
	private BigDecimal salary;
	private BigDecimal commissionPct;
	private BigDecimal managerId;
	private BigDecimal departmentId;

	private String name;
	public Employee() {
	}

	public Employee(
		BigDecimal EMPLOYEE_ID,
		String FIRST_NAME,
		String LAST_NAME,
		String EMAIL,
		String PHONE_NUMBER,
		Date HIRE_DATE,
		String JOB_ID,
		BigDecimal SALARY,
		BigDecimal COMMISSION_PCT,
		BigDecimal MANAGER_ID,
		BigDecimal DEPARTMENT_ID) {
		this.employeesId=EMPLOYEE_ID;
		this.firstName = FIRST_NAME;
		this.lastName = LAST_NAME;
		this.email = EMAIL;
		this.numberPhone = PHONE_NUMBER;
		this.hireDate = HIRE_DATE;
		this.jobId=JOB_ID;
		this.salary = SALARY;
		this.commissionPct = COMMISSION_PCT;
		this.managerId = MANAGER_ID;
		this.departmentId = DEPARTMENT_ID;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
