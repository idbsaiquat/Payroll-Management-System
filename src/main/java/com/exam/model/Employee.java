package com.exam.model;

import java.util.Date;

public class Employee {
	
	private String first_name;
	private String surname;
	private Date dob;
	private String gender;
	private String email;
	private String contact_no;
	private String address;
	private String department;
	private String designation;
	private String status;
	private Date doh;
	private double basic_salary;
	private String username;
	private String password;
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDoh() {
		return doh;
	}
	public void setDoh(Date doh) {
		this.doh = doh;
	}
	public double getBasic_salary() {
		return basic_salary;
	}
	public void setBasic_salary(double basic_salary) {
		this.basic_salary = basic_salary;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Employee [first_name=" + first_name + ", surname=" + surname + ", dob=" + dob + ", gender=" + gender
				+ ", email=" + email + ", contact_no=" + contact_no + ", address=" + address + ", department="
				+ department + ", designation=" + designation + ", status=" + status + ", doh=" + doh
				+ ", basic_salary=" + basic_salary + ", username=" + username + ", password=" + password + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
