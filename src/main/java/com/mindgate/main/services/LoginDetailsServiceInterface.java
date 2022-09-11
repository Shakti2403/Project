package com.mindgate.main.services;

import java.util.List;

import com.mindgate.main.domain.Login;

public interface LoginDetailsServiceInterface
{
	public List<Login> getAllLoginDetails();
	public boolean addNewLoginDetails(Login login);
	public Login verifyLoginDetails(Login login);
}
