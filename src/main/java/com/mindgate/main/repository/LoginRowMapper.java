package com.mindgate.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.domain.Login;

public class LoginRowMapper implements RowMapper<Login> {

	@Override
	public Login mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		int user_id = rs.getInt("user_id");
		String user_password =rs.getString("user_password");
		String designation = rs.getString("designation");
		
		Login login = new Login(user_id, user_password, designation);
		return login;
	}

}
