package com.example.demo.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.model.dto.DepartmentDTO;
@Component
public interface DepartmentImplService {
List<DepartmentDTO> getDdlDepartment();
}
