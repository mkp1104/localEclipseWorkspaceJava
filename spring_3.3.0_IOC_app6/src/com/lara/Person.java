package com.lara;
import java.util.Set;
import java.util.Map;
import java.util.Properties;
import java.util.List;
public class Person
{
private String firstName;
private String lastName;
private int age;
private Address permanentAdress;
private List MobileNo;
private Map Educations;
private Set LoverNames;
private Properties projects;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Address getPermanentAdress() {
	return permanentAdress;
}
public void setPermanentAdress(Address permanentAdress) {
	this.permanentAdress = permanentAdress;
}
public List getMobileNo() {
	return MobileNo;
}
public void setMobileNo(List mobileNo) {
	MobileNo = mobileNo;
}
public Map getEducations() {
	return Educations;
}
public void setEducations(Map educations) {
	Educations = educations;
}
public Set getLoverNames() {
	return LoverNames;
}
public void setLoverNames(Set loverNames) {
	LoverNames = loverNames;
}
public Properties getProjects() {
	return projects;
}
public void setProjects(Properties projects) {
	this.projects = projects;
}

}
