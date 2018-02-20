package com.lara;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;

public class Person implements InitializingBean,DisposableBean 
{
private String firstName;
private String lastName;
private int	age;
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
public void afterPropertiesSet() throws Exception
{
System.out.println("afterPropertiesSet");	
}
public void destroy() throws Exception
{
System.out.println("destroy");	
}
}
