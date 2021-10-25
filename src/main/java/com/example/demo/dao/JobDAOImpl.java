package com.example.demo.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.impl.JobImplService;
import com.example.demo.model.Employee;
import com.example.demo.model.Job;
import com.example.demo.model.dto.EmployeeDTO;
import com.example.demo.model.dto.JobDTO;
import com.ibatis.sqlmap.client.SqlMapClient;

@Repository
public class JobDAOImpl implements JobImplService {
	ModelMapper mapper = new ModelMapper();

	@Override
	public List<JobDTO> getDDL() {
		SqlMapClient smc = SqlMapClientConfig.getSqlMapClient();
		System.out.println("chao");
		try {
			List<Job> ems = (List<Job>) smc.queryForList("Job.getDdlJob", null);
			System.out.println("alo aloa loa laoaoaaoaoaoalao");

			final List<JobDTO> dTOs = ems.stream().map(entity -> mapper.map(entity, JobDTO.class))
					.collect(Collectors.toList());
			return dTOs;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Errorrrrrr!");
			System.out.println(e);
			return null;
		}
	}

}
