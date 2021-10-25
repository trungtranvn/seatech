package com.example.demo.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.model.dto.EmployeeDTO;
@Component
public interface EmployeesImplService {
	public List<EmployeeDTO> getAll();

	public List<EmployeeDTO> getResultForSearch(HashMap<String, String> param);

	public EmployeeDTO getInfoById(String id);

	public String deleteById(Integer id);
}
