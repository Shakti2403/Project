package com.mindgate.main.domain;

public class EmployeeDetails {

	private int employeeId;
	private String firstName;
	private String lastName;
	private int contact;
	private String designation;
	private String skill1;
	private String skill2;
	private String skill3;
	private String bench;
	private int salary;
	private String address;
	private String city;
	private String state;
	private int pincode;
	private Login login;
	private ProjectDetails projectDetails;

	public EmployeeDetails() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeDetails(int employeeId, String firstName, String lastName, int contact, String designation,
			String skill1, String skill2, String skill3, String bench, int salary, String address, String city,
			String state, int pincode, Login login, ProjectDetails projectDetails) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		this.designation = designation;
		this.skill1 = skill1;
		this.skill2 = skill2;
		this.skill3 = skill3;
		this.bench = bench;
		this.salary = salary;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.login = login;
		this.projectDetails = projectDetails;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
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

	public String getBench() {
		return bench;
	}

	public void setBench(String bench) {
		this.bench = bench;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public ProjectDetails getProjectDetails() {
		return projectDetails;
	}

	public void setProjectDetails(ProjectDetails projectDetails) {
		this.projectDetails = projectDetails;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", contact=" + contact + ", designation=" + designation + ", skill1=" + skill1 + ", skill2=" + skill2
				+ ", skill3=" + skill3 + ", bench=" + bench + ", salary=" + salary + ", address=" + address + ", city="
				+ city + ", state=" + state + ", pincode=" + pincode + ", login=" + login + ", projectDetails="
				+ projectDetails + "]";
	}

}
