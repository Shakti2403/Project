package com.mindgate.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.domain.EmployeeDetails;
import com.mindgate.main.repository.EmployeeDetailsRepositoryInterface;
@Service
public class EmployeeDetailsService implements EmployeeDetailsServiceInterface {

	@Autowired
	private EmployeeDetailsRepositoryInterface detailsRepositoryInterface;
	
	@Override
	public EmployeeDetails getByLoginId(int loginId) {
		// TODO Auto-generated method stub
		return detailsRepositoryInterface.getByLoginId(loginId);
	}

	@Override
	public List<EmployeeDetails> getAllEmployeeDetailsByProjectId(int projectId) {
		return detailsRepositoryInterface.getAllEmployeeDetailsByProjectId(projectId);
	}

}
