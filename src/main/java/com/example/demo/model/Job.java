package com.example.demo.model;

import java.math.BigDecimal;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Job {
	private String jobId;
	private String jobTitle;
	private BigDecimal minSalary;
	private BigDecimal maxSalary;

	public Job() {
	}

	public Job(
			String Job_Id, 
			String Job_Title, 
			BigDecimal Min_Salary, 
			BigDecimal Max_Salary) 
	{
		this.jobId = Job_Id;
		this.jobTitle = Job_Title;
		this.minSalary = Min_Salary;
		this.maxSalary = Max_Salary;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public BigDecimal getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(BigDecimal minSalary) {
		this.minSalary = minSalary;
	}

	public BigDecimal getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(BigDecimal maxSalary) {
		this.maxSalary = maxSalary;
	}
}
