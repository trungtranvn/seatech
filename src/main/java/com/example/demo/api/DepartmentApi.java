package com.example.demo.api;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.model.dto.DepartmentDTO;

@Component
public interface DepartmentApi {
List<DepartmentDTO> getDdlDepartment();
}
