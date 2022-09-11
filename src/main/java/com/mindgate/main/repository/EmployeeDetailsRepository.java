package com.mindgate.main.repository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.main.domain.EmployeeDetails;
@Repository
public class EmployeeDetailsRepository implements EmployeeDetailsRepositoryInterface {
	
	
	private static final String SELECT_SINGLE_EMPLOYEE_DETAILS="select * from employee_details where user_id=?";
	private static final String EMPLOYEE_DETAILS_BY_EMPLOYEEID="select j.job_id , j.project_id , j.employee_id , j.skill_1 , j.skill_2 , j.skill_3 , j.count ,j.status,e.employee_id, e.first_name , e.last_name , e.contact, e.designation , e.skill_1 as employee_skill_1 , e.skill_2 as employee_skill_2 , e.skill_3 as employee_skill_3 , e.bench , e.salary , e.address, e.city , e.state, e.pin_code , e.user_id ,e.mgr from job_request j , employee_details e where  e.project_id=1000 and j.status='pending'";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public EmployeeDetails getByLoginId(int loginId) {
		EmployeeDetails employeeDetails = jdbcTemplate.queryForObject(SELECT_SINGLE_EMPLOYEE_DETAILS, new EmployeeDetailsRowMapper(), loginId);
		return employeeDetails;
	}

	

	@Override
	public List<EmployeeDetails> getAllEmployeeDetailsByProjectId(int projectId) {
		List<EmployeeDetails> employeeDetails = jdbcTemplate.query(EMPLOYEE_DETAILS_BY_EMPLOYEEID, new EmployeeDetailsRowMapper());
		return employeeDetails;
	}

}
