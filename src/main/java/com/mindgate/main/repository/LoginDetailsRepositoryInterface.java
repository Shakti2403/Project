package com.mindgate.main.repository;

import java.util.List;

import com.mindgate.main.domain.Login;

public interface LoginDetailsRepositoryInterface
{
	public List<Login> getAllLoginDetails();
	public boolean addNewLoginDetails(Login login);
	public Login verifyLoginDetails(Login login);
}
