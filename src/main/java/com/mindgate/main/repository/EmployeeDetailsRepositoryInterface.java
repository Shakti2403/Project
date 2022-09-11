package com.mindgate.main.repository;

import java.util.List;

import com.mindgate.main.domain.EmployeeDetails;

public interface EmployeeDetailsRepositoryInterface {

	
	public  EmployeeDetails getByLoginId(int employeeId);
	
   public List<EmployeeDetails> getAllEmployeeDetailsByProjectId(int projectId);
}
