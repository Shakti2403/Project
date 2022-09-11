package com.mindgate.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.domain.EmployeeDetails;
import com.mindgate.main.domain.JobRequest;
import com.mindgate.main.domain.Login;
import com.mindgate.main.domain.ProjectDetails;

public class JobRequestRowMapper implements RowMapper<JobRequest> {

	@Override
	public JobRequest mapRow(ResultSet rs, int rowNum) throws SQLException {
//		int jobId = rs.getInt("job_id");
//		int projectId = rs.getInt("project_id");
//		int employeeId = rs.getInt("employee_id");
//		String projectName = rs.getString("project_name");
//		int budget = rs.getInt("budget");
//		String skill1 = rs.getString("skill_1");
//		String skill2 = rs.getString("skill_2");
//		String skill3 = rs.getString("skill_3");
//		int count = rs.getInt("count");

		JobRequest jobRequest = new JobRequest();
		jobRequest.setJobId(rs.getInt("job_id"));
//		jobRequest.setProjectId(rs.getInt("project_id"));
		// jobRequest.setEmployeeId(rs.getInt("employee_id"));
		jobRequest.setSkill1(rs.getString("skill_1"));
		jobRequest.setSkill2(rs.getString("skill_2"));
		jobRequest.setSkill3(rs.getString("skill_3"));
		jobRequest.setCount(rs.getInt("count"));
		jobRequest.setStatus(rs.getString("status"));
		
		System.out.println(jobRequest);

		ProjectDetails projectDetails = new ProjectDetails();
		projectDetails.setProjectId(rs.getInt("project_id"));
		projectDetails.setProjectName(rs.getString("project_name"));
		projectDetails.setSkill1(rs.getString("project_skill_1"));
		projectDetails.setSkill2(rs.getString("project_skill_2"));
		projectDetails.setSkill3(rs.getString("project_skill_3"));
		projectDetails.setBudget(rs.getString("budget"));
		projectDetails.setStatus(rs.getString("status"));

		System.out.println(projectDetails);

		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.setEmployeeId(rs.getInt("employee_id"));
		employeeDetails.setFirstName(rs.getString("first_name"));
		employeeDetails.setLastName(rs.getString("last_name"));
		employeeDetails.setContact(rs.getInt("contact"));
		employeeDetails.setDesignation(rs.getString("designation"));
		employeeDetails.setSkill1(rs.getString("employee_skill_1"));
		employeeDetails.setSkill2(rs.getString("employee_skill_2"));
		employeeDetails.setSkill3(rs.getString("employee_skill_3"));
		employeeDetails.setBench(rs.getString("bench"));
		employeeDetails.setSalary(rs.getInt("salary"));
		employeeDetails.setAddress(rs.getString("address"));
		employeeDetails.setCity(rs.getString("city"));
		employeeDetails.setState(rs.getString("state"));
		employeeDetails.setPincode(rs.getInt("pin_code"));
		
		Login login = new Login();
		login.setUserId(rs.getInt("user_id"));
		employeeDetails.setLogin(login);

		System.out.println(employeeDetails);

		jobRequest.setEmployeeDetails(employeeDetails);
		jobRequest.setProjectDetails(projectDetails);

		System.out.println("------");

		System.out.println(jobRequest);
		return jobRequest;

	}

}
