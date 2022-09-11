package com.mindgate.main.domain;

import java.util.Objects;

public class JobRequest {
	private int jobId;
	private String skill1;
	private String skill2;
	private String skill3;
	private int count;
	private ProjectDetails projectDetails;
	private EmployeeDetails employeeDetails;
	private String status;
 
	public JobRequest() {
		// TODO Auto-generated constructor stub
	}

	public JobRequest(int jobId, String skill1, String skill2, String skill3, int count, ProjectDetails projectDetails,
			EmployeeDetails employeeDetails, String status) {
		super();
		this.jobId = jobId;
		this.skill1 = skill1;
		this.skill2 = skill2;
		this.skill3 = skill3;
		this.count = count;
		this.projectDetails = projectDetails;
		this.employeeDetails = employeeDetails;
		this.status = status;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public ProjectDetails getProjectDetails() {
		return projectDetails;
	}

	public void setProjectDetails(ProjectDetails projectDetails) {
		this.projectDetails = projectDetails;
	}

	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "JobRequest [jobId=" + jobId + ", skill1=" + skill1 + ", skill2=" + skill2 + ", skill3=" + skill3
				+ ", count=" + count + ", projectDetails=" + projectDetails + ", employeeDetails=" + employeeDetails
				+ ", status=" + status + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(count, employeeDetails, jobId, projectDetails, skill1, skill2, skill3, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JobRequest other = (JobRequest) obj;
		return count == other.count && Objects.equals(employeeDetails, other.employeeDetails) && jobId == other.jobId
				&& Objects.equals(projectDetails, other.projectDetails) && Objects.equals(skill1, other.skill1)
				&& Objects.equals(skill2, other.skill2) && Objects.equals(skill3, other.skill3)
				&& Objects.equals(status, other.status);
	}
	
	
	
}
