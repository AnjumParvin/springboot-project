package com.StudentRegisteration.model;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity
@Table
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private  Integer id;
private String firstname;
private String lastname;
private String email ;
private String address;
private String  student_standerd;
private String  parent;
private String parent_name;
private String parent_mobile;
private String parent_email ;
private String city_pin_code  ;
public Student(Integer id, String firstname, String lastname, String email, String address, String student_standerd,
		String parent, String parent_name, String parent_mobile, String parent_email, String city_pin_code) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.address = address;
	this.student_standerd = student_standerd;
	this.parent = parent;
	this.parent_name = parent_name;
	this.parent_mobile = parent_mobile;
	this.parent_email = parent_email;
	this.city_pin_code = city_pin_code;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getStudent_standerd() {
	return student_standerd;
}
public void setStudent_standerd(String student_standerd) {
	this.student_standerd = student_standerd;
}
public String getParent() {
	return parent;
}
public void setParent(String parent) {
	this.parent = parent;
}
public String getParent_name() {
	return parent_name;
}
public void setParent_name(String parent_name) {
	this.parent_name = parent_name;
}
public String getParent_mobile() {
	return parent_mobile;
}
public void setParent_mobile(String parent_mobile) {
	this.parent_mobile = parent_mobile;
}
public String getParent_email() {
	return parent_email;
}
public void setParent_email(String parent_email) {
	this.parent_email = parent_email;
}
public String getCity_pin_code() {
	return city_pin_code;
}
public void setCity_pin_code(String city_pin_code) {
	this.city_pin_code = city_pin_code;
}

}
