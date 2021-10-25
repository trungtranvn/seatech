package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.api.DepartmentApi;
import com.example.demo.impl.DepartmentImplService;
import com.example.demo.model.dto.DepartmentDTO;
import com.example.demo.model.dto.EmployeeDTO;

@Service
public class DepartmentImpl implements DepartmentApi {
	@Autowired
	private DepartmentImplService service;

	@Override
	public List<DepartmentDTO> getDdlDepartment() {
		List<DepartmentDTO> deps;
		try {
			deps = service.getDdlDepartment();
			return deps;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
}
