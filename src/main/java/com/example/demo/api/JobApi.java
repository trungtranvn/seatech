package com.example.demo.api;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.model.dto.EmployeeDTO;
import com.example.demo.model.dto.JobDTO;

@Component
public interface JobApi {

	List<JobDTO> getDDL();

}
