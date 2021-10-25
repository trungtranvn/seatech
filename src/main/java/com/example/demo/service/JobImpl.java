package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.api.JobApi;
import com.example.demo.impl.JobImplService;
import com.example.demo.model.dto.JobDTO;

@Service
public class JobImpl implements JobApi{
@Autowired
private JobImplService servicel;
	@Override
	public List<JobDTO> getDDL() {
		List<JobDTO> jobs;
		try {
			jobs=servicel.getDDL();
			return jobs;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}

}
