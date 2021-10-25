package com.example.demo.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.api.DepartmentApi;
import com.example.demo.api.EmployeesApi;
import com.example.demo.api.JobApi;
import com.example.demo.model.dto.DepartmentDTO;
import com.example.demo.model.dto.EmployeeDTO;
import com.example.demo.model.dto.JobDTO;
import com.seatech.employeemanagement.model.Employee;

@Controller
public class HomeController {
	@Autowired
	private JobApi jobService;
	@Autowired
	private EmployeesApi employeeService;
	@Autowired
	private DepartmentApi departmentService;
	@RequestMapping(value = {"/index" }, method = RequestMethod.GET)
	public String getIndex(Model model) {
		List<EmployeeDTO> ems;
		ems = employeeService.getEmployees();
		model.addAttribute("Employees", ems);
		EmployeeDTO em = null;
		for (EmployeeDTO e : ems) {
			System.out.print("  " + e.getEmployeesId());
			System.out.print("  " + e.getName());
			
			em = e;
			System.out.println("");
		}
		List<JobDTO> jobs;
		jobs = jobService.getDDL();
		model.addAttribute("Jobs", jobs);
		JobDTO job = null;
		for (JobDTO jobDTO : jobs) {
			System.out.print("  " + jobDTO.getJobId());
			System.out.print("  " + jobDTO.getJobTitle());
			
			job = jobDTO;
			System.out.println("");
		}
		List<DepartmentDTO> deps;
		deps = departmentService.getDdlDepartment();
		model.addAttribute("Deps", deps);
		DepartmentDTO dep = null;
		for (DepartmentDTO depDTO : deps) {
			System.out.print("  " + depDTO.getDepartmentId());
			System.out.print("  " + depDTO.getDepartmentName());
			
			dep = depDTO;
			System.out.println("");
		}
		
		return "index";
	}
	@RequestMapping(value = {"/index/select" }, method = RequestMethod.GET)
	public String getSeclet( @RequestParam(value = "employeeName", required = false) String employeeName,
	        @RequestParam(value = "jobId", required = false) String jobId,
	        @RequestParam(value = "departmentId", required = false) String departmentId,
	        @RequestParam(value = "managerId", required = false) String managerId,Model model) {
		System.out.println("check get parameter");
		System.out.println(employeeName);
		System.out.println(jobId);
		System.out.println(departmentId);
		System.out.println(managerId);
		HashMap<String, String> param = new HashMap<String, String>();

		if(employeeName!=null) {
			param.put("name", employeeName);
		}
		if(jobId!=null) {
			param.put("jobId", jobId);
		}
		if(employeeName!=null) {
			param.put("departmentId", departmentId);
		}
		if(employeeName!=null) {
			param.put("managerId", managerId);
		}
		List<EmployeeDTO> result;
		result = employeeService.getResultSelect(param);
		model.addAttribute("Result", result);
		return "index";
	}
	@RequestMapping(value = {"/info" }, method = RequestMethod.GET)
	public String getInfo( @RequestParam(value = "id", required = false) String id,Model model) {
		System.out.println("check get parameter");
		System.out.println(id);
		EmployeeDTO result;
		result = employeeService.getInfo(id);
		System.out.println(result);
		model.addAttribute("Info", result);
		return "info";
	}
	@RequestMapping(value = {"/delete" }, method = RequestMethod.GET)
	public String deleteEmployee( @RequestParam(value = "id", required = false) Integer id,Model model) {
		System.out.println("check get parameter");
		System.out.println(id);
		String result;
		result = employeeService.deletaEmployee(id);
		System.out.println(result);
//		model.addAttribute("Info", result);
		return "index";
	}
	@RequestMapping(value = {"/save" }, method = RequestMethod.POST)
	public String saveEmployee(@Valid Employees employee, BindingResult result) {
		System.out.println("check get parameter");
		String result;
		result = employeeService.deletaEmployee(id);
		System.out.println(result);
//		model.addAttribute("Info", result);
		return "index";
	}
}
