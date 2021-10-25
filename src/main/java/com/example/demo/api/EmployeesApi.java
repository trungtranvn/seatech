package com.example.demo.api;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.model.dto.EmployeeDTO;
@Component
public interface EmployeesApi {
//	List<EmployeeDTO> getAll();

	List<EmployeeDTO> getEmployees();
	
	List<EmployeeDTO> getResultSelect(HashMap<String, String> param);

	EmployeeDTO getInfo(String id);

	String deletaEmployee(Integer id);

	
}
