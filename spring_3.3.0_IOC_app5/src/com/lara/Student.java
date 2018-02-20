package com.lara;
import java.util.List;
public class Student 
{
private String firstName;
private String lastName;
private int age;
private Double weight;
private List mail;
public Student()
{
	System.out.println("student()");
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Double getWeight() {
	return weight;
}
public void setWeight(Double weight) {
	this.weight = weight;
}
public List getMail() {
	return mail;
}
public void setMail(List mail) {
	this.mail = mail;
}

}
