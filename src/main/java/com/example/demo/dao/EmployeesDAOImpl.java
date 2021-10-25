package com.example.demo.dao;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.impl.EmployeesImplService;
import com.example.demo.model.Employee;
import com.example.demo.model.ParameterForSearch;
import com.example.demo.model.dto.EmployeeDTO;
import com.ibatis.sqlmap.client.SqlMapClient;

@Repository
public class EmployeesDAOImpl implements EmployeesImplService {
	ModelMapper mapper = new ModelMapper();

	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeeDTO> getAll() {
		SqlMapClient smc = SqlMapClientConfig.getSqlMapClient();
		System.out.println("chao");
		try {
			List<Employee> ems = (List<Employee>) smc.queryForList("Employee.getAll", null);
			System.out.println("alo aloa loa laoaoaaoaoaoalao");

			final List<EmployeeDTO> dTOs = ems.stream().map(entity -> mapper.map(entity, EmployeeDTO.class))
					.collect(Collectors.toList());
			return dTOs;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Errorrrrrr!");
			return null;
		}

	}

	@Override
	public List<EmployeeDTO> getResultForSearch(HashMap<String, String> param) {
		SqlMapClient smc = SqlMapClientConfig.getSqlMapClient();
		System.out.println("chao");
		try {
			String employeeName = null;
			String jobId = null;
			BigDecimal departmentId = null;
			BigDecimal managerId = null;
			ParameterForSearch paramEm = new ParameterForSearch();

			if (param.get("employeeName") != null) {
				employeeName = param.get("name");
				paramEm.setName(employeeName);
			}
			if (!param.get("jobId").equals("null")) {
				jobId = param.get("jobId");
				paramEm.setJobId(jobId);
			}
			if (!param.get("departmentId").equals("null")) {
				departmentId = new BigDecimal(param.get("departmentId"));
				paramEm.setDepartmentId(departmentId);
			}
			if (!param.get("managerId").equals("null")) {
				managerId = new BigDecimal(param.get("managerId"));
				paramEm.setManagerId(managerId);
			}

			List<Employee> ems = (List<Employee>) smc.queryForList("Employee.getResultForSearch", paramEm);
			System.out.println("alo aloa loa laoaoaaoaoaoalao");

			final List<EmployeeDTO> dTOs = ems.stream().map(entity -> mapper.map(entity, EmployeeDTO.class))
					.collect(Collectors.toList());
			return dTOs;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Errorrrrrr!");
			System.out.println(e);
			return null;
		}

	}

	@Override
	public EmployeeDTO getInfoById(String id) {
		// TODO Auto-generated method stub
		SqlMapClient smc = SqlMapClientConfig.getSqlMapClient();
		System.out.println("chao");
		try {
			Employee em = (Employee) smc.queryForObject("Employee.useResultMap", id);
			System.out.println("alo aloa loa laoaoaaoaoaoalao");

			final EmployeeDTO dTO = mapper.map(em, EmployeeDTO.class);
					
			return dTO;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Errorrrrrr!");
			System.out.println(e);
			return null;
		}

	}

	@Override
	public String deleteById(Integer id) {
		SqlMapClient smc = SqlMapClientConfig.getSqlMapClient();
		System.out.println("chao");
		try {
			smc.delete("Employee.delete",id);
			String result="delete success!";
			return result;
		} catch (Exception e) {
			String result = "Error!";
			System.out.println(result);
			System.out.println(e);
			return null;
		}

	}
}
