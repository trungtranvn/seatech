package com.example.demo.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.impl.DepartmentImplService;
import com.example.demo.model.Department;
import com.example.demo.model.dto.DepartmentDTO;
import com.ibatis.sqlmap.client.SqlMapClient;
@Repository
public class DepartmentDAOImpl implements DepartmentImplService {
	ModelMapper mapper = new ModelMapper();
	@Override
	public List<DepartmentDTO> getDdlDepartment() {
		SqlMapClient smc = SqlMapClientConfig.getSqlMapClient();
		System.out.println("chao");
		try {
			List<Department> ems = (List<Department>) smc.queryForList("Department.getDdlDepartment", null);
			System.out.println("alo aloa loa laoaoaaoaoaoalao");

			final List<DepartmentDTO> dTOs = ems.stream().map(entity -> mapper.map(entity, DepartmentDTO.class))
					.collect(Collectors.toList());
			return dTOs;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Errorrrrrr!");
			return null;
		}

	}
}