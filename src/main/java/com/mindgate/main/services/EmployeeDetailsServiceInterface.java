package com.mindgate.main.services;

import java.util.List;

import com.mindgate.main.domain.EmployeeDetails;

public interface EmployeeDetailsServiceInterface {

	

	public  EmployeeDetails getByLoginId(int loginId);
	
	  public List<EmployeeDetails> getAllEmployeeDetailsByProjectId(int projectId);
}
