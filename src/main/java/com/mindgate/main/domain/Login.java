package com.mindgate.main.domain;

public class Login {
	private int userId;
	private String userPassword;
	private String designation;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Login() {
		// TODO Auto-generated constructor stub
	}

	public Login(int userId, String userPassword, String designation) {
		super();
		this.userId = userId;
		this.userPassword = userPassword;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Login [userId=" + userId + ", userPassword=" + userPassword + ", designation=" + designation + "]";
	}

}