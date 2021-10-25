package com.example.demo.service;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.api.EmployeesApi;
import com.example.demo.controller.HomeController;
import com.example.demo.impl.EmployeesImplService;
import com.example.demo.model.dto.EmployeeDTO;

@Service
public class EmployeesImpl implements EmployeesApi {
	

	@Autowired
	private EmployeesImplService service;
	public List<EmployeeDTO> getEmployees() {
		List<EmployeeDTO> ems;
		try {
			ems = service.getAll();
			return ems;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	@Override
	public List<EmployeeDTO> getResultSelect(HashMap<String, String> param) {
		List<EmployeeDTO> result;
		try {
			result = service.getResultForSearch(param);
			return result;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	@Override
	public EmployeeDTO getInfo(String id) {
		// TODO Auto-generated method stub
		EmployeeDTO result;
		try {
			result = service.getInfoById(id);
			return result;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	@Override
	public String deletaEmployee(Integer id) {
		String result;
		try {
			 result = service.deleteById(id);
			return result;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
}
