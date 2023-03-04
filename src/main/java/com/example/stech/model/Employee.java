package com.example.stech.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_dataset_01")
public class Employee {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
 
    @Column(name = "firstname")
    private String firstName;
 
    @Column(name = "lastname")
    private String lastName;
     
    @Column(name = "department")
    private String department;
     
    @Column(name = "phonenumber")
    private String phoneNumber;
//Default constructor
//Parameterised Constructor
//Generate Getters & setters

	public Employee() {
		super();
	}
public Employee(String firstName, String lastName, String department, String phoneNumber) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.department = department;
	this.phoneNumber = phoneNumber;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
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
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
    
    
}