package com.mindgate.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.domain.Login;
import com.mindgate.main.services.LoginDetailsServiceInterface;

@CrossOrigin("*")
@RestController
@RequestMapping("loginapi")
public class LoginDetailsController
{
	@Autowired
	private LoginDetailsServiceInterface detailsServiceInterface;
	
	//http://localhost:8080/loginapi/login/all
	@RequestMapping(value = "login/all" , method = RequestMethod.GET)
	public List<Login> getAllLoginDetails()
	{
		List<Login> allLoginDetails = detailsServiceInterface.getAllLoginDetails();
		return allLoginDetails;
	}
	
	//http://localhost:8080/loginapi/login
	@RequestMapping(value="login" ,method = RequestMethod.POST)
	public boolean addNewLoginDetails(Login login)
	{
		
		return detailsServiceInterface.addNewLoginDetails(login);	
	}
	
	@RequestMapping(value="logindetails" ,method = RequestMethod.POST)
	public Login VerifyLoginDetails(@RequestBody Login login)
	{
		System.out.println(login);
		return detailsServiceInterface.verifyLoginDetails(login);
	}
}
