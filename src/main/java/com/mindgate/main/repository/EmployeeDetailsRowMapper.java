package com.mindgate.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.domain.EmployeeDetails;
import com.mindgate.main.domain.Login;
import com.mindgate.main.domain.ProjectDetails;

public class EmployeeDetailsRowMapper implements RowMapper<EmployeeDetails> {

	@Override
	public EmployeeDetails mapRow(ResultSet rs, int rowNum) throws SQLException {

		int employeeId = rs.getInt("employee_id");
		String firstName = rs.getString("first_name");
		String lastName = rs.getString("last_name");
		int contact = rs.getInt("contact");
		String designation = rs.getString("designation");
		String skill1 = rs.getString("skill_1");
		String skill2 = rs.getString("skill_2");
		String skill3 = rs.getString("skill_3");
		String bench = rs.getString("bench");
		int salary = rs.getInt("salary");
		String address = rs.getString("address");
		// String street = rs.getString("street");
		String city = rs.getString("city");
		int pin = rs.getInt("pin_code");
		int userId = rs.getInt("user_id");
		int project_id = rs.getInt("project_id");
		ProjectDetails projectDetails = new ProjectDetails();
		projectDetails.setProjectId(project_id);

		Login login = new Login();
		login.setUserId(userId);

		EmployeeDetails employeeDetails = new EmployeeDetails(employeeId, firstName, lastName, contact, designation,
				skill1, skill2, skill3, bench, salary, address, city, city, pin, login, projectDetails);
		return employeeDetails;
	}

}
