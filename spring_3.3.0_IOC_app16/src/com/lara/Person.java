package com.lara;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;
public class Person implements InitializingBean,DisposableBean
{
	Person()
	{
		System.out.println("Person()");
		
	}
private String FirstName;
private String LastName;
private int Age;
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
public void destroy() throws Exception
{
System.out.println("destroy()");
}
public void afterPropertiesSet() throws Exception
{
	System.out.println("afterPropertiesSet()");
}
}
