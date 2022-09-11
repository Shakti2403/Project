package com.mindgate.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.main.domain.Login;

@Repository
public class LoginRepository implements LoginDetailsRepositoryInterface {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String  GET_ALL_LOGIN_DETAILS = "select * from login_details";
	private static final String  INSERT_NEW_LOGIN_DETAILS = "insert into login_details values(user_id_sequence.NEXTVAL,?,?)";
	private static final String  VERIFY_LOGIN_DETAILS ="select * from login_details where user_id=? and user_password=?";
	@Override
	public List<Login> getAllLoginDetails() {
		List<Login> allLoginList = jdbcTemplate.query(GET_ALL_LOGIN_DETAILS, new LoginRowMapper());
		return allLoginList;
	}
	@Override
	public boolean addNewLoginDetails(Login login) {
		
		Object[] params = {login.getUserId(),login.getUserPassword() , login.getDesignation()};
		int result = jdbcTemplate.update(INSERT_NEW_LOGIN_DETAILS,params);
		if(result > 0)
		{
			return true;
		}
		return false;
	}
	
	@Override
	public Login verifyLoginDetails(Login login) {
		Login VerifyLoginDetails = jdbcTemplate.queryForObject(VERIFY_LOGIN_DETAILS, new LoginRowMapper(), login.getUserId(),login.getUserPassword());
		return  VerifyLoginDetails;
	}

}
