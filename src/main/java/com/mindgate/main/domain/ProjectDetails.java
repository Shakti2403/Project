package com.mindgate.main.domain;

public class ProjectDetails {

	private int projectId;
	private String projectName;
	private String skill1;
	private String skill2;
	private String skill3;
	private String budget;
	private String status;
	
	
	public ProjectDetails() {
		// TODO Auto-generated constructor stub
	}


	public ProjectDetails(int projectId, String projectName, String skill1, String skill2, String skill3, String budget,
			String status) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.skill1 = skill1;
		this.skill2 = skill2;
		this.skill3 = skill3;
		this.budget = budget;
		this.status = status;
	}


	public int getProjectId() {
		return projectId;
	}


	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public String getSkill1() {
		return skill1;
	}


	public void setSkill1(String skill1) {
		this.skill1 = skill1;
	}


	public String getSkill2() {
		return skill2;
	}


	public void setSkill2(String skill2) {
		this.skill2 = skill2;
	}


	public String getSkill3() {
		return skill3;
	}


	public void setSkill3(String skill3) {
		this.skill3 = skill3;
	}


	public String getBudget() {
		return budget;
	}


	public void setBudget(String budget) {
		this.budget = budget;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "ProjectDetails [projectId=" + projectId + ", projectName=" + projectName + ", skill1=" + skill1
				+ ", skill2=" + skill2 + ", skill3=" + skill3 + ", budget=" + budget + ", status=" + status + "]";
	}
	
	
	
}
