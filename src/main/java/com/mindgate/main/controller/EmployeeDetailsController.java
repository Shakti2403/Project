package com.mindgate.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.domain.EmployeeDetails;
import com.mindgate.main.services.EmployeeDetailsServiceInterface;

@RestController
@CrossOrigin("*")
@RequestMapping("employeeapi")
public class EmployeeDetailsController {

	@Autowired
	private EmployeeDetailsServiceInterface detailsServiceInterface;

	@RequestMapping(value = "employee/{loginId}" , method = RequestMethod.GET)
	public EmployeeDetails getSingleEmployeeDetailsByEmployeeId(@PathVariable int loginId)
	{
		return detailsServiceInterface.getByLoginId(loginId);
	}
	
	@RequestMapping(value = "employee/{project_id}" , method = RequestMethod.GET)
	public List<EmployeeDetails> getAllEmployeeDetails(int projectId)
	{
		return detailsServiceInterface.getAllEmployeeDetailsByProjectId(projectId);
	}
	
}
