package com.mindgate.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.domain.Login;
import com.mindgate.main.repository.LoginDetailsRepositoryInterface;


@Service
public class LoginService implements LoginDetailsServiceInterface {

	@Autowired
	private LoginDetailsRepositoryInterface loginDetailsRepository;
	
	@Override
	public List<Login> getAllLoginDetails() {
		
		return loginDetailsRepository.getAllLoginDetails();
	}

	@Override
	public boolean addNewLoginDetails(Login login) {
	  
		return loginDetailsRepository.addNewLoginDetails(login);
	}

	@Override
	public Login verifyLoginDetails(Login login) {
		
		return  loginDetailsRepository.verifyLoginDetails(login);
	}

}
