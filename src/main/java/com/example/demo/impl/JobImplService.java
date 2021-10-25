package com.example.demo.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.model.dto.JobDTO;

@Component
public interface JobImplService {

	List<JobDTO> getDDL();

}
